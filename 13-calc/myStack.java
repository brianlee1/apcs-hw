public class myStack{

    private Node top;
    private int numElements;
    //constructor
    public myStack(){
	top = null;
	numElements = 0;
    }

    //push
    public void push(String s){
	Node n = new Node(s);
	n.setNext(top);
	top = n;
	numElements++;
    }
    //pop
    public String pop(){
	String s;
	s = top.getData();
	top = top.getNext();
	numElements--;
	return s;
    }

    //peek
    public String peek(){
	return top.getData();
    }
    //isEmpty
    public boolean isEmpty(){
	return top == null;
    }

    public int getSize(){
	return numElements;
    }

    //toString
    public String toString(){
	String tmp = "";
	Node currentNode = top;
	while (currentNode != null){
	    tmp += currentNode.getData() + ", ";
	    currentNode = currentNode.getNext();
	}
	return tmp;
    }
}