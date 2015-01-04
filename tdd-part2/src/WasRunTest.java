import static org.junit.Assert.*;

import org.junit.Test;

public class WasRunTest {

	@Test
	public void test() {
		WasRun test = new WasRun("testMethod");
		assertFalse(test.wasRun);
		test.run();
		assertTrue(test.wasRun);
	}

}
