package com.exercise;

public class Example6 {
	public static void main(String[] args) {
		int sum, n, temp;
		sum = 0;
		n = 100;

		while (n < 200) {
			temp = n % 7;
			if (temp == 0) {
				sum = sum + n;
				System.out.println(n);
			}
			n++;
		}
		System.out.println("sum of all integers greater than 100 and less than 200 that are dvisible by 7 is "+sum);
	}
}
