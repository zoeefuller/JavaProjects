package hangman;

public class BubbleSort {
	public static void main(String[] args) {
	
	int[] numArray = {8,2,5,9,10,6,7,1,4,3};
		
	boolean sorted = true;
	
	while (sorted == true) {
		sorted = false;
		for(int i = 0; i<numArray.length; i++) {
			if (i == numArray.length-1) {
				break;
			}
			if(numArray[i]>numArray[i+1]) {
				int temp = numArray[i];
				numArray[i] = numArray[i+1];
				numArray[i+1]=temp;
				sorted = true;
			}
		}
		
	}
	for(int index:numArray) {
		System.out.println(index);
	}
	
}	
}
