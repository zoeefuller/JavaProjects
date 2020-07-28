package java_week1;

import java.util.*;

public class Fibonacci {
	
	public static void main(String[]args) {
		long previous1 = 1;
		long previous2 = 0;
		long fibonacciList[] = new long[52];
		
		fibonacciList[0] = 0;
		fibonacciList[1]= 1;
		
		for(int i = 2; i<52; i++) {
			long value = previous1 + previous2;
			fibonacciList[i] = value;
			previous2=previous1;
			previous1 = value;
		}
		for(long i: fibonacciList) {
			System.out.println(i);
		}
		
		System.out.println("Please pick a number between 1 and 50");
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		System.out.println("The Fibonacci number is: "+ fibonacciList[input]);
		
		sc.close();
						
	}
	
	
	
	

}
