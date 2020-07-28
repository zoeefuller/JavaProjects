import java.util.Random;

public class Animal {
	
	protected int size;
	protected int hunger;
	protected String diet; 
	protected int naughtiness; 
	protected static int herdSize;
	protected int intelligence;
	protected String habitat;
	protected int cleanliness;
	protected String name;
	protected int energy; 
	protected String gender; 
	protected int strength;
	protected int age; 
	
	public Animal() {
		Random ranGen = new Random();
		size = 0;
		hunger = 0;
		diet = "";
		naughtiness = 0;
		herdSize = 0;
		intelligence = 0;
		habitat = ""; 
		cleanliness = 0;
		name = "";
		energy = 0;
		boolean booGen = ranGen.nextBoolean();
		if (booGen == true) {
			gender = "female";
		}else {gender = "male";}
		strength = 0;
		age = 0;
		
	}
	
	public int feed() {
		int result = 10;
		if (hunger<5) {
			result = result - hunger;
			hunger = 10;
			System.out.println(name+" has been fed");
			System.out.println(name+" has eaten "+ result);
		} else {
			result = 0;			
		}
		return result;
		
	}
	
	public int exercise() {
		int result = 10;
		if (energy>5) {
			energy = energy - 4;
			result = size; 
			System.out.println(name+" has exercised");
			System.out.println(name+" has caused "+ result + " damage");
			
		}else {
			result = 0; 
		}
		return result; 
	}
	
	public int entertain() {
		int result = 10;
		if (intelligence>5) {
			energy = energy - 2;
			result = naughtiness; 
			System.out.println(name+" has entertained themselves");
			System.out.println(name+" has caused "+ result + " damage");
		}else { 
			result = 0;
		}
		return result; 
	
	}
	
	public void sleep() {
		if (energy<5) {
			energy = 10;
			System.out.println(name+" has slept");
	
		}
	}
	
	public boolean escape() {
		Random rand = new Random();
		boolean result = false;
		int escape = rand.nextInt(10);
		if (naughtiness>escape) {
		escape = rand.nextInt(10);
		if (intelligence>escape) {
			System.out.println(name+" has escaped! :O");
			return true;
		}
		}else {
			return false;
		}
		return result;	
	
	}
	
	public boolean breeding() {
		if (age>3) {
			System.out.println(name+" is old enough to breed");
		}
		if (gender.contains("female")||gender.contains("male")) {
			return true;						
		}else {
			return false;	
		}

	}public String getgender() { 
		return gender;
		
	}	
}
