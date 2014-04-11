public class arrayQueue{
    
    private String[10] q;
    private String head,tail;
    private int size;

    public arrayQueue(){
	head = "";
	tail = "";
    }

    public void nQ(String s){
	if (size == 0){
	    q[size] = s;
	    head = s;
	    tail = s;
	}
	if (size < 10 && size > 0){
	    q[size + 1] = s;
	    tail = q[size + 1];
	}
	else{
	    return;
	}
    }

    public String dQ(){
	String s;
	s = head;
	for (int i = 0; i < size; i++){
	    q[i] = q[i + 1];
	}
	return s;
    }

    public String front(){
	return head;
    }
}