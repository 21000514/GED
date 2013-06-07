package Modele;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

public class ModeleMetadonnee extends Observable {
	private String nom;
	private String chemin;
	private int taille;
	private String dateModif;
	private String auteur;
	private String duree;
	private String icone;// Chemin de l'icone
	private List<ModeleTag> listeTags;

	/*
	 * public ModeleMetadonnee(File doc) { if (doc == null) { taille = 0; chemin
	 * = "0"; nom = "Inconnu"; dateModif = 0; auteur = "Inconnu"; icone = new
	 * ImageIcon("img//icoNotFound.jpg"); listeTags = new
	 * ArrayList<ModeleTag>(); } else { taille = (int) doc.length(); chemin =
	 * doc.getPath(); nom = doc.getName(); dateModif = doc.lastModified();
	 * auteur = "Inconnu"; icone = new ImageIcon("img//icoNotFound.jpg");
	 * listeTags = new ArrayList<ModeleTag>(); ajoutTag(new ModeleTag(nom)); } }
	 */

	public ModeleMetadonnee(File doc) {
		if (doc == null) {
			nom = "Inconnu";
			chemin = "0";
			taille = 0;
			dateModif = "Inconnu";
			auteur = "Inconnu";
			duree = "Inconnu";
			icone = "img//icoicoNotFound.jpg";
			listeTags = null;
		} else {
			nom = doc.getName();
			chemin = doc.getPath();
			taille = (int) doc.length();
			SimpleDateFormat formatDate = new SimpleDateFormat(
					"MM/dd/yyyy à HH:mm");
			dateModif = formatDate.format(doc.lastModified());
			auteur = "Inconnu";
			duree = "Inconnu";
			icone = "img//icoVideo.jpg";
			listeTags = new ArrayList<ModeleTag>();
			ajoutTag(new ModeleTag(nom));
			ajoutTag(new ModeleTag(auteur));
		}
	}

	public ModeleMetadonnee() {
		nom = "Inconnu";
		chemin = "0";
		taille = 0;
		dateModif = "Inconnu";
		auteur = "Inconnu";
		duree = "Inconnu";
		icone = "img//icoicoNotFound.jpg";
		listeTags = null;
	}

	@Override
	public String toString() {

		String res;
		res = "Nom: " + nom + "\nTaille: " + taille + " octets\n"
				+ "Modifié le: " + dateModif + "\nAuteur: " + auteur
				+ "\nDuree: " + duree + "\nMots-clés: ";
		Iterator<ModeleTag> it = listeTags.iterator();
		while (it.hasNext()) {
			res += it.next().toString() + "\n";
		}
		return res;
	}

	public void ajoutTag(ModeleTag tag) {
		listeTags.add(tag);
	}

	public String getCheminIcone() {
		return icone;
	}

}