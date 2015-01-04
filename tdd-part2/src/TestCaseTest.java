public class TestCaseTest extends TestCase {
	WasRun test = null;

	public TestCaseTest(String methodName) {
		super(methodName);
	}
	
	public void setUp() {
		test = new WasRun("testMethod");
	}

	public void testRunning() {
		test.run();
		System.out.println(test.wasRun);
	}
	
	public void testSetUp() {
		test.run();
		System.out.println(test.wasSetUp);
	}

	public static void main(String[] args) {
		new TestCaseTest("testRunning").run();
		new TestCaseTest("testSetUp").run();
	}

}
