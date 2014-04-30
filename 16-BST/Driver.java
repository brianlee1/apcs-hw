public class Driver{
    public static void main(String[]args){
	bst n = new bst();
	n.insert(20);
	n.insert(10);
	n.insert(15);
	n.insert(30);
	n.insert(25);
	for (int i = 17; i < 24; i++){
	    n.insert(i);
	}
	n.print(n.search(20));
    }
}