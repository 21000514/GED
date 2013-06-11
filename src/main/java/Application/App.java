package Application;

import Controleurs.ControleurApplication;
import Modele.BDApplication;
import Vues.VueApplication;

/**
 * Classe principale de l'application
 * 
 */
public class App {
	public static void main(String[] args) {
		/*
		 * try { // Set cross-platform Java L&F (also called "Metal")
		 * //UIManager
		 * .setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		 * UIManager.
		 * setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		 * } catch (UnsupportedLookAndFeelException e) { // handle exception }
		 * catch (ClassNotFoundException e) { // handle exception } catch
		 * (InstantiationException e) { // handle exception } catch
		 * (IllegalAccessException e) { // handle exception }
		 */
		BDApplication modeleApp = new BDApplication();
		VueApplication vueApp = new VueApplication("GED - Projet ISTY",
				modeleApp);
		/*
		 * ControleurApplication controleurApp = new ControleurApplication(
		 * modeleApp, vueApp);
		 */

		ControleurApplication controleurApp = new ControleurApplication(
				modeleApp, vueApp);

	}

}
