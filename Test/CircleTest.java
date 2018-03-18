package Test;

import Figure.Circle;

public class CircleTest extends AbstractFigureTest {

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		System.out.println("Testing class Circle");
		// testing method getArea
		getAreaTest();
	}

	private static void getAreaTest() {
		Circle sq = new Circle("", 2);
		System.out.println("Testing getArea...");

		double expected = 12.57;
		double actual = Math.ceil(sq.getArea() * 100) / 100.0;

		assertEqualDouble(expected, actual);
	}
}
