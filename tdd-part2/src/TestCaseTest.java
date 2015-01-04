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
	
	public void testResult(){
		WasRun test = new WasRun("testMethod");
		TestResult result = test.run();
		System.out.println("1 run, 0 failed".equals(result.summary()));
	}
	
	public void testFailedResult() {
		WasRun test = new WasRun("testBrokenMethod");
		TestResult result = test.run();
		System.out.println("1 run, 1 failed".equals(result.summary()));
	}

	public static void main(String[] args) {
		new TestCaseTest("testTemplateMethod").run();
		new TestCaseTest("testResult").run();
		new TestCaseTest("testFailedResult").run();
	}

}
