package Exercise4_14;

public class TwoDimensionalArrayTable8 {

	public static void main(String[] args) {

		int[][] a = new int[10][20];

		for (int i = 0; i < a.length; i++) {
			for (int j = 2; j <= a[i].length; j++) {

				System.out.print((i + 1) * j + "\t");
				System.out.print("   ");
			}
			System.out.println(" ");
		}

		/*
		 * int[][] t=new int [10][1]; for (int i = 0; i < t.length; i++) { for (int j =
		 * 0; j < t[i].length; j++) { System.out.println((i+1)*2);
		 * 
		 * }
		 * 
		 * }
		 */

	}

}
