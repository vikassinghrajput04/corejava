package Exercise4_14;

public class Factorial4 {
	public static void main(String[] args) {

		int a = 4;
		int fact = 1;
		for (int i = a; i >= 1; i--) {

			fact = fact * i;
		}
		System.out.println("Factorial of a given number........"+fact);

	}

}
