package inheritance;

public class Employee extends Person {
	protected static int employeeId;
	protected static String title;
	
	public Employee() {
		
		/**
		 *  calling constructor must be on the very first line. 
		 *  to use a constructor other than the default constructor 
		 *  'supper' should be used to call the constructor with the necesary parameter passed
		 *  Note: If the default constructor for the super class is not defined the subclass 
		 *  must explicitly call the constructor.
		 */
		super("joe");
		System.out.println("This is employee default constructor");
	}
	public static int getEmployeeId() {
		return employeeId;
	}
	public static void setEmployeeId(int employeeId) {
		Employee.employeeId = employeeId;
	}
	public static String getTitle() {
		return title;
	}
	public static void setTitle(String title) {
		Employee.title = title;
	}

		
}
