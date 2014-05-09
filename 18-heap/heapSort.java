import java.io.*;
import java.util.*;

public class heapSort{
    
    private ArrayList<Integer> h;

    public heapSort(){
	h = new ArrayList<Integer>();
    }

    public void add(int i){
	h.add(i);
    }

    public void sort(int index){
	if (h.get(index) < h.get(index * 2 + 1)){
	    int temp = h.get(index * 2 + 1);
	    h.set(index * 2 + 1, h.get(index));
	    h.set(index, temp);
	    
 