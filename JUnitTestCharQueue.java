import junit.framework.TestCase;

public class JUnitTestCharQueue extends TestCase {


	public void testCharQueue() {
		CharQueue l1 = new CharQueue();
        assertTrue("Test1.1", l1.toString().equals("{}") );
        assertTrue("Test1.2", l1.isEmpty()==true);
        assertTrue("Test1.3", l1.size()==0);
	}

	public void testEnqueue() {
		CharQueue l1 = new CharQueue();
        l1.enqueue('h');
        assertTrue("Test2.1", l1.toString().equals("{h}") );
        assertTrue("Test2.2", l1.isEmpty()==false);
        assertTrue("Test2.3", l1.size()==1);
	}

	public void testDequeue() {
		CharQueue l1 = new CharQueue();
		l1.enqueue('f');
		l1.enqueue('i');
		l1.enqueue('r');
		l1.enqueue('e');
		char test = l1.dequeue();
		assertTrue("Test4", test ==('f'));
	}

	public void testFirst() {
        CharQueue l1 = new CharQueue();
		l1.enqueue('f');
		l1.enqueue('i');
		l1.enqueue('r');
		l1.enqueue('e');
		assertTrue("Test4", l1.first() == ('f'));
	}

	public void testIsEmpty() {
        CharQueue l1 = new CharQueue();
        assertTrue(l1.isEmpty() == true);
	}

	public void testSize() {
        CharQueue l1 = new CharQueue();
		l1.enqueue('f');
		l1.enqueue('i');
		l1.enqueue('r');
		l1.enqueue('e');
		assertTrue(l1.size() == 4);
	}

	public void testToString() {
        CharQueue l1 = new CharQueue();
		l1.enqueue('f');
		l1.enqueue('i');
		l1.enqueue('r');
		l1.enqueue('e');
		assertTrue("Test4", l1.toString().contentEquals("{f,i,r,e}"));
	}

}
