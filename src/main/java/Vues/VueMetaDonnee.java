package Vues;

import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Modele.Metadonnee;

public class VueMetaDonnee extends JPanel implements Observer {
	private Metadonnee metadonnee;
	private JLabel img;
	private JTextArea texte;

	public VueMetaDonnee(Metadonnee metadonnee) {
		this.metadonnee = metadonnee;
		img = new JLabel(new ImageIcon(metadonnee.getCheminIcone()));
		add(img);
		texte = new JTextArea(metadonnee.toString());
		// texte.setMaximumSize(new Dimension(5, 30));
		texte.setEditable(false);
		// texte.setCaretPosition(texte.getDocument().getLength());//place le
		// curseur de saisie a la fin
		texte.setOpaque(false);
		// texte.setBounds(150,150,250,100);
		// texte.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
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

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}
}
