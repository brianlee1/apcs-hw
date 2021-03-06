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

    public void setRight(treeNode n){
	right = n;
    }

    public void setLeft(treeNode n){
	left = n;
    }

    public treeNode getRight(){
	return right;
    }

    public treeNode getLeft(){
	return left;
    }

    public String toString(){
	return "" + String.valueOf(data);
    }
}
