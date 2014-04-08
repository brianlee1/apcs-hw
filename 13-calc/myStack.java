public class myStack{

    private int numElements;
    private double[] stack;
    //constructor
    public myStack(){
	stack = new double[10];
	numElements = 0;
    }

    //push
    public void push(double s){
    	if (numElements == stack.length){
    		double[] temp = new double[stack.length * 2];
    		for (int i = 0; i < stack.length; i++){
    			temp[i] = stack[i];
    		}
    		stack = temp;
    	}
    	stack[numElements] = s;

	numElements++;
    }
    //pop
    public double pop(){
	numElements--;
	return stack[numElements + 1];
    }

    //peek
    public double peek(){
	return stack[numElements - 1];
    }
    //isEmpty
    public boolean isEmpty(){
	return numElements==0;
    }

    public int getSize(){
	return numElements;
    }

    //toString
    public String toString(){
	String tmp = "";

	for (int i = 0; i < numElements; i++){
	    tmp += stack[i]  + ", ";	
	}	
	return tmp;
    }
}
