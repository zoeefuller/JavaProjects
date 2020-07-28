package hangman;

public class LinkTest {
	public static void main(String[] args) {
		LinkedList test = new LinkedList(1);
		
		test.addItem(2);
		test.addItem(4);
		test.addItem(5);
		test.addItem(6);
		
		Node temp = test.getHead();		
		for(int i = 0; i<test.getSize();i++) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
		
		test.insertItem(3, 2);
		
		temp = test.getHead();		
		for(int i = 0; i<test.getSize();i++) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
		
		test.deleteItem(6);
		
		temp = test.getHead();		
		for(int i = 0; i<test.getSize();i++) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		
		}
		
		System.out.println(test.index(4));
		
		
		System.out.println(test.search(3));
	}
}
