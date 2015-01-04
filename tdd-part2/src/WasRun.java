
public class WasRun extends TestCase {
	boolean wasRun;
	boolean wasSetUp;

	public WasRun(String methodName) {
		super(methodName);
	}

	public void testMethod() {
		wasRun = true;
	}
	
	public void setUp() {
		wasRun = false;
		wasSetUp = true;
	}

}
