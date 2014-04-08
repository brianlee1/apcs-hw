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
    stack.push(stack.pop() + stack.pop());
  }
  
  public void subtract(){
    if (stack.size() < 2){
      return;
    }
    stack.push(stack.pop() - stack.pop());
  }
  
  public void multiply(){
    if (stack.size() < 2){
      return;
    }
    stack.push(stack.pop() * stack.pop());
  }
  
  public void divide(){
    if (stack.size() < 2){
      return;
    }
    stack.push(stack.pop() / stack.pop());
  }
  
  //will do main function later
}
