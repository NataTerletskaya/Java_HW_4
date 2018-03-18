package Figure;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// get array size
		System.out.println("Input array size..");
		int sizeArray = scan.nextInt();

		AbstractFigure[] figuresArray = new AbstractFigure[sizeArray];

		for (int i = 0; i < sizeArray; i++) {
			int chosenFigure = getType(scan);
			switch (chosenFigure) {
			// Rectangle
			case 1:
				figuresArray[i] = new Rectangle(getName(scan), getWidth(scan), getHeight(scan));
				break;
			// Square
			case 2:
				figuresArray[i] = new Square(getName(scan), getWidth(scan));
				break;
			// Circle
			case 3:
				figuresArray[i] = new Circle(getName(scan), getRadius(scan));
				break;
			case 0:
				break;
			default:
				break;
			}
		}

		for (int i = 0; i < sizeArray; i++) {
			figuresArray[i].showInfo();
		}
		scan.close();
	}

	static int getType(Scanner scan) {
		System.out.println("-------------------");
		System.out.println("Choose Figure type:");
		System.out.println("-------------------");
		System.out.println("1. Rectangle");
		System.out.println("2. Square");
		System.out.println("3. Circle");
		System.out.println("0. Exit");
		System.out.println("-------------------");

		int chosenFigure = scan.nextInt();

		if (chosenFigure > 3 || chosenFigure < 0) {
			System.out.println("Figure is out of the list.\nTry again.");
			getType(scan);
		}

		return chosenFigure;
	}

	static String getName(Scanner scan) {
		System.out.println("Input name");
		String name = scan.next();

		return name;
	}

	static double getWidth(Scanner scan) {
		System.out.println("Input width");
		double width = scan.nextDouble();

		return width;
	}

	static double getHeight(Scanner scan) {
		System.out.println("Input height");
		double height = scan.nextDouble();

		return height;
	}

	static double getRadius(Scanner scan) {
		System.out.println("Input radius");
		double radius = scan.nextDouble();

		return radius;
	}
}
