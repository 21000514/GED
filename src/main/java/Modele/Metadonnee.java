package Modele;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Metadonnee {
	// private int id;/*
	private String nom;
	private String chemin;
	private int taille;
	private String dateModif;
	private String auteur;
	private String duree;
	private int note;
	private String icone;// Chemin de l'icone
	private ArrayList<Serie> listeSeries;// mots-clés

	public Metadonnee(File doc) {
		setMetadonnee(doc);
		ajoutSQLImage(doc);
	}

	public void ajoutSQLImage(File doc) {
		try {
			Connection connexion;
			java.sql.Statement requete;
			Class.forName("org.sqlite.JDBC");
			connexion = DriverManager.getConnection("jdbc:sqlite:dbged");
			requete = connexion.createStatement();
			ResultSet testAjout = null;// verifie lors de l'ajout que les
										// fichiers n'ont pas le meme nom
			testAjout = requete.executeQuery("select * from images where nom='"
					+ doc.getName() + "'");
			try {
				if (testAjout.next() == false) {// Si l'image n'existe pas dans
												// la base
					requete.executeUpdate("insert into images values('"
							+ doc.getName() + "','" + doc.getPath() + "','"
							+ doc.length() + "','" + "Auteur inconnu" + "','"
							+ "Dim inconnue" + "'," + "null" + ",'"
							+ "extension" + "','" + "img//icoNotFound.png"
							+ "')");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (int i = 0; i < listeSeries.size(); i++) {
				String tag = listeSeries.get(i).toString();
				// tester si les tags existents
				testAjout = null;
				testAjout = requete
						.executeQuery("select * from tags where nomTag='"
								+ doc.getName() + "'");
				try {
					if (testAjout.next() == false) {// Si le tag de cet image
													// n'existe pas dans la base
						// requete.executeUpdate("insert into tags values((select max(idTag)from tags),'"
						// + tag + "','" + +"')");
						// Ici max designe l'image qui vient d'etre crée
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setMetadonnee(File doc) {
		if (doc == null) {
			nom = "Inconnu";
			chemin = "0";
			taille = 0;
			dateModif = "Inconnu";
			auteur = "Inconnu";
			duree = "Inconnu";
			note = 0;
			icone = "img//icoNotFound.png";
			listeSeries = null;
		} else {
			nom = doc.getName();
			chemin = doc.getPath();
			taille = (int) doc.length();
			auteur = "Inconnu";
			SimpleDateFormat formatDate = new SimpleDateFormat(
					"MM/dd/yyyy à HH:mm");
			dateModif = formatDate.format(doc.lastModified());
			// auteur = "Inconnu";
			duree = "Inconnu";
			note = 0;
			icone = "img//icoVideo.png";
			listeSeries = new ArrayList<Serie>();
			// listeSeries.add(new Serie(nom));
			// listeSeries.add(new Serie(auteur));

		}
	}

	public Metadonnee() {
		nom = "Inconnu";
		chemin = "0";
		taille = 0;
		dateModif = "Inconnu";
		auteur = "Inconnu";
		duree = "Inconnu";
		note = 0;
		icone = "img//icoNotFound.png";
		listeSeries = null;

	}

	@Override
	public String toString() {

		String res;
		res = "Nom: " + nom + "\nTaille: " + taille + " octets\n"
				+ "Modifié le: " + dateModif + "\nAuteur: " + auteur
				+ "\nDuree: " + duree + "\nNote: " + note + "/10\nMots-clés: ";
		return res;
	}

	public String getCheminIcone() {
		return icone;
	}

	public ArrayList<Serie> getListeTags() {
		return listeSeries;
	}

}