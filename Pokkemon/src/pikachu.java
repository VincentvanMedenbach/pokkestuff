import java.util.HashMap;

class pikachu extends pokemon {
	pikachu(){
		System.out.println("pikachu created!");
	}
	public String naam = "";
	public String[] energytype = { "lightning" };
	public int hitpoints = 60;
	public int health = 60;
	public double[] weakness = { 1.5 };
	public String[] weaknessType = { "fire" };
	public int[] resistanceValues = {};
	public String[] resistanceNames = {};
	public String[] attackNames = { "electric Ring", "pika Punch" };
	public int[] attackValues = { 50, 20 };

	public void attack(pokemon enemy, int attack) {
		double damage = this.attackValues[1];
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