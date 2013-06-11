package Modele;

import java.util.Observable;

public class Recherche extends Observable {
	private String texteRech;

	public void setTexte(String texte) {
		texteRech = texte;
		notifyObservers();
	}

	public String getTexte() {
		return texteRech;
	}

}