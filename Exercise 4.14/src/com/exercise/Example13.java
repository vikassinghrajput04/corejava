package com.exercise;

public class Example13 {

	
	public static void main(String[] args) {
		int num = 10;
        double result = 0.0;
 
        System.out.println("The harmonic series is: ");
 
        
        while (num > 0) {
 
        
            result = result + (double)1 / num;
 
        
            num--;
            System.out.print(result + ", ");
        }

	}

}
