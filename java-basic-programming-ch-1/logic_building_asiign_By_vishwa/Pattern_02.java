package logic_building_asiign_By_vishwa;

public class Pattern_02 {

	public static void main(String[] args) {

		for (int a = 5; a >= 1; a--) {

			for (int b = 1; b <= a; b++) {
				System.out.print("* ");
			}

			System.out.println();

		}

        char ch ='A';
		for (int c = 5; c >= 1; c--) {

			for (int d = 1; d <= c; d++) {
				System.out.print(ch+" ");
			}

			System.out.println();
			ch++;

		}

	}
}

