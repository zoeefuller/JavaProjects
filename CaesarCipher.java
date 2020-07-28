package java_week1;

import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class CaesarCipher {
	public static StringBuffer encryption (StringBuffer message, int shift) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i<message.length(); i++) {
			if (message.charAt(i) != ' ') {
				if(Character.isUpperCase(message.charAt(i))) {
				char ch = (char)(((int)message.charAt(i) + shift - 65) %26 +65);
				result.append(ch);
				}
				else {
				char ch = (char)(((int)message.charAt(i) + 
                        shift - 97) % 26 + 97); 
				result.append(ch); 
				}
			}else {
				result.append(' ');			
			}
		}
		return result;
	}
	
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input your message");
		String message = sc.nextLine();
		
		StringBuffer sbMessage = new StringBuffer(message);
		
		System.out.println("Please input your shift");
		int shift = sc.nextInt();
		
		
		StringBuffer encrypMessage = encryption(sbMessage, shift);
		System.out.println(encrypMessage);
		
		int decrypShift = 26 - shift;
		
		StringBuffer decrypMessage = encryption(encrypMessage, decrypShift);
		System.out.println(decrypMessage);
		
		sc.close();
	}
}

