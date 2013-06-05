package Application;

import Controleurs.ControleurApplication;
import Modele.ModeleApplication;
import Vues.VueApplication;

/**
 * Classe principale de l'application
 * 
 */
public class App {
	public static void main(String[] args) {
		ModeleApplication modele = new ModeleApplication();
		VueApplication vue = new VueApplication("GED - Projet ISTY", modele);
		ControleurApplication controleur = new ControleurApplication(modele,
				vue);
	}
}
