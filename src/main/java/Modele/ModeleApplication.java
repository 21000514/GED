package Modele;

import java.util.Observable;

public class ModeleApplication extends Observable {

	// private ArrayList<ModeleMetadonnee> listeMetaDonnees;
	private ModeleMetadonnee modeleMetadonnee;

	public ModeleApplication() {
		// ArrayList<ModeleMetadonnee> listeMetaDonnees = new
		// ArrayList<ModeleMetadonnee>();
		modeleMetadonnee = new ModeleMetadonnee();
	}

	public ModeleMetadonnee getModeleMetadonnee() {
		return modeleMetadonnee;
	}

	/*
	 * public ArrayList<ModeleMetadonnees> getTitres(ModeleSerie serie) { return
	 * }
	 */
}
