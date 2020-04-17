package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import entities.Triangle;
import entities.Circle;
import entities.Rectangle;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Shape> list = new ArrayList<>(); 
		
		System.out.println("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle, Circle or Triangle (r/c/t): ");
			char ch = sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(ch == 'r') {
				System.out.println("Width: ");
				double width = sc.nextDouble();
				System.out.println("Height: ");
				double height = sc.nextDouble();
				
				list.add(new Rectangle(color, width, height));
			}else if (ch == 'c') {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}else {
				System.out.println("Base: ");
				double base = sc.nextDouble();
				System.out.println("Height: ");
				double height = sc.nextDouble();
				
				list.add(new Triangle(color, base, height));
			}
		}
		
		System.out.println();
		System.out.println("Shape areas: ");

		for(Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}
}
