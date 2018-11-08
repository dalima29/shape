package it.ariadne.shapes;

import java.util.ArrayList;
import java.util.List;

public class Canvas {

	private List<Shape> shapes = new ArrayList<>();
	private int totalArea;
	public int size() {
		return shapes.size();
	}

	public void add(Shape shape) {
		shapes.add(shape);
	}

	public int calculateArea() {
		for(int i=0; i<shapes.size(); i++) {
			totalArea+=shapes.get(i).calculateArea();
		}

	/*	for (Square square: squares) {
			totalArea+=square.calculateArea();
		}*/
		return totalArea;
	}

}
