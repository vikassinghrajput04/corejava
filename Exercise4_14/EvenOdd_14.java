package Exercise4_14;

public class EvenOdd_14 {
	public static void main(String[] args) {
		int sum = 0;
		int total = 0;
		System.out.print("This is seris odd number   ");
		for (int i = 1; i <= 10; i += 2) {
			System.out.print(i);
			total = total + 1;

			sum = sum + i;

		}
		System.out.println("total sum" + sum);
		System.out.println(sum / total);

	}

}
