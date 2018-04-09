import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class main extends JPanel {
	public static void main(String[] args) {
		JFrame frame = new JFrame("FrameDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(1000, 1000);
		final JPopupMenu popup = new JPopupMenu();

		Object harry = new pikachu("harry");
		Object charmeleon = new Charmeleon("bob");

		final JComboBox<String> cb = new JComboBox<String>(((pikachu) harry).attackNames);

		JButton button = new JButton("Click here!");

		cb.setVisible(true);
		cb.setBounds(0, 0, 500, 100);

		button.setBounds(0, 100, 500, 500);
		frame.add(cb);
		frame.add(button);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selected = (String) cb.getSelectedItem();
				int index = 0;
				for (int i = 0; i < pikachu.attackNames.length; i++) {
					if (pikachu.attackNames[i].equals(selected)) {
						index = i;
					}
				}
				((pikachu) harry).attack((Charmeleon) charmeleon, index);
			}
		});
		frame.pack();
	}

}
