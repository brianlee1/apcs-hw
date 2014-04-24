public class bst{
    private treeNode root;

    public treeNode search(int x){
	treeNode p = root;
	while (p != null && p.getData() != x){
	    if (p.getData() > x){
		p = p.getLeft();
	    }
	    else 
		p = p.getRight();
	}
	return p;
    }
}
       