package ajinkya_phadke;

public class pattern1 {
	
	public static void main(String[] args) {

		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= r; c++) {

				System.out.print("* ");
			}

			System.out.println();

		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		char ch = 'A';
		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= r; c++) {
				System.out.print(ch + " ");
			}

			System.out.println();
			ch++;
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
}


