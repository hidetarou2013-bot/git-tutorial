package jp.co.sevenandinm.kenshuu.cvsue000;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JavaSampleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExecute() {
		JavaSample action = new JavaSample();
		assertEquals(true,true);
	}

	@Test
	public void testMethod1() {

		JavaSample action = new JavaSample();
		double ret = action.method1(1.0, 0.1, 9);
		
		assertEquals(null,0.1,ret, 0);
	}

}
