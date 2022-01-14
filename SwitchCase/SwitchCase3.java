package SwitchCase;

public class SwitchCase3 {
	public static void main(String[] args) {
		int size = args.length;
		if (size == 0) {
			System.out.println("Hello");

		} else {
			for (int i = 0; i < size; i++) {
				System.out.println("  Hello " + args[i]);
			}
		}
	}
}
