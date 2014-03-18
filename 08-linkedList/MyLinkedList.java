public class MyLinkedList{
    private Node head;
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
}