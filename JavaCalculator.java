public class Calculator {
	
	public static void main(String[] args) {
		
		System.out.println("Calcalations avaliable: \n+ add \n- Subtract \n* multiply \n/ divide \n^ Square \n ** power of");
		System.out.println("Please input your calculation:  ");
				
		Scanner sc = new Scanner (System.in);
		String calculation = sc.nextLine();
		
		sc = new Scanner(calculation);
		ArrayList <String> items = new ArrayList <>();
		
		while (sc.hasNext()) {
			String temp = sc.next();
			items.add(temp); 
		}
		
		String operator = items.get(1); 
		
		if (items.size()==2 || items.size()==3) {
			
			int num1 = Integer.parseInt(items.get(0));
			
			int num2 = 0;
			if (items.size() == 3) {
				num2 = Integer.parseInt(items.get(2));
			}
			
			if(operator.equals("+")){
				int result = num1 + num2;
				System.out.println("The answer is "+result);
			
			} else if(operator.equals("-")){
				int result = num1 - num2;
				System.out.println("The answer is "+result);
			
			} else if (operator.equals("*")){
				int result = num1 * num2;
				System.out.println("The answer is "+result);
				
			}else if(operator.equals("/")) {
				int result = num1 / num2;
				System.out.println("The answer is "+result);
				
			}else if (operator.equals("^")){ 
				int result = num1*num1;
				System.out.println("The answer is " + result);
								
			}else if (operator.equals("**")) {
				int temp = num1; 
				for (int i=0; i<num2-1; i++) {
				temp = temp*num1; 
				}
				System.out.println("The answer is " + temp);					
			}else {
				System.out.println("ERROR: please try again.  ");
			}
		} else {
			System.out.println("ERROR: please try again.  ");
		}
		
	
	}
	
}
