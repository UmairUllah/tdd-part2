
public class TestResult {
	int runCount = 0;
	
	public void testStarted(){
		runCount++;
	}

	public String summary() {
		return runCount + " run, 0 failed";
	}

}
