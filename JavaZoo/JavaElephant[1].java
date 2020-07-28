import java.util.Random;

public class Elephant 
extends Animal
{ 
	private boolean tusks;
	private int dryness;
	private int temperature; 
	
	
	public Elephant(String Name) {
		Random ranGen = new Random();
		size = 10;
		hunger = 10;
		diet = "herbivore";
		naughtiness = 6;
		herdSize = 8;
		intelligence = 9;
		habitat = "savannah"; 
		cleanliness = 5;
		name = Name + " Elephant";
		energy = 10;
		boolean booGen = ranGen.nextBoolean();
		if (booGen == true) {
			gender = "female";
			tusks = false;
		}else {gender = "male";
			tusks = true;}
		strength = 10;
		age = 0;
		dryness = 0;
		temperature = 25;
	}
	
	@Override
	public int exercise() {
		int result = 10;
		if (energy>5&&hunger>=4) {
			energy = energy - 4;
			hunger = hunger - 4;
			temperature = temperature + 2;
			dryness = dryness + 1;
			result = size; 
			if (tusks = true) {
				result = result*2;
			} 
			System.out.println(name+" has exercised");
			System.out.println(name + " lost 4 energy");
			System.out.println(name + " lost 4 hunger");
			System.out.println(name + "'s temperature increased by 2");
			System.out.println(name + "'s dryness increased by 1");
			System.out.println(name+" has caused "+ result + " damage");
			
		}else {
			result = 0; 
			System.out.println(name+" did not exercise");
		}
		if(temperature>26) { 
			flapEars();	
		}
		if (temperature>30 || dryness>5) {
			bathe();
		}
		
		return result; 
		
	}
	@Override
	public int entertain() {
		int result = 10;
		if (intelligence>5&&hunger>=2) {
			energy = energy - 2;
			hunger = hunger - 2;
			temperature = temperature + 1;
			dryness = dryness + 5;
			result = naughtiness; 
			System.out.println(name+" has entertained themselves");
			System.out.println(name+" has caused "+ result + " damage");
			System.out.println(name + " lost 2 energy");
			System.out.println(name + " lost 2 hunger");
			System.out.println(name + "'s temperature increased by 1");
			System.out.println(name + "'s dryness increased by 1");
		}else { 
			result = 0;
			System.out.println(name+" did not entertain himself");
		}
		if(temperature>26) { 
			flapEars();	
		}
		if (temperature>30 || dryness>5) {
			bathe();
		}
		return result; 
	}
	
	public boolean bathe () {
		if (dryness>5 || temperature>30) {
			System.out.println(name+" has bathed");
			temperature = temperature - 4;
			System.out.println(name+"'s temperature is now " + temperature);
			dryness = 0;
			System.out.println(name+"'s dryness is now " + dryness);
			return true;
		}
		return false;
	}
	public boolean flapEars() {
		if (temperature>26) {
			System.out.println(name + " flapped their ears");
			temperature = temperature - 2;
			System.out.println(name+"'s temperature is now " + temperature);
			return true; 
		}
		return false;
	}
	public void environmentTemp (int temp) {
		temperature = temperature + temp;
	}
}
