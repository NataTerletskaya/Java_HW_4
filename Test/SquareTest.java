package Test;
import Figure.Square;

public class SquareTest extends AbstractFigureTest {

	public static void main(String[] args) {
		run();
	}

	public static void run() {
		System.out.println("Testing class Square");
		// testing method getArea
		getAreaTest();
	}

	private static void getAreaTest() {
		Square sq = new Square("", 2);
		System.out.println("Testing getArea...");

		double expected = 4;
		double actual = sq.getArea();

		assertEqualDouble(expected, actual);
	}
}
