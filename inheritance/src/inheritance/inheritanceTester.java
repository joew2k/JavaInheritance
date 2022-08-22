package inheritance;

public class inheritanceTester {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Rectangle rect = new Rectangle();
		Square square = new Square();
		
		Woman woman = new Woman();
		
		Mother mother = new Mother();
		
		String gender = mother.getGender();
		String name = mother.getName();
		System.out.println(name + " is a " + gender);
		
		square.print("square");
		
		

	}

}
