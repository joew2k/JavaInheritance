package inheritance;

public class BirthdayCake extends Cake {
	protected static String candles;

	public static String getCandles() {
		return candles;
	}

	public static void setCandles(String candles) {
		BirthdayCake.candles = candles;
	}

}
