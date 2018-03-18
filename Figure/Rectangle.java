package Figure;

public class Rectangle extends AbstractFigure {
	private final double width;
	private final double height;

	public Rectangle(String name, double width, double height) {
		super(name, "Rectangle");
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return Math.round(this.width * this.height * 100) / 100.0;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("has size " + this.width + " x " + this.height + ";" + "\nits area is " + this.getArea());
	}
}