package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// instantiated a list to contain the Shapes objects that will be created
		List<Shape> shapeList = new ArrayList<>();

		System.out.print("Enter the number of shapes: ");
		int numberShapes = sc.nextInt();
		sc.nextLine();

		// loop for gathering the data of the shapes
		for (int i = 1; i <= numberShapes; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			char answer = sc.next().charAt(0);
			sc.nextLine();

			// limiting accepted input to only 'r' or 'c' input
			while (answer != 'r' && answer != 'c') {
				System.out.println("Invalid Answer, please check and try again...");
				System.out.print("Rectangle or Circle (r/c)? ");
				answer = sc.next().charAt(0);
				sc.nextLine();
			}

			System.out.print("Color (BLACK/BLUE/RED): ");
			// converting String input to Color type
			Color color = Color.valueOf(sc.nextLine().toUpperCase());

			// instantiating rectangle objects
			if (answer == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				shapeList.add(new Rectangle(width, height, color));

				// instantiating circle objects
			} else {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				shapeList.add(new Circle(radius, color));
			}
		}

		System.out.println();
		System.out.println("SHAPE AREAS: ");

		// for each shape in shapeList
		for (Shape shape : shapeList) {
			
			// making a different output depending on the type of the object
			if (shape instanceof Circle) {
				System.out.printf("Circle area: %.2f Color: %s%n", shape.area(), shape.getColor());
			} else if (shape instanceof Rectangle) {
				System.out.printf("Rectangle area: %.2f Color: %s%n", shape.area(), shape.getColor());
			}
		}

		sc.close();
	}
}
