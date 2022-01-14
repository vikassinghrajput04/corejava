package Exercise4_14;

public class RandomOf5integerNumber_3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println( "5 random integer number....." +(int) (Math.random() * 100) );
		}
	}

}
