package Modele;

import java.util.Observable;

public class Serie extends Observable {

	private String nom;

	public Serie(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}

}