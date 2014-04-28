public class treeNode{
    private int data;
    private treeNode left, right;
    
    public treeNode(int i){
	data = i;
	right = null;
	left = null;
    }

    public void setData(int i){
	data = i;
    }

    public int getData(){
	return data;
    }

    public void setRight(Node n){
	right = n;
    }

    public void setLeft(Node n){
	left = n;
    }

    public void getRight(){
	return right;
    }

    public void getLeft(){
	return left;
    }

    public String toString(){
	return "" + data;
    }
}
