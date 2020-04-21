package Shape;

public class ShapesMain {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Octagon(7.5);
System.out.println("The area of the Octagon is: " + String.format("%.2f", shapes[0].getArea()));
System.out.println("The perimeter of the Octagon is: " + String.format("%.2f", shapes[0].getPerimeter()));
	}

}
