public class bst{
    private treeNode root;

	public bst(){
		root = null;
	}
	
    public treeNode search(int x){
	treeNode p = root;
	while (p != null){
		if (x > p.getData()){
			p = p.getRight();
		}
		else if(x < p.getData()){
			p = p.getLeft();
		}
		else{
			return p;
		}
	}
	return null;
    }
    
    public void insert(int x){
    	if (root == null){
    		root = new treeNode(x);
    		return;
    	}
    	treeNode p = root;
    	treeNode q = null;
    	while (p != null){
    		if (x < p.getData()){
    			q = p;
    			p = p.getLeft();
    	    	}
    	    	else{
    	    		q = p;
    	    		p = p.getRight();
    	    	}
    	    	
    	}
    	if (x < q.getData()){
    		q.setLeft(new treeNode(x));
    	}
    	else{
    		q.setRight(new treeNode(x));
    	}
    }
}
       
