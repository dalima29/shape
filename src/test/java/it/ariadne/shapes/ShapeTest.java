package it.ariadne.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

import it.ariadne.shapes.model.Circle;
import it.ariadne.shapes.model.Rectangle;
import it.ariadne.shapes.model.Square;
import it.ariadne.shapes.model.Triangle;

public class ShapeTest {


	@Test
	public void testCircleArea() {
		Circle circle = new Circle(2);
		Circle circle2 = new Circle(3);
		int circleArea = circle.calculateArea();
		int circleArea2 = circle2.calculateArea();
		//ASSERT FIRST
		assertEquals("L'area di un cerchio con raggio 2 è 12", 12, circleArea);
		//TRIANGULATE
		assertEquals("L'area di un cerchio con raggio 3 è 27", 27, circleArea2);
	}
	
	@Test
	public void testQuadratoArea() {
		Square quadrato = new Square(2);
		Square quadrato2 = new Square(3);
		int quadratoArea = quadrato.calculateArea();
		int quadratoArea2 = quadrato2.calculateArea();
		//ASSERT FIRST
		assertEquals("L'area di un quadrato con lato 2 è 4",4,quadratoArea);
		//TRIANGULATE
		assertEquals("L'area di un quadrato con lato 3 è 9",9,quadratoArea2);
	}
	
	@Test
	public void testTriangoloArea() {
		Triangle triangolo = new Triangle(2,4);
		Triangle triangolo2 = new Triangle(3,6);
		int triangoloArea = triangolo.calculateArea();
		int triangoloArea2 = triangolo2.calculateArea();
		//ASSERT FIRST
		assertEquals("L'area di un triangolo con base 2 e altezza 4 è 4",4,triangoloArea);
		//TRIANGULATE
		assertEquals("L'area di un triangolo con base 3 e altezza 6 è 9",9,triangoloArea2);
	}
	@Test
	public void testAddCanvas() {
		Canvas canvas = new Canvas();
		Circle circle = new Circle(3);
		canvas.add(circle);
		Triangle triangolo = new Triangle(2,3);
		canvas.add(triangolo);
		Square quadrato = new Square (4);
		canvas.add(quadrato);
		int canvasSize = canvas.size();
		assertEquals("Il canvas a cui ho aggiunto 3 forme ha dimensione 3",3,canvasSize);
	}
	
	@Test
	public void testTotalArea() {
		Canvas canvas = new Canvas();
		Circle circle = new Circle (2);
		canvas.add(circle);
		Triangle triangolo = new Triangle(2,4);
		canvas.add(triangolo);
		Square quadrato = new Square(2);
		canvas.add(quadrato);
		Rectangle rettangolo = new Rectangle(2,4);
		canvas.add(rettangolo);
		int totalArea = canvas.calculateArea();
		assertEquals("Il canvas ha area totale pari a ",28,totalArea);
	}

}
