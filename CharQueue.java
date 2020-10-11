public class CharQueue implements CharQueueable{

	CharList cl;
	public CharQueue() {
		cl = new CharList();
	}
	
    public void enqueue(char data) {
    	cl.addToTail(data);
    }

    public char dequeue() {
    	return cl.remove();
    }
 
    public char first() {
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
