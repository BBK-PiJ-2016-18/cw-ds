import org.junit.*;
import static org.junit.Assert.*;

public class ArrayListTest {
	
	private List testList;
	
	// setup
	@Before
	public void setUp() {
		testList = new ArrayList();
	}

	
	// test

	@Test
	public void testsList() {		
		testList.add(0);
		testList.add(1);
		testList.add(2);
		testList.add(3);
		
		Object[] expected = {0, 1, 2, 3};
		
		assertEquals(testList.list, expected);
	}
}