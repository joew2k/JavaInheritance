package inheritance;

public class TasteTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cake cake = new Cake();
		BirthdayCake birthdayCake = new BirthdayCake();
		WeddingCake weddingCake = new WeddingCake();
		
		
		birthdayCake.setPrice(1000);
		double price = birthdayCake.getPrice();
		System.out.println(price);

	}

}
