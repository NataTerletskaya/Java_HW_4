package Figure;

public class Circle extends AbstractFigure {
	private double radius;

	public Circle(String name, double radius) {
		super(name, "Circle");
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public void showInfo() {
		super.showInfo();
		System.out.printf("has radius %.2f;\nits area is %.2f\n", this.radius, this.getArea());
	}
}