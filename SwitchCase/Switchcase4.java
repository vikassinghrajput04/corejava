package SwitchCase;

public class Switchcase4 {
	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);
		if (size == 0) {
			System.out.println("no input");

		} else {
			for (int i = 0; i <= size; i++) {
				System.out.println(i + "Hii" + args[i]);
			}

		}

	}
}
