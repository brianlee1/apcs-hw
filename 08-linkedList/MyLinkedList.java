public class MyLinkedList{
    private Node head;
    private int length = 0;
    
    public MyLinkedList(){
	head = null;
    }
    
    public void add(String s){
	Node temp = new Node(s);
	temp.setNext(head);
	head = temp;
    }
    
    public String toString(){
	String s;
	s = " " + head + head.getNext();
	return s;
    }

    public void add(int i, String s){
	Node addTemp = new Node(s);
	while (i > 0){
	    
		
    }

    public String get(int i){
	while (i > 0){
	    
    }

    public String set(int i, String s){
	
    }

    public String remove(int i){
	
    }

    public int find(String s){
	
    }

    public int length(){
	Node lengthTemp = head;
	while(lengthTemp.getNext() != null){
	    lengthTemp = lengthTemp.getNext();
	    length++;
	}
	return length;
    }
}