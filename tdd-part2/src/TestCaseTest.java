public class TestCaseTest extends TestCase {
	WasRun test = null;

	public TestCaseTest(String methodName) {
		super(methodName);
	}

	public void testTemplateMethod() {
		WasRun test = new WasRun("testMethod");
		test.run();
		System.out.println(test.log.equals("setUp testMethod tearDown "));
	}

	public static void main(String[] args) {
		new TestCaseTest("testTemplateMethod").run();
	}

}
