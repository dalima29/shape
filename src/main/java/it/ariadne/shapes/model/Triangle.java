package it.ariadne.shapes.model;

import it.ariadne.shapes.Shape;

public class Triangle implements Shape{

	private int base;
	private int altezza;

	public Triangle(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public int calculateArea() {
		
		return (base*altezza)/2;
	}

}
