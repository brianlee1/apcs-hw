import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String[]args){
	MyLinkedList2b L = new MyLinkedList2b();
	L.add("one");
	L.add("two");
	L.add("three");
	
	Iterator<String> it = L.iterator();
	while (it.hasNext())
	    System.out.println(it.next());
	
    }
}