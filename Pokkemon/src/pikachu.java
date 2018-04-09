import java.awt.event.ActionEvent;
import java.util.HashMap;

import javax.swing.AbstractAction;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

class pikachu extends pokemon {
	pikachu(String pokenaam) {
		System.out.println("pikachu created!");
		final String naam = pokenaam;
	}

	public String[] energytype = { "lightning" };
	public int hitpoints = 60;
	public int health = 60;
	public double[] weakness = { 1.5 };
	public String[] weaknessType = { "fire" };
	public int[] resistanceValues = {};
	public String[] resistanceNames = {};
	public static String[] attackNames = { "electric Ring", "pika Punch" };
	public int[] attackValues = { 50, 20 };

	public void attack(Charmeleon enemy, int attack) {
		System.out.println();
		double damage = this.attackValues[attack];
		if (enemy.weaknessType == this.energytype) {
			damage = damage * enemy.weakness[0];
			System.out.println("Super effective!");
		}
		if (enemy.energytype == this.resistanceNames) {
			damage = damage / enemy.resistanceValues[0];
			System.out.println("Not effective!");
		}
		double newHealth = enemy.health - damage;
		enemy.health = (int) newHealth;
		System.out.println(enemy.health + " " + newHealth + " " + damage + " " + attack + " " +  (enemy.health - damage));
		System.out.println(enemy.naam + "health is now at:" + enemy.health);
	}
}