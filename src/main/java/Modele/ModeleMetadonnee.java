package Modele;

import java.util.ArrayList;
import java.util.List;

public class ModeleMetadonnee {
	private String chemin;
	private String nom;
	private int taille;
	private long dateModif;
	private String auteur;
	private String icone;// Chemin de l'icone
	private List<ModeleTag> listeTags;

	/*
	 * public ModeleMetadonnee(File doc) { if (doc == null) { taille = 0; chemin
	 * = "0"; nom = "Inconnu"; dateModif = 0; auteur = "Inconnu"; icone = new
	 * ImageIcon("img//notFound.jpg"); listeTags = new ArrayList<ModeleTag>(); }
	 * else { taille = (int) doc.length(); chemin = doc.getPath(); nom =
	 * doc.getName(); dateModif = doc.lastModified(); auteur = "Inconnu"; icone
	 * = new ImageIcon("img//notFound.jpg"); listeTags = new
	 * ArrayList<ModeleTag>(); ajoutTag(new ModeleTag(nom)); } }
	 */

	public ModeleMetadonnee() {
		taille = 0;
		chemin = "0";
		nom = "Inconnu";
		dateModif = 0;
		auteur = "Inconnu";
		icone = "img//notFound.jpg";
		listeTags = new ArrayList<ModeleTag>();

	}

	@Override
	public String toString() {
		String res;
		res = "Nom: " + nom + "\nTaille: " + taille + "octets\n"
				+ "Modifié le: " + dateModif + "\nAuteur: " + auteur;
		return res;
	}

	public void ajoutTag(ModeleTag tag) {
		listeTags.add(tag);
	}

	public String getCheminIcone() {
		return icone;
	}

}