import java.util.*;
import java.io.*;

public class MyLinkedList2b implements Iterable{
    private Node head;
    private int length;
    private Node tail;	
    
    //a little confused about tail

    public Iterator<Node> iterator(){
	Iterator<Node> it = new myLLIterator<Node>(head);
	return it;
    }
    
    public MyLinkedList2b(){
	head = new Node("dummy");
	tail = head;
    }
    
    public void add(String s){
	Node temp = new Node(s);
	tail.setNext(temp); 
	tail = temp;
	length++;
    }
    
    public String toString(){
	String s;
	Node temp = head.getNext();
	while (temp != null){
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
	length++;
    }

    public String get(int i){
	Node temp = head;
	for (int j = 0; j < i; j++){
	    temp = temp.getNext();
	}
	return temp.getData();

    }

    public String set(int i, String s){
	Node temp = head;
	for (int j = 0; j < i; j++){
	    temp = temp.getNext();
	}
	String x = temp.getData();
	temp.setData(s);
	return x;
    }

    public String remove(int i){
	Node temp = head;
	for (int j = 0; j < i - 1; j++){
	    temp = temp.getNext();
	}
	String x = temp.getNext().getData();
	temp.setNext(temp.getNext().getNext());
	length--;
	return x;	
    }

    public int find(String s){
	Node temp = head;
	for (int i = 0; i < length(); i++){
	    if (temp.getData().equals(s))
		return i;
	    temp = temp.getNext();
	}
	return -1;
    }

    public int length(){
/*	Node lengthTemp = head;
	while(lengthTemp.getNext() != null){
	    lengthTemp = lengthTemp.getNext();
	    length++;
	}
	*/
	return length;
    }
}
