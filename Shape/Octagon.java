// Jesus Rodriguez
// ITC 155 Spring2020

/*
	Write a class named Octagon whose objects represts regular octagons. You class should implemet the Shape interface
	defined in this chapter, including methods for its area and perimeter. An Octagon object is defined by its side lenght.
*/

package Shape;
import java.lang.Math;

public class Octagon implements Shape{				// Creates an object from the interface Shape
	private double sideLengh;
	
	public Octagon(double sideLengh){			// Set variable
		this.sideLengh = sideLengh;	
	}
	
	public double getPerimeter() {				// Gets perimeter
		return sideLengh * 8;
	}
	
	public double getArea() {				// Gets area
		return 2 * (1 + Math.sqrt(2)) * (sideLengh * sideLengh);
	}
}
