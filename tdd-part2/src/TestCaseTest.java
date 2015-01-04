
public class TestCaseTest extends TestCase {
	WasRun test = null;
	TestResult result;

	public TestCaseTest(String methodName) {
		super(methodName);
	}
	
	public void setUp() {
		result = new TestResult();
	}

	public void testTemplateMethod() {
		WasRun test = new WasRun("testMethod");
		test.run( result );
		System.out.println(test.log.equals("setUp testMethod tearDown "));
	}

	public void testResult() {
		WasRun test = new WasRun("testMethod");
		test.run( result );
		System.out.println("1 run, 0 failed".equals(result.summary()));
	}

	public void testFailedResult() {
		WasRun test = new WasRun("testBrokenMethod");
		test.run( result );
		System.out.println("1 run, 1 failed".equals(result.summary()));
	}

	public void testFailedResultFormatting() {
		TestResult result = new TestResult();
		result.testStarted();
		result.testFailed();
		System.out.println("1 run, 1 failed".equals(result.summary()));
	}

	public void testSuite() {
		TestSuite suite = new TestSuite();
		suite.add(new WasRun("testMethod"));
		suite.add(new WasRun("testBrokenMethod"));
		suite.run( result );
		System.out.println("2 run, 1 failed".equals(result.summary()));
	}

	public static void main(String[] args) {
		TestSuite suite = new TestSuite();
		suite.add(new TestCaseTest("testTemplateMethod"));
		suite.add(new TestCaseTest("testResult"));
		suite.add(new TestCaseTest("testFailedResult"));
		suite.add(new TestCaseTest("testFailedResultFormatting"));
		suite.add(new TestCaseTest("testSuite"));
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println(result.summary());
	}

}
