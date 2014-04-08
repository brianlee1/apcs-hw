import java.util.Scanner;

public class rpn{
    private myStack stack = new myStack();
  
    public void push(String s){
	double x = Double.parseDouble(s);
	stack.push(x);
    }
  
    public void add(){
	if (stack.getSize() < 2){
	    return;
	}
	else{
	    double x = stack.pop();
	    double y = stack.pop();
	    stack.push(x + y);
	}
    }
  
    public void subtract(){
	if (stack.getSize() < 2){
	    return;
	}
	stack.push(stack.pop() - stack.pop());
    }
  
    public void multiply(){
	if (stack.getSize() < 2){
	    return;
	}
	stack.push(stack.pop() * stack.pop());
    }
  
    public void divide(){
	if (stack.getSize() < 2){
	    return;
	}
	stack.push(stack.pop() / stack.pop());
    }
    
    public void op(String s){
	if (s.equals("+"))
	    this.add();
	if (s.equals("-"))
	    this.subtract();
	if (s.equals("*"))
	    this.multiply();
	if (s.equals("/"))
	    this.divide();
    }
    
    public String toString(){
	/* 
	   String s = "";
	for (int i = stack.getSize(); i > 0; i--){
	    s += stack.pop() + ", ";
	}
	return s;
	*/
	return stack.toString();
    }

    
    //will do main function later
    public static void main(String[]args){
	rpn n = new rpn();
	/*	Scanner sc = new Scanner(System.in);
	String s = sc;
	*/
	n.push("5");
	n.push("6");
	n.push("2");
	System.out.println(n);
	n.add();
	System.out.println(n);
    }
	
}
