package Modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Observable;

public class BDApplication extends Observable {

	// private ArrayList<Metadonnee> listeMetaDonnees;
	private Metadonnee metadonnee;
	private Liste liste;

	public BDApplication() {
		// ArrayList<Metadonnee> listeMetaDonnees = new
		// ArrayList<Metadonnee>();
		initdatabase();
		// metadonnee = new Metadonnee(new File("docs//test1.txt"));
		liste = new Liste();

	}

	public Metadonnee getMetadonnee() {
		return metadonnee;
	}

	public Liste getListe() {
		return liste;
	}

	/*
	 * public ArrayList<Metadonnees> getTitres(Serie serie) { return }
	 */

	public void notifyObserver(String str) {
		/*
		 * if(str.matches("^0[0-9]+")) str = str.substring(1, str.length());
		 * 
		 * for(Observer obs : listObserver) obs.update(str);
		 */
	}

	public void removeObserver() {
		// listObserver = new ArrayList<Observer>();
	}

	public void initdatabase() {
		try {
			Connection connexion;
			java.sql.Statement requete;

			Class.forName("org.sqlite.JDBC");
			connexion = DriverManager.getConnection("jdbc:sqlite:dbged");

			requete = connexion.createStatement();

			// Creation des tables images, series et tags (images ne prend pas
			// d'id car on veut des noms differents pour les selectionner
			// facilement ds la liste)
			requete.executeUpdate("create table if not exists images "
					+ "(nom text primary key, chemin text not null,"
					+ "taille number(10), auteur text, dimensions text,"
					+ " note number(2) check (note>=0 AND note<=10), type text, icone text)");
			requete.executeUpdate("create table if not exists series"
					+ "(idSerie number(10) primary key,nomSerie text,nomImage text)");
			requete.executeUpdate("create table if not exists tags "
					+ "(idTag number(10) primary key,nomTag text, nomImage text)");
			requete.executeUpdate("create table if not exists tags "
					+ "(idTag number(10) primary key,nomTag text, nomImage text)");
			// System.out.println("test");

			requete.close();
			connexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static ResultSet listeMetaDonneesParTitre(String titre) {
		Connection connexion;
		java.sql.Statement requete;
		ResultSet resultat = null;
		try {
			Class.forName("org.sqlite.JDBC");
			connexion = DriverManager.getConnection("jdbc:sqlite:dbged");
			requete = connexion.createStatement();
			resultat = requete.executeQuery("select * from images where nom='"
					+ titre + "'");
			return resultat;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultat;
	}

	public static String getChemin(String nom) {
		String str = null;
		Connection connexion;
		java.sql.Statement requete;
		ResultSet resultat = null;
		try {
			Class.forName("org.sqlite.JDBC");
			connexion = DriverManager.getConnection("jdbc:sqlite:dbged");
			requete = connexion.createStatement();
			resultat = requete
					.executeQuery("select chemin from images where nom='" + nom
							+ "'");

			if (resultat.next())
				str = resultat.getString("chemin");
			requete.close();
			connexion.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;

	}

	public static void updateMetadonnees(String oldnom, String nom,
			String auteur, int note) {
		try {
			Connection connexion;
			java.sql.Statement requete;

			Class.forName("org.sqlite.JDBC");
			connexion = DriverManager.getConnection("jdbc:sqlite:dbged");

			requete = connexion.createStatement();

			requete.executeUpdate("update images set auteur ='" + auteur
					+ "' where nom='" + oldnom + "'");
			requete.executeUpdate("update images set note ='" + note
					+ "' where nom='" + oldnom + "'");
			requete.executeUpdate("update images set nom ='" + nom
					+ "' where nom='" + oldnom + "'");

			requete.close();
			connexion.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
