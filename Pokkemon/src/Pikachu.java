class Pikachu extends Pokemon {
	public String naam = "";

	Pikachu(String pokenaam) {
		System.out.println("pikachu " + pokenaam + " created!");
		this.naam = pokenaam;
		System.out.println(this.naam);
		energytype.add("test");
		hitpoints = 60;
		health = 60;
		weakness.add(1.5);
		weaknessType.add("fire");
		resistanceValues.add(0);
		resistanceNames.add("test");
		attackNames.add("electric Ring");
		attackNames.add("pika Punch");
		attackValues.add(50);
		attackValues.add(20);

	}

	// public String[] energytype = { "lightning" };
	// public int hitpoints = 60;
	// public static int health = 60;
	// public double[] weakness = { 1.5 };
	// public String[] weaknessType = { "fire" };
	// public int[] resistanceValues = {};
	// public String[] resistanceNames = {};
	// public String[] attackNames = { "electric Ring", "pika Punch" };
	// public int[] attackValues = { 50, 20 };

}