/**
 * 
 */
package inheritance;

/**
 * @author Covenant Visions
 *
 */
public class Square extends Rectangle {
	@Override
	public double calculatePerimeter() {
		double perimeter = length * sides;
		return perimeter;
	}
	public void print(String what) {
		System.out.println("This is a " + what);
	}

}
