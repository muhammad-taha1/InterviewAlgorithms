import static org.junit.Assert.*;

import org.junit.Test;



public class unitTestExampleTest {
	
	@Test
	public void test() {
		int output = unitTestExample.add(2, 1);
		assertEquals(output, 5);
	}
	

}
