package Vues;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Modele.BDApplication;

public class VueEdition extends JFrame implements ActionListener {
	private JButton valider;
	private JTextField textNom, textAuteur, textNote, textSerie;
	private String nom;

	public VueEdition(String nom) {
		super("Editer metadonnes");
		setLayout(new GridLayout(5, 2, 5, 5));
		String titre = null, auteur = null;
		int note = -1;
		this.nom = nom;
		ResultSet md = BDApplication.listeMetaDonneesParTitre(nom);

		try {
			if (md.next()) {
				titre = md.getString("nom");
				auteur = md.getString("auteur");
				note = md.getInt("note");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		textNom = new JTextField();
		textAuteur = new JTextField();
		textNote = new JTextField();
		textSerie = new JTextField();
		valider = new JButton("valider");

		this.add(new JLabel("Nom de l'image :"));
		textNom.setText(titre);
		this.add(textNom);
		this.add(new JLabel("Auteur :"));
		textAuteur.setText(auteur);
		this.add(textAuteur);
		this.add(new JLabel("Note :"));
		textNote.setText(String.valueOf(note));
		this.add(textNote);
		this.add(new JLabel("Serie :"));
		this.add(textSerie);

		valider.addActionListener(this);
		this.add(valider);

		setVisible(true);
		setSize(300, 200);
		setLocationRelativeTo(null);// centrage de la fenetre principale
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == valider) {
			String err = null;
			int note = Integer.parseInt(textNote.getText());
			if (textNom.getText() == "")
				err += "Le nom du fichier ne peut être nul<br />";
			if (note < 0 || note > 10)
				err += "La note doit être comprise entre 0 et 10<br />";
			if (err == null) {
				BDApplication.updateMetadonnees(nom, textNom.getText(),
						textAuteur.getText(), note);
			}
		}
	}
}
