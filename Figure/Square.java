package Figure;

public class Square extends AbstractFigure {
	private final double width;

	public Square(String name, double width) {
		super(name, "Square");
		this.width = width;
	}

	public double getArea() {
		return Math.round(this.width * this.width * 100) / 100.0;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("has size " + this.width + " x " + this.width + ";" + "\nits area is " + this.getArea());
	}
}