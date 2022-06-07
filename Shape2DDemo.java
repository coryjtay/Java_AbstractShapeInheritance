package edu.orangecoastcollege.cs170.ctaylor82.ic28;

import java.awt.Color;
import java.util.ArrayList;

public class Shape2DDemo {

	public static void main(String[] args) {

		ArrayList<Shape2D> shapes = new ArrayList<>();
		shapes.add(new Rectangle(5, 4, 0, 0, Color.BLACK));
		shapes.add(new Triangle(6, 6, 0, 0, Color.BLACK));
		shapes.add(new Parallelogram(10, 40, 0, 0, Color.BLACK));
		
		for (Shape2D s: shapes)
			System.out.println(s);
	}

}
