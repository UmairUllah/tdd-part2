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

	public void run( TestResult result ) {
		Class cls = this.getClass();
		try {
			this.setUp();
			result.testStarted();
			Method m = cls.getDeclaredMethod(methodName, null);
			m.invoke(this);
		} catch (Exception e) {
			result.testFailed();
		}
		this.tearDown();
	}

}
