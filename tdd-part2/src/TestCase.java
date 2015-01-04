import java.lang.reflect.Method;

public class TestCase {

	String methodName;

	public TestCase(String methodName) {
		this.methodName = methodName;
	}

	public void run() {
		Class cls = this.getClass();
		try {
			Method m = cls.getDeclaredMethod(methodName, null);
			m.invoke(this);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
