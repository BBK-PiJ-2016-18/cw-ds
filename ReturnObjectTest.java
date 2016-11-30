import org.junit.*;
import static org.junit.Assert.*;

public class ReturnObjectTest {
	
	private Book testBook;
	
	// setup
	@Before
	public void setUp() {
		testReturn = new ReturnObjectImpl("Donald John Trump");
	}

	
	// test

	@Test
	public void testsHasError() {
		
		String testBookTitle = (testBook.getTitle());
		
		String expected = "Moby Dick";
		
		assertEquals(testBookTitle, expected);
	}
	@Test
	public void testsAuthorGetter() {
		
		String testBookAuthor = (testBook.getAuthor());
		
		String expected = "Herman Melville";
		
		assertEquals(testBookAuthor, expected);
	}
	

}