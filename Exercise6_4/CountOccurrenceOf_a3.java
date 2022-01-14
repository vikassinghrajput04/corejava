package Exercise6_4;

public class CountOccurrenceOf_a3 {
	public static void main(String[] args) {
		String s1 = "Vijay Dinanath Chouhan";
		char ch[] = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			if (ch[i] == 'a') {
				System.out.println(ch[i] + " " + i);
			}
		}

	}

}
