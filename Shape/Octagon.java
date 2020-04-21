package Shape;
import java.lang.Math;

public class Octagon implements Shape{
	private double sideLengh;
	
	public Octagon(double sideLengh){
		this.sideLengh = sideLengh;	
	}
	
	public double getPerimeter() {
		return sideLengh * 8;
	}
	
	public double getArea() {
		return 2 * (1 + Math.sqrt(2)) * (sideLengh * sideLengh);
	}
}
