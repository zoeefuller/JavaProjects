package hangman;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays.*;

public class Hangman {

	public static void main(String[] args) {
		String[] word = {"string","boolean","double","algorithm", "loop","statement","array","computer","agile","integer", 
				"execute","input","console","operator","stack", "output", "function", "variable", "object", "class"};
		Random rand = new Random();
		int ranNum = rand.nextInt(20);
		System.out.println(ranNum);
		
		String compWord = word[ranNum];
		System.out.println(compWord);
		
		char[] temp = new char [compWord.length()];
		Arrays.fill(temp, '-');
		String blank = new String (temp);
		System.out.println(blank);
		
		int maxGuess = 20;
		int guess = 0;
		
		System.out.println("Lets play hangman! Try to guess the below word:");
		System.out.println(blank);
		
		while(guess<maxGuess) {
			System.out.println("Take a guess! You have "+(maxGuess-guess)+" guesses!");
			 Scanner input = new Scanner(System.in);
			 String letter = input.nextLine();
			 guess++;
			 boolean charFound = false;
			 
			 for(int i=0; i<compWord.length();i++) {
				 if(compWord.charAt(i) == letter.charAt(0)) {
					String fill = blank.substring(0,i)+letter+blank.substring(i+1);
					blank = fill;
					charFound = true; 
					System.out.println(blank);
				 }
			 }
			if (charFound == false) {
				System.out.println("Letter not in word!");
			}
			if (blank.equals(compWord)) {
				System.out.println("You guessed it!");
				break;
			}
			if (guess == maxGuess) {
				System.out.println("You ran out of guesses the word was "+compWord);
			}
		input.close();	
		}		
	}
}
