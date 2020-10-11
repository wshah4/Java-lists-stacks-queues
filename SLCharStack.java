public class SLCharStack{
	
    SLCharList sl;
    public SLCharStack() {
    	sl = new SLCharList();
    }
	
	public void push(char data) {
    	sl.addToHead(data);
    }

    public char pop() {
    	return sl.remove();
    }
    
    public char top() {
    	char r = sl.remove();
    	sl.addToHead(r);
    	return r;
    }

    public boolean isEmpty() {
    	return sl.isEmpty();
    }

    public int size() {
		return sl.size();
    }
    
    public String toString() {
    	return sl.toString();
    }
}
