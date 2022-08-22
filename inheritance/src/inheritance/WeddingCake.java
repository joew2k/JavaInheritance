package inheritance;

public class WeddingCake extends Cake{
	protected static String tiers;

	public static String getTiers() {
		return tiers;
	}

	public static void setTiers(String tiers) {
		WeddingCake.tiers = tiers;
	}
	

}
