package Exercise4_14;

public class ArmstrongNumber_10 {

	public static void main(String[] args) {

		int num = 407;
		int c = 0;
		int r;
		int s = 0;
		c = num;

		while (c != 0) {
			r = c % 10;
			s = s + (r * r * r);
			c = c / 10;

		}
		if (s == num) {
			System.out.println("given number is Armstrong number");

		} else {
			System.out.println("given number is not Armstrong number");
		}
	}
}
