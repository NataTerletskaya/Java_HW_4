package Figure;

public abstract class AbstractFigure {
	private String name;
	private String type;

	public AbstractFigure(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public abstract double getArea();

	public void showInfo() {
		System.out.println("-------------------");
		System.out.println("Figure " + this.name + " type " + this.type + ":");
	}

}
