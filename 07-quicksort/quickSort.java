import java.util.*;
import java.io.*;

public class quickSort{
    
    public static ArrayList<Integer> quickSort(ArrayList<Integer> n){
	
	Random r = new Random();
	ArrayList<Integer> x = new ArrayList<Integer>();
	ArrayList<Integer> y = new ArrayList<Integer>();
	ArrayList<Integer> ans = new ArrayList<Integer>();
	int a = 0;
	int b = 0;
	int c = 0;
	if (n.size() < 2){
	    return n;
	}
	int part = r.nextInt(n.size());
	for (int i = 0; i < n.size(); i++){
	    if(i == part){
	    }    
	    else if (n.get(i) < n.get(part))
		x.add(n.get(i));
	    else 
		y.add(n.get(i));
       	}
	ArrayList<Integer> j = quickSort(x);
	ArrayList<Integer> k = quickSort(y);
	for (int i = 0; i < j.size(); i++){
	    ans.add(j.get(i));
	}
	ans.add(n.get(part));
	for (int i = 0; i < k.size(); i++){
	    ans.add(k.get(i));
	}
	return ans;
    }

    public static void main(String[]args){
	ArrayList<Integer> m = new ArrayList<Integer>();
	Random f = new Random();
	for (int i = 0; i < 16; i++){
	    m.add(f.nextInt(30));
	}
	System.out.println(m);
	System.out.println(quickSort(m));
	
    }
}
