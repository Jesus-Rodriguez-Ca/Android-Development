// Jesus Rodriguez
// ITC 155 Spring2020

/*
	Write a class named Octagon whose objects represts regular octagons. You class should implemet the Shape interface
	defined in this chapter, including methods for its area and perimeter. An Octagon object is defined by its side lenght.
*/
package Shape;

public class ShapesMain {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Octagon(7.5);
	System.out.println("The area of the Octagon is: " + String.format("%.2f", shapes[0].getArea()));
	System.out.println("The perimeter of the Octagon is: " + String.format("%.2f", shapes[0].getPerimeter()));
	}

}
