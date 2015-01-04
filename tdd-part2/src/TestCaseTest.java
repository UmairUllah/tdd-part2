public class TestCaseTest extends TestCase {

	public TestCaseTest(String methodName) {
		super(methodName);
	}

	public void testRunning() {
		WasRun test = new WasRun("testMethod");
		System.out.println(test.wasRun);
		test.run();
		System.out.println(test.wasRun);
	}

	public static void main(String[] args) {
		new TestCaseTest("testRunning").run();
	}

}
