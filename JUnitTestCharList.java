import junit.framework.TestCase;

public class JUnitTestCharList extends TestCase {
	
	public void testCharList() {
        CharList l1 = new CharList();
        assertTrue("Test1.1", l1.toString().equals("{}") );
        assertTrue("Test1.2", l1.isEmpty()==true);
        assertTrue("Test1.3", l1.size()==0);
	}

	public void testAddToTail() {
        CharList l1 = new CharList();
        l1.addToTail('h');
        assertTrue("Test2.1", l1.toString().equals("{h}") );
        assertTrue("Test2.2", l1.isEmpty()==false);
        assertTrue("Test2.3", l1.size()==1);
	}
	public void testAddToHead() {
        CharList l1 = new CharList();
        l1.addToHead('h');
        l1.addToHead('e');
        l1.addToHead('l');
        l1.addToHead('l');
        l1.addToHead('o');
        assertTrue("Test3", l1.toString().equals("{o,l,l,e,h}") );
	}
	public void testRemove() {
        CharList l1 = new CharList();
		l1.addToTail('f');
		l1.addToTail('i');
		l1.addToTail('r');
		l1.addToTail('e');
		assertTrue("Test4", l1.remove()==('f'));
	}

	public void testIsEmpty() {
        CharList l1 = new CharList();
		assertTrue(l1.isEmpty());
	}

	public void testSize() {
        CharList l1 = new CharList();
        l1.addToHead('1');
        l1.addToHead('2');
        l1.addToTail('3');
        assertTrue(l1.size()==3);
	}

	public void testSort() {
        CharList l1 = new CharList();
        l1.addToHead('1');
        l1.addToTail('4');
        l1.addToTail('3');
        l1.addToTail('2');
        l1.sort();
        assertTrue(l1.toString().equals("{1,2,3,4}") );
	}

	public void testToString() {
        CharList l1 = new CharList();
        l1.addToTail('1');
        l1.addToTail('4');
        l1.addToTail('3');
        l1.addToTail('2');
        assertTrue(l1.toString().equals("{1,4,3,2}") );
	}
}
