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

	public void addButtons(JFrame frame, Charmeleon enemy) {
		final JComboBox<String> cb = new JComboBox<String>(this.attackNames);
		final JLabel healthBox = new JLabel("health: " + Integer.toString(enemy.health));
		final JLabel naam = new JLabel("Pikachu:" + this.naam);
		System.out.println(this.naam + this.health);
		JButton button = new JButton("Attack");
		JButton resetButton = new JButton("reset");

		cb.setVisible(true);
		cb.setBounds(0, 100, 500, 100);

		button.setBounds(500, 100, 100, 100);

		healthBox.setVisible(true);
		healthBox.setBounds(800, 300, 200, 200);

		naam.setVisible(true);
		naam.setBounds(0, 0, 100, 100);

		resetButton.setBounds(1200, 300, 100, 100);

		frame.add(naam);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		frame.add(cb);
		frame.add(button);
		healthBox.setFont(new Font("Serif", Font.PLAIN, 50));
		frame.add(healthBox);
		frame.add(resetButton);
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent f) {
				health = 60;
				healthBox.setText("health: " + Integer.toString(enemy.health));
			}

		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (enemy.health > 0 && health > 0) {
					String selected = (String) cb.getSelectedItem();
					int index = 0;
					for (int i = 0; i < attackNames.length; i++) {
						if (attackNames[i].equals(selected)) {
							index = i;
						}
					}

					attack(enemy, index);
					healthBox.setText("health: " + Integer.toString(enemy.health));
				}
			}
		});

	}

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