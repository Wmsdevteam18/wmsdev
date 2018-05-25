package wmsweb;

import org.junit.Test;

import wmsdata.TestBean;

import static org.junit.Assert.*;


public class SampleTest {

	@Test
	public void testwillpass() {
		assertEquals("Test", "Test");
	}
	
	@Test
	public void testBean() {
		TestBean bean = new TestBean();
		assertNotNull(bean);
	}
}
