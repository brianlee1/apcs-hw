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
	Node temp = head;
	while (temp.getNext() != null){
	    s = s + temp;
	    temp = temp.getNext();
	}
	return s;
    }

    public void add(int i, String s){
	Node addTemp = new Node(s);
	Node temp = head;
	for (int j = 0; j < i; j++){
	    temp = temp.getNext();
	}
	addTemp.setNext(temp.getNext());
	temp.setNext(addTemp);
	head = temp;
    }

    public String get(int i){
	Node temp = head;
	for (int j = 0; j < i; j++){
	    temp = temp.getNext();
	}
	return temp;

    }

    public String set(int i, String s){
	Node temp = head;
	for (int j < 0; j < i; j++){
	    temp = temp.getNext();
	}
	String x = temp.getData();
	temp.setData(s);
	return x;
    }

    public String remove(int i){
	Node temp = head;
	for (int j < 0; j < i - 1; j++){
	    temp = temp.getNext();
	}
	String x = temp.getNext().getData();
	temp.setNext(temp.getNext().getNext());
	return x;	
    }

    public int find(String s){
	for (int i = 0; i < length(); i++){
	    if (temp.getData().equals(s))
		return i;
	    temp = temp.getNext();
	}
	return -1;
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
