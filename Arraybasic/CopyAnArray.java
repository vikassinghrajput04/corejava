package Arraybasic;

public class CopyAnArray {
	public static void main(String[] args) {
		char[] copyFrom = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
		char[] copyTo = new char[10];

		System.arraycopy(copyFrom, 3, copyTo, 0, 4);
		System.out.println(new String(copyTo));
		for (char c : copyTo) {
			System.out.println(c);
		}
	}
}