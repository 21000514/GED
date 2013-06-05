package Controleurs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modele.ModeleApplication;
import Vues.VueApplication;

public class ControleurApplication implements ActionListener {
	private ModeleApplication modeleApp;
	private VueApplication vueApp;

	/**
	 * @param args
	 */
	public ControleurApplication(ModeleApplication modeleApp,
			VueApplication vueApp) {
		this.modeleApp = modeleApp;
		this.vueApp = vueApp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * // TODO Auto-generated method stub if (e.getSource() ==
		 * vueApp.AttributVue) modeleApp.fonctionModele(true); else if
		 * (e.getSource() == vueApp.AttributVue )
		 * modeleApp.fonctionModele(false); }
		 */
	}

}
