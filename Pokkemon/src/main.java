import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class main extends JPanel {
	static Object harry = new pikachu("harry");
	static Object charmeleon = new Charmeleon("bob");
	int positioning = 0;

	public static void main(String[] args) {
		JFrame frame = new JFrame("FrameDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(1350, 650));
		
	
		
		
		
		
		
		
		
		// begin of Layout item
		((pikachu) harry).addButtons(frame, (Charmeleon) charmeleon);
		((Charmeleon) charmeleon).addButtons(frame, (pikachu) harry);
		// end of frame items
		frame.pack();
	}

}
