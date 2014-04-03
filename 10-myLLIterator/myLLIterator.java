import java.util.*;
import java.io.*;


public class myLLIterator<E> implements Iterator<E>{
    private Node<E> currentNode;
    
    public myLLIterator(Node<E> n){
	currentNode = n;
    }
    
    public boolean hasNext(){
	return currentNode != null;
    }
    public Node next(){
	E data = currentNode.getNext();
	currentNode = currentNode.getNext();
	return null;
    }
    public void remove(){

    }

}