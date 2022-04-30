package entities;

import entities.enums.Color;

public class Circle extends Shape {
	
	private Double radius;
	
	public Circle() {
		super();
	}
	
	public Circle(Double radius, Color color) {
		super(color);
		this.radius = radius;
	}
	
	@Override
	public Double area() {
		return Math.PI * Math.pow(radius, 2);
	}
}
