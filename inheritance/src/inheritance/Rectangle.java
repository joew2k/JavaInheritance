/**
 * 
 */
package inheritance;

/**
 * @author Covenant Visions
 * Overriding and overloading methods in inheritance
 *
 */
public class Rectangle {
	protected static int length;
	protected static int width;
	protected static int sides = 4;
	
	public static int getLength() {
		return length;
	}
	public static void setLength(int length) {
		Rectangle.length = length;
	}
	public static int getWidth() {
		return width;
	}
	public static void setWidth(int width) {
		Rectangle.width = width;
	}
	
	public static double calculateArea() {
		double area = length * width;
		return area;
	}
	public static double calculatePerimeter() {
		double perimeter = (2*length) + (2*width);
		return perimeter;
	}

}
