package hangman;
import java.util.Random;
import java.util.Scanner;


public class GameOfNim {
	public static void main(String[] args) {
		
		System.out.println("Let's play gam of nim!");
		
		Random r = new Random();
		int ranNum = r.nextInt((30 - 20) + 1) + 20;
		
		System.out.println("The starting number is "+ ranNum);
		
		System.out.println("I will randomly generate who goes first");
		
		Random rand = new Random();
		int order = rand.nextInt(2);
		
		int newNum = ranNum;
		int lastPlay=0;
		
		if (order == 0) {
			System.out.println("I will go first");
		}
		else if (order == 1) {
			System.out.println("You can go first");
		}
		
		while (newNum>0) {
			
			if (order == 0) {
				
				newNum = comp_input(newNum);
				lastPlay = 1;
				if (newNum <=0) {
					break;
				}
				newNum = user_input(newNum);
				lastPlay = 2;
			}
			if (order == 1) {
				System.out.println("You can go first");
				newNum = user_input(newNum);
				lastPlay = 2;
				if (newNum <= 0) {
					break;
				}
				newNum = comp_input(newNum);
				lastPlay = 1;
			}
			
		}
		
		if(lastPlay == 1) {
			System.out.println("You win!");
		}
		else if(lastPlay == 2) {
			System.out.println("I win!");
		}
	
	}
	
	public static int user_input(int newNum) {
		System.out.println("Please input your number");
		Scanner input = new Scanner(System.in);
		int userNum = input.nextInt();
		
		if (userNum >3 || userNum<0) {
			System.out.println("Error please enter a number betwen 1 and 3");
			user_input(newNum);
		}
		
		newNum = newNum - userNum;
		return newNum;
	}
	
	public static int comp_input(int newNum) {
		System.out.println("My turn..");
		int compNum = 0;
		if (newNum < 5) {
			int winNum = newNum - 1;
			compNum = winNum;
			System.out.println("My number is "+ compNum);			
			}
		if (compNum <1) {
			compNum=1;
			System.out.println("My number is "+ compNum);
		}else {
			if(newNum%3 == 2) {
				compNum =3;
				System.out.println("My number is "+ compNum);
			}
			if(newNum%3 == 1) {
				compNum = 2;
				System.out.println("My number is "+ compNum);
			}
			if(newNum%3 == 0) {
				compNum = 1;
				System.out.println("My number is "+ compNum);
			}
			
		}
		newNum = newNum - compNum;
		System.out.println("New total is "+ newNum);
		return newNum;
		
	}
}
