import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String[]args){
	MyLinkedList2b L = new MyLinkedList2b();
	L.add("one");
	L.add("two");
	L.add("three");
	L.add("four");
	
	Iterator<String> it = L.iterator();
	while (it.hasNext()){
	    String x = i.next();
	    System.out.println(it.next());
	}
	for (String x2 : s){
	    System.out.println(x2);
	}
    }
}