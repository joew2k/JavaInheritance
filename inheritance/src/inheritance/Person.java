package inheritance;

public class Person {
	protected static String name;
	protected static int age;
	protected static String address;
	protected static String gender;
	
	public static String getGender() {
		return gender;
	}

	public static void setGender(String gender) {
		Person.gender = gender;
	}

	public Person() {
		System.out.println("This is a person default constructor");
	}
	
	public Person(String name) {
		System.out.println("This is a person contructor with name parameter");
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Person.name = name;
	}
	public static int getAge() {
		return age;
	}
	public static void setAge(int age) {
		Person.age = age;
	}
	public static String getAddress() {
		return address;
	}
	public static void setAddress(String address) {
		Person.address = address;
	}
	
}
