package Vues;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class VueRecherche extends JPanel {
	public VueRecherche() {
		setBorder(new TitledBorder("Recherche")); // Titre du panel
		/* Background */
		/*
		 * ImageIcon icon = new ImageIcon("backgrounds//gdeFond2.jpg"); JLabel
		 * img = new JLabel(icon); add(img);
		 */
		JTextField rech = new JTextField(16);
		rech.setText("Saisir mot-clé");
		this.add(rech);

	}
}
