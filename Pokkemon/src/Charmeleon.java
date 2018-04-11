import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Charmeleon extends pokemon {
	Charmeleon(String pokenaam) {
		System.out.println("Charmeleon created!");
		this.naam = pokenaam;
	}

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
