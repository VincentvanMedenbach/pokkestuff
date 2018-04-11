import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Pokemon {
	protected String naam;
	protected ArrayList<String> energytype = new ArrayList<String>();
	protected int hitpoints;
	protected int health;
	protected ArrayList<Double> weakness = new ArrayList<Double>();
	protected ArrayList<String> weaknessType = new ArrayList<String>();
	protected ArrayList<Integer> resistanceValues = new ArrayList<Integer>();
	protected ArrayList<String> resistanceNames = new ArrayList<String>();
	protected ArrayList<String> attackNames = new ArrayList<String>();
	protected ArrayList<Integer> attackValues = new ArrayList<Integer>();;
	private int count = 0;

	public void addButtons(JFrame frame, Pokemon enemy, Pokemon current) {
		final JComboBox<String> cb = new JComboBox<String>();
		cb.setModel(new DefaultComboBoxModel(attackNames.toArray()));
		final JLabel healthBox = new JLabel("health: " + Integer.toString(enemy.health));
		final JLabel naam = new JLabel("Charmeleon:" + current.naam);

		JButton button = new JButton("Attack");
		JButton resetButton = new JButton("reset");

		cb.setVisible(true);
		cb.setBounds(700 + count, 100, 500, 100);

		button.setBounds(1200 + count, 100, 100, 100);
		
		healthBox.setVisible(true);

		healthBox.setBounds(200 + count, 300, 200, 200);

		naam.setVisible(true);
		naam.setBounds(700 + count, 0, 100, 100);

		resetButton.setBounds(500 + count, 300, 100, 100);

		healthBox.setFont(new Font("Serif", Font.PLAIN, 50));

		frame.add(naam);
		frame.add(cb);
		frame.add(button);
		frame.add(healthBox);
		frame.add(resetButton);

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
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent f) {
				health = 60;
				healthBox.setText("health: " + Integer.toString(enemy.health));
			}

		});
		count++;
	}

	public void attack(Pokemon enemy, int attack) {
		if (enemy.health > 0) {
			System.out.println();
			double damage = attackValues.get(attack);
			if (enemy.weaknessType == this.energytype) {
				damage = damage * enemy.weakness.get(0);
				System.out.println("Super effective!");
			}
			if (enemy.energytype == this.resistanceNames) {
				damage = damage / enemy.resistanceValues.get(0);
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
