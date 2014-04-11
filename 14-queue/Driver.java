public class Driver{
    public static void main(String[]args){
	String s;
	Queue n = new Queue();
	System.out.println(n);
	n.nQ("first");
	System.out.println(n);
	n.nQ("second");
	System.out.println(n);
	n.nQ("third");
	System.out.println(n);
	s = n.dQ();
	System.out.println(s + "   |   " + n);
	s = n.dQ();
	System.out.println(s + "   |   " + n);
	s = n.dQ();
	System.out.println(s + "   |   " + n);
	s = n.dQ();
	System.out.println(s + "   |   " + n);
    }
}