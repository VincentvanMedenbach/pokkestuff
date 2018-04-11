import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class main extends JPanel {
	static Pokemon harry = new Pikachu("harry");
	static Pokemon charmeleon = new Charmeleon("bob");
	int positioning = 0;

	public static void main(String[] args) {
		JFrame frame = new JFrame("FrameDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(1350, 650));
		// begin of Layout item
		(harry).addButtons(frame, charmeleon, harry);
		(charmeleon).addButtons(frame, harry, charmeleon);
		// end of frame items
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
