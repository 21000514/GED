package Modele;

import java.util.ArrayList;
import java.util.Observable;

public class Tag extends Observable {

	public ArrayList<Metadonnee> listeMetaDonnees;
	public ArrayList<Tag> listeTags;

	public Tag() {
		listeMetaDonnees = new ArrayList<Metadonnee>();
		listeTags = new ArrayList<Tag>();
	}

	public void ajoutFinListeMetadonnee(Metadonnee m) {
		listeMetaDonnees.add(m);
	}

	public void ajoutNiemeListeMetadonnee(int n, Metadonnee m) {
		listeMetaDonnees.add(n, m);
	}

	public void ajoutListeTags(Tag tag) {
		listeTags.add(tag);
	}

}
