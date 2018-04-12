import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Pokemon {
	protected String naam;
	protected ArrayList<String> energytype = new ArrayList<String>();
	protected int hitpoints;
	protected static int health;
	protected ArrayList<Double> weakness = new ArrayList<Double>();
	protected ArrayList<String> weaknessType = new ArrayList<String>();
	protected ArrayList<Integer> resistanceValues = new ArrayList<Integer>();
	protected ArrayList<String> resistanceNames = new ArrayList<String>();
	protected ArrayList<String> attackNames = new ArrayList<String>();
	protected ArrayList<Integer> attackValues = new ArrayList<Integer>();;
	static int count = 0;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addButtons(JFrame frame, Pokemon enemy, Pokemon current) {
		final JComboBox<String> cb = new JComboBox<String>();
		cb.setModel(new DefaultComboBoxModel(attackNames.toArray()));
		final JLabel healthBox = new JLabel("health: " + Integer.toString(enemy.health));
		final JLabel naam = new JLabel(current.naam);

		JButton button = new JButton("Attack");
		JButton resetButton = new JButton("reset");

		cb.setVisible(true);
		cb.setBounds(700 - count - ((count != 0) ? 200 : 0), 100, 500, 100);

		button.setBounds(1200 - count - ((count != 0) ? 200 : 0), 100, 100, 100);

		healthBox.setVisible(true);

		healthBox.setBounds(200 + count + ((count != 0) ? 200 : 0), 300, 200, 200);

		naam.setVisible(true);
		naam.setBounds(700 - count, 0, 100, 100);

		resetButton.setBounds(600 + count + ((count != 0) ? 200 : 0), 300, 100, 100);

		healthBox.setFont(new Font("Serif", Font.PLAIN, 45));

		frame.add(naam);
		frame.add(cb);
		frame.add(button);
		frame.add(healthBox);
		frame.add(resetButton);
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent f) {
				// System.out.println("reset");
				health = 60;
				healthBox.setText("health: " + Integer.toString(enemy.health));
			}

		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (enemy.health > 0 && health > 0) {
					String selected = (String) cb.getSelectedItem();
					int index = 0;
					for (int i = 0; i < attackNames.size(); i++) {
						if (attackNames.get(i).equals(selected)) {
							index = i;
						}
					}

					attack(enemy, index);
					healthBox.setText("health: " + Integer.toString(enemy.health));
				}
			}
		});

		count += 400;
		// System.out.println(count);
	}

	public void attack(Pokemon enemy, int attack) {
		if (enemy.health > 0) {
			System.out.println();
			double damage = attackValues.get(attack);
			for (int l = 0; l < enemy.weaknessType.size(); l++) {
				for (int i = 0; i < this.energytype.size(); i++) {
					if (enemy.weaknessType.get(l) == this.energytype.get(i)) {
						damage = damage * enemy.weakness.get(l);
						System.out.println(enemy.weakness.get(l) + "Super effective!");
					}
				}
			}
			for (int l = 0; l < enemy.energytype.size(); l++) {
				for (int i = 0; i < resistanceNames.size(); i++) {
					if (enemy.energytype.get(l) == this.resistanceNames.get(i)) {
						damage = damage / enemy.resistanceValues.get(i);
						System.out.println("Not effective!");
					}
				}
			}
			double newHealth = enemy.health - damage;
			enemy.health = (int) newHealth;
			if (enemy.health < 0) {
				enemy.health = 0;
			}
			// System.out.println(
			// enemy.health + " " + newHealth + " " + damage + " " + attack + " " +
			// (enemy.health - damage));
			// System.out.println(enemy.naam + "health is now at:" + enemy.health);
		}
	}

}
