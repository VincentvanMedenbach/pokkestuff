class pokemon {

	public String naam;
	public String[] energytype;
	public int hitpoints;
	public int health;

	public double[] weakness;
	public String[] weaknessType;

	public int[] resistanceValues = {};
	public String[] resistanceNames = {};

	public String[] attackNames;
	public int[] attackValues;

	public void attack(pokemon enemy, int attack) {
		double damage = this.attackValues[0];
		if (enemy.weaknessType == this.energytype) {
			damage = damage * enemy.weakness[0];
		}
		if (enemy.energytype == this.resistanceNames) {
			damage = damage / enemy.resistanceValues[0];
		}
		enemy.health = enemy.health -= damage;
		System.out.println(enemy + "health is now at:" + enemy.health);
	}

}
