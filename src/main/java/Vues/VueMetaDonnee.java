package Vues;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import Modele.ModeleMetadonnee;

public class VueMetaDonnee extends JPanel {
	private ModeleMetadonnee modeleMetadonnee;
	private JLabel img;
	private JTextArea texte;

	public VueMetaDonnee(ModeleMetadonnee modeleMetadonnee) {
		this.modeleMetadonnee = modeleMetadonnee;
		setBorder(new TitledBorder("Apercu")); // Titre du panel
		setBackground(Color.white);
		// JLabel img = new JLabel(new ImageIcon(modeleMetadonnee.getIcone()));
		// JLabel img = new JLabel(new ImageIcon("img//notFound.jpg"));
		img = new JLabel(new ImageIcon(modeleMetadonnee.getCheminIcone()));
		add(img);
		texte = new JTextArea(modeleMetadonnee.toString());
		Dimension d = new Dimension(5, 30);
		texte.setMaximumSize(d);
		texte.setEditable(false);
		add(texte);
		System.out.println(texte.getColumns());

		// setOpaque(false);
		/* Background */
		/*
		 * ImageIcon icon = new ImageIcon("img//gdeFond10.jpg"); JLabel img =
		 * new JLabel(icon); add(img);
		 */

		// setBackground(new Color(150, 200, 205));
		/*
		 * JLabel img = new JLabel(icone); add(img);
		 */

	}
	/*
	 * public void paintComponent(Graphics g) {
	 * 
	 * }
	 */
}
