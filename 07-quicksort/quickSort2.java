import java.util.*;
import java.io.*;

public class quickSort2{
    static Random r = new Random();
    public static int part(int[]n, int L, int R){
	int piv = r.nextInt(n.length - 1) + 1;
	int m = n[R];
	int pivot = n[piv];
	int wall = 1;
        n[R] = pivot;
	n[piv] = m;
	for (int i = L; i < R; i++){
	    if (n[i] < pivot){
		R = n[wall];
		n[wall] = n[i];
		n[i] = m;
		wall++;
	    }
	}
	m = n[wall];
	n[wall] = pivot;
	n[R] = m;
	return wall;
    }

    public static void quickSort(int[]n, int L, int R){
	if (n.length < 2){
	}
	else{
	    int x = part(n, L, R);
	    if (x - 1 > L){
		quickSort(n, L, x - 1);
	    }
	    if (x + 1 < R){
		quickSort(n, x + 1, R);
	    }
	}
    }
	
    public static void main(String[]args){
	int[] test = new int[20];
	for (int i = 0; i < test.length; i++){
	    test[i] = r.nextInt(30);
	}
	for (int i = 0; i < test.length; i++){
	    System.out.print(test[i] + " ");
	}
	quickSort(test);
	for (int i = 0; i < test.length; i++){
	    System.out.print(test[i] + " ");
	}
    }

    public static void quickSort(int[] n){
	quickSort(n, 0, n.length - 1);
    }
}
       

