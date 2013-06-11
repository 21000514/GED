package Controleurs;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;

import Modele.BDApplication;
import Vues.VueApplication;
import Vues.VueEdition;

public class ControleurApplication implements ActionListener {
	private BDApplication modeleApp;
	private VueApplication vueApp;
	private ControleurListe controleurListe;

	/**
	 * @param args
	 */
	public ControleurApplication(BDApplication modeleApp, VueApplication vueApp) {
		this.modeleApp = modeleApp;
		this.vueApp = vueApp;
		controleurListe = new ControleurListe(modeleApp.getListe(),
				vueApp.getVueListe());
		for (int i = 0; i < vueApp.getVueCommande().NBBOUTONS; i++) {
			this.vueApp.getVueCommande().getBoutons(i).addActionListener(this);
		}
	}

	/*
	 * public void actionPerformed(ActionEvent e) {
	 * 
	 * // TODO Auto-generated method stub if (e.getSource() ==
	 * vueApp.AttributVue) modeleApp.fonctionModele(true); else if
	 * (e.getSource() == vueApp.AttributVue ) modeleApp.fonctionModele(false); }
	 * 
	 * }
	 */

	public void actionPerformed(ActionEvent e) {
		int i = 0;
		/*
		 * while(!e.getSource().equals(vueApp.getVueCommande().getBoutons(i))) {
		 * i++; }
		 */

		if (e.getSource().equals(vueApp.getVueCommande().getBoutons(0))) {// bouton
																			// ajout
			System.out.println("bouton ajout");
			File fichier;
			FileFilter ff = new FileFilter() {
				@Override
				public boolean accept(File f) {
					if (f.isDirectory())
						return true;
					else if (f.getName().endsWith(".jpg"))
						return true;
					else if (f.getName().endsWith(".jpeg"))
						return true;
					else if (f.getName().endsWith(".png"))
						return true;
					else
						return false;
				}

				@Override
				public String getDescription() {
					return "Fichiers images (*.jpg,*.jpeg,*.png)";
				}
			};
			JFileChooser chooser = new JFileChooser(new File("."));
			chooser.setAcceptAllFileFilterUsed(false); // desactive le filter
														// "tous les fichiers"
			chooser.addChoosableFileFilter(ff);
			int val = chooser.showOpenDialog(null);

			if (val == JFileChooser.APPROVE_OPTION) {
				fichier = chooser.getSelectedFile();
				System.out.println("Test-> Nom fichier: " + fichier.getName());
				modeleApp.getListe().ajoutListe(fichier);
				// modeleApp.getListe().majListe(fichier.getName());

			}
			vueApp.repaint();
			vueApp.getVueListe().repaint();
			vueApp.getVueListe().revalidate();
			System.out.println("fichier");
		}
		if (e.getSource().equals(vueApp.getVueCommande().getBoutons(1))) {// bouton
																			// retrait

		}
		if (e.getSource().equals(vueApp.getVueCommande().getBoutons(2))) {// bouton
																			// edit
			JTable table = vueApp.getVueListe().getTableListe();
			int ligneSelectionnee = table.getSelectedRow();
			if (ligneSelectionnee != -1) {
				String nomDoc = (String) table.getValueAt(ligneSelectionnee, 0);
				new VueEdition(nomDoc);
			}
		}
		if (e.getSource().equals(vueApp.getVueCommande().getBoutons(3))) {// bouton
			// edit
			JTable table = vueApp.getVueListe().getTableListe();
			Desktop desk = Desktop.getDesktop();
			int ligneSelectionnee = table.getSelectedRow();
			if (ligneSelectionnee != -1) {
				String nom = (String) table.getValueAt(ligneSelectionnee, 0);
				String chemin = BDApplication.getChemin(nom);
				if (chemin != null) {
					try {
						desk.open(new File("docs//" + chemin));
					} catch (Exception exc) {
						exc.printStackTrace();
					}
				}
			}
		}
	}
}
