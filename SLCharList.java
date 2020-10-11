public class SLCharList {
	
    private Node head;
    private Node tail;
	
    public void addToTail(char data) {
    	Node newNode = new Node(data);
    	if(isEmpty()) {
    		head = newNode;
    		tail = newNode;
    	}else {
    		tail.next = newNode;
    		tail = tail.next;
    	}
    }
    
    public void addToHead(char data) {
    	Node newNode = new Node(data);
    	if(isEmpty()) {
    		head = newNode;
    		tail = newNode;
    	}else {
    		newNode.next = head;
    		head = newNode;
    	}
    }
    
    public char remove() {
    	if(isEmpty()) {
    		throw new IllegalStateException("This is an exception because there is an empty list");
    	}
    	Node temp = head;
    	head = head.next;
    	return temp.data;
    }
    
    public boolean isEmpty() {
    	if(head == null) {
            return true;
    	}
    	return false;
    }
    
    public int size() {
    	if(isEmpty()) {
    		return 0;
    	}
    	int count = 0;
    	for(Node node = head; node != null; node = node.next) {
    		count ++;
    	}
    	return count;
    }
    
    public String toString() {
    	if (isEmpty()) return "{}";
        else {
            Node currentNode = head;
            String returnValue = "{" + currentNode.data;
            while (currentNode.next != null) { 
                currentNode = currentNode.next;
                returnValue += "," + currentNode.data;
            }
            returnValue += "}";
            return returnValue;
        }
    }
    
	private class Node {

        private Node next;
        private char data;

        private Node(char data) {
            this.data = data;
        }
    }
}
