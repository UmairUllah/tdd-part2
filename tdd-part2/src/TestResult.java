
public class TestResult {
	int runCount = 0;
	int errorCount = 0;
	
	public void testStarted(){
		runCount++;
	}

	public String summary() {
		return runCount + " run, " + errorCount + " failed";
	}

	public void testFailed() {
		errorCount++;
	}

}
