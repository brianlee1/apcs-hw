public class Queue{
    
    private Node head;
    private Node tail;
    private int length;

    public Queue(){
	head = null;
	tail = null;
	length = 0;
    }

    public void nQ(String s){
	Node n = new Node(s);
	if (length == 0){
	    head = n;
	    tail = n;
	}
	else {
	    tail.setNext(n);
	    tail = n;
	}
	length++;
    }

    public String dQ(){
	String s;
	if (head == null){
	    return null; 
	}
	s = head.getData();
	head = head.getNext();
	length--;
	if (head == null){
	    tail = null;
	}
	return s;
    }

    public String front(){
	return head.getData();
    }
    
    public int size(){
	return length;
    }

    public String toString(){
	String s = "Head --> ";
	if (head == null){
	    s = s + "null -->";
	}
	Node temp = head;
	while (temp != null){
	    s = s + temp.getData() + " --> ";
	    temp = temp.getNext();
	}
	s = s.substring(0, s.length() - 4);
	s = s + " <-- tail";
	return s;
    }
	
    
}