package Rushikesh_15_11_2022;

public class data {
	
	public static void main(String[] args) {
		
		int[] arr= {10,2,3,4,5,9,7,8};
		
		int n=23;
		
		finddata(arr,n);
		
	}
	
	public static void finddata(int[] arr,int n) {
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=arr[i];
			
			for(int j=i+1;j<arr.length;j++) {
				sum=sum+arr[j];
				if(sum==n) {
					for(int k=i;k<=j;k++) {
						System.out.print(arr[k]);
						
					}
					
					System.out.print("="+n);
				}
				
				else if(sum > n) {
					break;
				}
			}
		}
		
	}
	
	

}
