package Modele;

import java.io.File;
import java.util.Observable;

public class ModeleApplication extends Observable {

	// private ArrayList<Metadonnee> listeMetaDonnees;
	private Metadonnee metadonnee;
	private Liste liste;

	public ModeleApplication() {
		// ArrayList<Metadonnee> listeMetaDonnees = new
		// ArrayList<Metadonnee>();
		metadonnee = new Metadonnee(new File("docs//test1.txt"));
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
}
