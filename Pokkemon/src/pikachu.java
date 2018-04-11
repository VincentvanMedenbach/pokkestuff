import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

class pikachu extends pokemon {
	public String naam = "";

	pikachu(String pokenaam) {
		System.out.println("pikachu " + pokenaam + " created!");
		this.naam = pokenaam;
		System.out.println(this.naam);
	}

	public String[] energytype = { "lightning" };
	public int hitpoints = 60;
	public static int health = 60;
	public double[] weakness = { 1.5 };
	public String[] weaknessType = { "fire" };
	public int[] resistanceValues = {};
	public String[] resistanceNames = {};
	public String[] attackNames = { "electric Ring", "pika Punch" };
	public int[] attackValues = { 50, 20 };

	public void attack(Charmeleon enemy, int attack) {
		if (enemy.health > 0) {
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
			if (enemy.health < 0) {
				enemy.health = 0;
			}
			System.out.println(
					enemy.health + " " + newHealth + " " + damage + " " + attack + " " + (enemy.health - damage));
			System.out.println(enemy.naam + "health is now at:" + enemy.health);
		}
	}
}