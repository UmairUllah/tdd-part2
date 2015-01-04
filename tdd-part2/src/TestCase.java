import java.lang.reflect.Method;

public class TestCase {

	String methodName;

	public TestCase(String methodName) {
		this.methodName = methodName;
	}

	public void setUp() {

	}
	
	public void tearDown() {

	}

	public TestResult run() {
		TestResult result = new TestResult();
		Class cls = this.getClass();
		try {
			this.setUp();
			result.testStarted();
			Method m = cls.getDeclaredMethod(methodName, null);
			m.invoke(this);
			this.tearDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
