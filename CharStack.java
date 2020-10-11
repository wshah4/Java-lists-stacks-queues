public class CharStack implements CharStackable {
	
    CharList cl;
    public CharStack() {
    	cl = new CharList();
    }
	
	public void push(char data) {
    	cl.addToHead(data);
    }

    public char pop() {
    	return cl.remove();
    }
    
    public char top() {
    	char r = cl.remove();
    	cl.addToHead(r);
    	return r;
    }

    public boolean isEmpty() {
    	return cl.isEmpty();
    }

    public int size() {
		return cl.size();
    }
    
    public String toString() {
    	return cl.toString();
    }
}
