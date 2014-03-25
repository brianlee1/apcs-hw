import java.util.*;
import java.io.*;


public class myLLIterator<Node> implements Iterator<String>{
    private Node currentNode;
    
    public myLLIterator<Node>(Node n){
	currentNode = n;
    }
    
    public boolean hasNext(){
	return false;
    }
    public Node next(){
	return null;
    }
    public void remove(){

    }

}