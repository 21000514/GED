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
		ModeleApplication modeleApp = new ModeleApplication();
		VueApplication vueApp = new VueApplication("GED - Projet ISTY",
				modeleApp);
		ControleurApplication controleurApp = new ControleurApplication(
				modeleApp, vueApp);
	}
}
