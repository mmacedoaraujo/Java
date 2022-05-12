package model.entities;

import model.enums.Color;

public class Circle extends AbstractShape{
	
	private Double radius;
	
	public Circle() {
		
	}
	
	public Circle(Double radius, Color color) {
		super(color);
		this.radius = radius;
	}
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.radius, 2);
	}
	
}
