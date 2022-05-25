package application;

import java.util.ArrayList;
import java.util.List;

import enitites.Circle;
import enitites.Rectangle;
import enitites.Shape;

public class Program {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(2.0, 3.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<Circle>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + String.format("%.2f", totalArea(myCircles)));
	}

	public static Double totalArea(List<? extends Shape> list) {
		Double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
