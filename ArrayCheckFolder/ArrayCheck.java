package java_week1;

import java.util.*;


public class ArrayCheck {
	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Press the enter when you wish to stop");
		String input = "y";
		
		ThreadClass tc = new ThreadClass();
				 
        Thread t = new Thread(tc);
        t.start();
        
        while(!input.isEmpty()) {
        	input = sc.nextLine();
        	if (input.isEmpty()) {
        		t.stop();
        	}
        }
        sc.close();
	}	
}
