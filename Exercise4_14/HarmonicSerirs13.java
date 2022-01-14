package Exercise4_14;

public class HarmonicSerirs13 {
	public static void main(String[] args) {
		int number = 5;
		double result = 0.0;
		while (number > 0) {

			result = result + (double) 1 / number;

			number--;
			System.out.print(result + ",");

		}
	}

}
