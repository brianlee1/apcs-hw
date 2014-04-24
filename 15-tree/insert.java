public class insert{
    private treeNode toAdd, root;

    public void ins3rt(int x){
	toAdd.setData(x);
	treeNode p = root;
	while (p != null && p.getData() != x){
	    if (p.getData() > x){
		p = p.getLeft();
	    }
	    else 
		p = p.getRight();
	}
	