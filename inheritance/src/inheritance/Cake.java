package inheritance;

public class Cake {
	protected static String flavor;
	protected static double price;
	
	public static String getFlavor() {
		return flavor;
	}
	public static void setFlavor(String flavor) {
		Cake.flavor = flavor;
	}
	public static double getPrice() {
		return price;
	}
	public static void setPrice(double price) {
		Cake.price = price;
	} 

}
