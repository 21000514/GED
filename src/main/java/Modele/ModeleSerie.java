package Modele;

import java.util.ArrayList;
import java.util.Observable;

public class ModeleSerie extends Observable {
	public ArrayList<ModeleMetadonnee> listeMetaDonnees;
	public ArrayList<ModeleTag> listeTags;

	public ModeleSerie() {
		listeMetaDonnees = new ArrayList<ModeleMetadonnee>();
		listeTags = new ArrayList<ModeleTag>();
	}

	public void ajoutFinListeMetadonnee(ModeleMetadonnee m) {
		listeMetaDonnees.add(m);
	}

	public void ajoutNiemeListeMetadonnee(int n, ModeleMetadonnee m) {
		listeMetaDonnees.add(n, m);
	}

	public void ajoutListeTags(ModeleTag tag) {
		listeTags.add(tag);
	}

}