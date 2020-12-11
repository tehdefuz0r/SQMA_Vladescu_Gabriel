import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GenericTests2 {
	Generic gen;
	
	@Before
	public void setUp(){
		gen=new Generic();
	}
	
	@Test
	public void testMultiplyCorectitudine() {
		int rezultat=Generic.multiplyAndSquare(2, 3);
		int rezultatAsteptat=36;
		assertEquals(rezultatAsteptat, rezultat);
	}
	
}
