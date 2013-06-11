package Modele;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

public class Liste extends Observable {
	private ArrayList<Metadonnee> listeMetadonnees;

	public Liste() {
		listeMetadonnees = new ArrayList<Metadonnee>();
	}

	public ArrayList<Metadonnee> getListeMetadonnees() {
		return listeMetadonnees;
	}

	public void ajoutListe(File doc) {
		Metadonnee meta = new Metadonnee(doc);
		listeMetadonnees.add(meta);
	}

	public void retraitListe(int rangee) {
		listeMetadonnees.remove(listeMetadonnees.get(rangee));
	}

	public void testLigne(int lig, int col, String nom) {// a renommer en
															// lecture
		System.out.println("lig: " + lig + " col:" + col + " nom: " + nom);

		setChanged();
		notifyObservers();
	}

	public ResultSet listeMetaDonnee() {
		Connection connexion;
		java.sql.Statement requete;
		ResultSet resultat = null;
		try {
			Class.forName("org.sqlite.JDBC");
			connexion = DriverManager.getConnection("jdbc:sqlite:dbged");
			requete = connexion.createStatement();
			resultat = requete.executeQuery("select * from images");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultat;
	}

	public ResultSet listeMetaDonneesParTitre(String titre) {
		Connection connexion;
		java.sql.Statement requete;
		ResultSet resultat = null;
		try {
			Class.forName("org.sqlite.JDBC");
			connexion = DriverManager.getConnection("jdbc:sqlite:dbged");
			requete = connexion.createStatement();
			resultat = requete.executeQuery("select * from images where nom='"
					+ titre + "'");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultat;
	}

	public String[][] execlisteMetaDonnee() {
		int i = 0;
		String[][] listeRes = null;
		// ArrayList<String> listeRes;
		ResultSet resultat = null;
		resultat = listeMetaDonnee();
		try {
			while (resultat.next()) {
				listeRes[i] = new String[9];
			}
		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		setChanged();
		notifyObservers();
		return listeRes;
	}

	public void execlisteMetaDonneesParTitre(String nom) {
		ResultSet resultat = null;
		resultat = listeMetaDonneesParTitre(nom);
		try {
			while (resultat.next()) {
				System.out.println(resultat.getString("nom"));
			}
		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		setChanged();
		notifyObservers();
	}

}
