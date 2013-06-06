package Vues;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class VueSeries extends JPanel {
	public VueSeries() {
		setBorder(new TitledBorder("Series")); // Titre du panel
		/* Background */
		setBackground(Color.white);
		/*
		 * ImageIcon icon = new ImageIcon("backgrounds//gdeFond2.jpg"); JLabel
		 * img = new JLabel(icon); add(img);
		 */
	}
}
