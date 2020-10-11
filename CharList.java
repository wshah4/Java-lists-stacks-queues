public class CharList implements CharListable {

    private Node head;
    private Node tail;

    public void addToHead(char data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void addToTail(char data) {
    	Node newNode = new Node(data);
    	if(isEmpty()){
    		head = newNode;
    		tail = newNode;
    	}else {
    		tail.next = newNode;
    		newNode.prev = tail;
    		tail = newNode;
    	}
    }

    public char remove() {
      if(isEmpty()){
    	  throw new IllegalStateException("This is an exception because there is an empty list");
      }else{
          Node temp = head;
    	  head = head.next;
    	  return temp.data;
      }
    }
    
    public boolean isEmpty() {
    	if(head == null) {
            return true;
    	}
        return false;
    }

    public int size() {
		int count = 0;
		for(Node node = head; node != null; node = node.next ) {
			count ++;
		}
    	return count;
    	
    }
    
    public Node partition(Node l, Node h) {
    	char x = h.data;
    	Node i = l.prev;
    	
    	for(Node j=l; j !=h; j= j.next) {
    		if(j.data <= x) {
    			i = (i==null) ? l : i.next;
    			char temp = i.data;
    			i.data = j.data;
    			j.data = temp;
    		}
    	}
    	i = (i==null) ? l : i.next;  // Similar to i++ 
        char temp = i.data; 
        i.data = h.data; 
        h.data = temp; 
        return i;

    }

    void quickSort(Node l,Node h) 
    { 
        if(h!=null && l!=h && l!=h.next){ 
            Node temp = partition(l,h); 
            quickSort(l,temp.prev); 
            quickSort(temp.next,h); 
        } 
    }
    
    public void sort() {
    	quickSort(head, tail);
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

    /** Node class definition (inner class) **/

    private class Node {

        private Node prev;
        private Node next;
        private char data;

        private Node(char data) {
            this.data = data;
        }
    }
}