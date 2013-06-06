package Vues;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class VueApercu extends JPanel {
	public VueApercu() {
		setBorder(new TitledBorder("Apercu")); // Titre du panel
		/* Background */

		ImageIcon icon = new ImageIcon("backgrounds//gdeFond7.jpg");
		JLabel img = new JLabel(icon);
		add(img);

	}
}
