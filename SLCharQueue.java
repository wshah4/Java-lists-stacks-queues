public class SLCharQueue {
	
	SLCharList sl;
	
	public SLCharQueue() {
		sl = new SLCharList();
	}
	
	public void enqueue(char data) {
		sl.addToTail(data);
	}
	
	public char dequeue() {
		return sl.remove();
	}
	
    public char first () {
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
