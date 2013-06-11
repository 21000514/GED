package Vues;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

public class VueCommandes extends JPanel implements Observer {
	public final static int NBBOUTONS = 4;
	private JButton boutons[] = new JButton[NBBOUTONS];
	// ajoutFichier,retraitFichier, editMeta,lectureFichier;
	JFileChooser chooser;

	public VueCommandes() {
		this.setLayout(new GridLayout(1, 4));
		boutons[0] = new JButton(new ImageIcon("img//plus.png"));
		boutons[1] = new JButton(new ImageIcon("img//moins.png"));
		boutons[2] = new JButton("MAJ Donnees");
		boutons[3] = new JButton("Affichage externe");
		for (int i = 0; i < NBBOUTONS; i++) {
			// boutons[i].setBorder(null); //le mettre et lors du passage souris
			// changer le background
			// boutons[i].setOpaque(false);
			boutons[i].setForeground(Color.white);
			boutons[i].setContentAreaFilled(false);
			this.add(boutons[i]);
			boutons[i].setVisible(true);
		}

	}

	public JButton getBoutons(int numBout) {
		return boutons[numBout];
	}

	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

}