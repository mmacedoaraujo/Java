package application;

import model.enums.Color;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Retangle;

public class Program {
	
	public static void main(String[] args) {
		
		AbstractShape abs1 = new Circle(2.0, Color.BLACK);
		AbstractShape abs2 = new Retangle(3.0, 4.0, Color.WHITE);
		
		System.out.println("Circle color: " + abs1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", abs1.area()));
		System.out.println("Retangle color: " + abs2.getColor());
		System.out.println("Retangle area: " + String.format("%.3f", abs2.area()));
	}
}
