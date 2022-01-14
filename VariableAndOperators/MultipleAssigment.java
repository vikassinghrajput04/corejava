package VariableAndOperators;

public class MultipleAssigment {
	public static void main(String[] args) {
		int i = 0;
		System.out.println(++i + ++i + ++i + ++i + ++i + ++i);
						// 1      2    3     4     5      6
		System.out.println(  ++i + ++i + ++i + ++i + ++i + ++i);
							// 7    8     9     10     11   12
	}

}
