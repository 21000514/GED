package Modele;

import java.util.ArrayList;

public class ModeleSerie {
	public ArrayList<ModeleMetadonnee> listeMetaDonnees;
	public ModeleTag modeleTag;

	public ModeleSerie() {
		listeMetaDonnees = new ArrayList();
	}

	public void addn(int n, ModeleMetadonnee m) {
		listeMetaDonnees.add(n, m);
	}
	/*
	 * public void addTags(String s) { modeleTag.addTags(s); }
	 */
}