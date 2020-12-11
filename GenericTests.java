import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GenericTests {
	Generic gen;
	
	@Before
	public void setUp(){
		gen=new Generic();
	}
	
	
	@Test
	public void testConcatAndUpper() {
		String result = Generic.concatAndUpper("hello", "KiTty");
		assertEquals("HELLY",result);
	}

}
