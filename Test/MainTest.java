package Test;

/**
 * This class runs all tests for Figure
 * 
 * @author natat
 *
 */
public class MainTest {

	public static void main(String[] args) {
		// testing method getArea for square
		SquareTest.run();
		// testing method getArea for rectangle
		RectangleTest.run();
		// testing method getArea for circle
		CircleTest.run();
	}
}
