package Arraybasic;

public class aaaaa {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};// dynamic array
		int[]b=new int[10];//static array
		int c[]= {10,20,30,40};
		b[0]=1;
		b[1]=2;
		b[2]=4;
		b[3]=6;
		b[4]=8;
		b[5]=10;
		b[6]=12;
for (int i : c) {
	System.out.println(i);
}		
		for (int i : a) {
			System.out.print(" "+i);
	
		}
		for (int i : b) {
			System.out.print(" "+i);
			
		}
	}
	}