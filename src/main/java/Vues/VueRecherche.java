package Vues;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class VueRecherche extends JPanel {
	public VueRecherche() {
		setBorder(new TitledBorder("Recherche")); // Titre du panel
		setOpaque(false);
		/* Background */
		/*
		 * ImageIcon icon = new ImageIcon("img//gdeFond2.jpg"); JLabel img = new
		 * JLabel(icon); add(img);
		 */
		JTextField rech = new JTextField(15);
		rech.setText("Saisir mots-clés...");
		this.add(rech);

	}
}
