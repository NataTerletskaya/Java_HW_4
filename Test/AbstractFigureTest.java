package Test;

public abstract class AbstractFigureTest {

	protected static void assertEqualString(String expected, String actual) {
		if (false == expected.equals(actual)) {
			String message = "Test is failed!";
			message += "\nExpected: " + expected;
			message += "\nActual: " + actual;
			throw new Error(message);
		}
		System.out.println("Test is passed");
	}

	protected static void assertEqualInt(int expected, int actual) {
		if (expected != actual) {
			String message = "Test is failed!";
			message += "\nExpected: " + expected;
			message += "\nActual: " + actual;
			throw new Error(message);
		}
		System.out.println("Test is passed");
	}

	protected static void assertEqualDouble(double expected, double actual) {
		if (expected != actual) {
			String message = "Test is failed!";
			message += "\nExpected: " + expected;
			message += "\nActual: " + actual;
			throw new Error(message);
		}
		System.out.println("Test is passed");
	}
}
