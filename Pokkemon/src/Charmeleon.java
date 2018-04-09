
public class Charmeleon extends pokemon {
	Charmeleon(String pokenaam) {
		System.out.println("Charmeleon created!");
		final String naam = pokenaam;
	}

	public String naam = "";
	public String[] energytype = { "fire" };
	public int hitpoints = 60;
	public static int health = 60;
	public double[] weakness = { 2.0 };
	public String[] weaknessType = { "Water" };
	public int[] resistanceValues = { 10 };
	public String[] resistanceNames = { "Lightning" };
	public String[] attackNames = { "Head Butt", "Flare" };
	public int[] attackValues = { 10, 30 };
}
