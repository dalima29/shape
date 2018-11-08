package it.ariadne.shapes.model;

import it.ariadne.shapes.Shape;

public class Rectangle implements Shape {

	private int base;
	private int altezza;
	
	public Rectangle(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public int calculateArea() {
		
		return base*altezza;
	}
}
