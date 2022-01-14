package Exercise4_14;

public class SecondLargest1_6 {
	public static void main(String[] args) {
		int[] a = { 72, 4, 7, 8898, 9, 34, 56, 98, 67 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {

					temp = a[j];
					a[j] = a[i];
					a[i] = temp;

				}

			}

		}
		int num = a.length - 3;
		System.out.println(a[num]);

		
	}
}
