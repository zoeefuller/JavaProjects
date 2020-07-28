package hangman;

public class LinkedList {
	private Node head;
	private Node tail; 
	private int size; 
	
	public LinkedList(int data){
		head = new Node(data);
		tail = head;
		size = 1;
	}
	
	public int getSize() {
		return size;
	}
	
	public Node getHead() {
		return head;
	}
	
	public void addItem(int data) {
		Node temp = new Node(data);
		tail.setNext(temp);
		tail = temp;
		size ++;
	}
	
	public void deleteItem(int data) {
		boolean found = false;
		Node current = head;
		Node previous = null;
		
		while(found == false) {
			if (current.getData() == data) {
				if (previous == null) {
					head = head.getNext();
				}else {
					previous.setNext(current.getNext());
					
				}
				found = true;
				size--;
			}else {
				previous = current;
				current = current.getNext();
				
			}
		}		
	}
	
	public void insertItem(int data, int prevData) {
		Node temp = new Node(data);
		boolean found = false;
		Node current = head;
		Node previous = null;
		
		while(found == false) {
			if(current.getData() == prevData) {
				if (previous == null) {
					temp.setNext(head);
					head = temp;
				}else { 
					temp.setNext(current.getNext());
					current.setNext(temp);
				}
				found = true;
				size++;
				
			}else { 
				previous = current;
				current = current.getNext();
			}
		}
	}
	
	public int index(int index) {
		Node temp = head;
		if(index>size-1|| index<0) {
			System.out.println("Error");
			return -1;
		}
		for(int i = 0; i<index;i++) {
			temp = temp.getNext();		
		}
		
		return temp.getData();
		
	}
	
	public int search (int data) {
		Node temp = head;
		boolean found = false;
		int i = 0;
		for(i = 0; i<size; i++) {
			if (temp.getData() == data) {
				found = true;
				break;
			}else {
				temp = temp.getNext();				
			}
		}
		if (found) {
			i = -1;
			System.out.println("Error");
		}
		return i;
	}
}
