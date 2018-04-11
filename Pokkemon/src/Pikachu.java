import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

class Pikachu extends Pokemon{
	public String naam = "";

	Pikachu(String pokenaam) {
		System.out.println("pikachu " + pokenaam + " created!");
		this.naam = pokenaam;
		System.out.println(this.naam);
		 energytype;
		hitpoints = 60;
		 health = 60;
	      weakness.add(1.5);
		weaknessType = { "fire" };
		resistanceValues = {};
		resistanceNames = {};
		attackNames = { "electric Ring", "pika Punch" };
		attackValues = { 50, 20 };
		
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

}