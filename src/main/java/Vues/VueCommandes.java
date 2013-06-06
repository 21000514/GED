package Vues;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class VueCommandes extends JPanel implements ActionListener {
	private JButton ajoutFichier;
	JFileChooser chooser;

	public VueCommandes() {
		setBorder(new TitledBorder("Commandes")); // Titre du panel
		/* Background */
		ImageIcon icon = new ImageIcon("backgrounds//gdeFond3.jpg");
		JLabel img = new JLabel(icon);
		// add(img);
		this.setLayout(new GridLayout(1, 5, 8, 8));
		ajoutFichier = new JButton("+Fichier");
		// ajoutFichier.add(img);
		ajoutFichier.setEnabled(true);
		this.add(ajoutFichier);
		ajoutFichier.addActionListener(this);

		JButton retraitFichier = new JButton("-Fichier");
		// retraitFichier.add(img);
		this.add(retraitFichier);
		JButton editMeta = new JButton("edit Meta");
		// editMeta.add(img);
		this.add(editMeta);
		JButton lectureFichier = new JButton("Lecture");
		// lectureFichier.add(img);
		this.add(lectureFichier);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ajoutFichier) {
			File fichier;
			chooser = new JFileChooser(new File("."));

			int val = chooser.showOpenDialog(this);

			if (val == JFileChooser.APPROVE_OPTION) {
				fichier = chooser.getSelectedFile();
				System.out.println(fichier.getName());

			}

			System.out.println("fichier");
		}

	}
}