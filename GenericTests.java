import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class GenericTests {
	Generic gen;
	
	@Before
	public void setUp(){
		gen=new Generic();
	}
	
	@Test
	public void testMultiplyCorectitudine() {
		int rezultat=gen.multiplyAndSquare(2, 3);
		int rezultatAsteptat=36;
		assertEquals(rezultatAsteptat, rezultat);
	}
	
	@Test
	public void testConcatAndUpper() {
		String result = gen.concatAndUpper("hello", "KiTty");
		assertEquals("HELLOKITTY",result);
	}
	

}
