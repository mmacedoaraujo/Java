package model.entities;

import model.enums.Color;

public class Retangle extends AbstractShape{
	
	private Double width;
	private Double height;
	
	public Retangle() {
		super();
	}
	
	public Retangle(Double width, Double height, Color color) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return width * height;
	}

	

}
