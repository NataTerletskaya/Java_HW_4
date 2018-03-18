package Test;

import Figure.Rectangle;

public class RectangleTest extends AbstractFigureTest {

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		System.out.println("Testing class Rectangle");
		// testing method getArea
		getAreaTest();
	}

	private static void getAreaTest() {
		Rectangle sq = new Rectangle("", 2, 2);
		System.out.println("Testing getArea...");

		double expected = 4;
		double actual = sq.getArea();

		assertEqualDouble(expected, actual);
}
}