import java.util.ArrayList;


public class TestSuite {
	
	ArrayList<TestCase> tests;
	
	public TestSuite() {
		tests = new ArrayList<TestCase>();
	}
	
	public void add( TestCase test ) {
		this.tests.add(test);
	}

	public void run( TestResult result ) {
		for( TestCase test : tests) {
			test.run( result );
		}
	}
	
	
}
