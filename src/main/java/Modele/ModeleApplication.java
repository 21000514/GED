package Modele;

import java.io.File;
import java.util.Observable;

public class ModeleApplication extends Observable {

	// private ArrayList<ModeleMetadonnee> listeMetaDonnees;
	private ModeleMetadonnee modeleMetadonnee;

	public ModeleApplication() {
		// ArrayList<ModeleMetadonnee> listeMetaDonnees = new
		// ArrayList<ModeleMetadonnee>();
		modeleMetadonnee = new ModeleMetadonnee(new File("docs//test1.txt"));
	}

	public ModeleMetadonnee getModeleMetadonnee() {
		return modeleMetadonnee;
	}

	/*
	 * public ArrayList<ModeleMetadonnees> getTitres(ModeleSerie serie) { return
	 * }
	 */
}
