
public class WasRun extends TestCase {
	boolean wasRun;
	String log;

	public WasRun(String methodName) {
		super(methodName);
	}

	public void testMethod() {
		wasRun = true;
		log += "testMethod ";
	}
	
	public void setUp() {
		wasRun = false;
		log = "setUp ";
	}
	
	public void tearDown() {
		log += "tearDown "; 
	}
	
	public void testBrokenMethod() {
		throw new RuntimeException();
	}

}
