package VariableAndOperators;

public class PreOrPostIncrement {
	public static void main(String[] args) {
		int i = 0;
		//System.out.println(i++ + i++ + i++ + i++ + i++);// 0 1 2 3 4
		//System.out.println( ++i + i++ + ++i + ++i + i++ + ++i  );//1 1 3 4 4 6
		System.out.println(i++ + ++i + i++ +i++ + i++ + i++);// 0 1 3 3 4 5
	}

}
