import junit.framework.TestCase;

public class JUnitTestCharStack extends TestCase {

	public void testCharStack() {
		CharStack l1 = new CharStack();
		assertTrue("Test1.1", l1.toString().equals("{}") );
        assertTrue("Test1.2", l1.isEmpty()==true);
        assertTrue("Test1.3", l1.size()==0);
	}

	public void testPush() {
		CharStack l1 = new CharStack();
		l1.push('1');
		l1.push('3');
		l1.push('2');
		assertTrue(l1.toString().equals("{2,3,1}"));
	}

	public void testPop() {
		CharStack l1 = new CharStack();
		l1.push('1');
		l1.push('3');
		l1.push('2');
		assertTrue(l1.pop()==('2'));
	}

	public void testTop() {
		CharStack l1 = new CharStack();
		l1.push('1');
		l1.push('3');
		l1.push('5');
		assertTrue(l1.top()==('5'));
	}

	public void testIsEmpty() {
		CharStack l1 = new CharStack();
		assertTrue(l1.isEmpty() == true);
	}

	public void testSize() {
		CharStack l1 = new CharStack();
		l1.push('1');
		l1.push('3');
		l1.push('2');
		assertTrue(l1.size() == 3);
	}

	public void testToString() {
		CharStack l1 = new CharStack();
		l1.push('1');
		l1.push('3');
		l1.push('2');
		assertTrue(l1.toString().equals("{2,3,1}"));
	}

}
