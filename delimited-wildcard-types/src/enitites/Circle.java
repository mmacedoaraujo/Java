package enitites;

public class Circle implements Shape {

	private Double radius;

	public Circle() {

	}

	public Circle(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {
		return 2 * Math.PI * radius;
	}
}
