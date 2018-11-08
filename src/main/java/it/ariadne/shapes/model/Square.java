package it.ariadne.shapes.model;

import it.ariadne.shapes.Shape;

public class Square implements Shape {
	
	private int lato;

	public Square(int lato) {
		this.lato = lato;
	}

	public int calculateArea() {

		return lato * lato;
	}

}
