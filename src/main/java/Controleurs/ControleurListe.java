package Controleurs;

import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.JTable;

import Modele.BDApplication;
import Modele.Liste;
import Vues.VueListe;

public class ControleurListe extends MouseAdapter {
	private Liste Liste_;
	private VueListe vueListe_;
	private Desktop desk = Desktop.getDesktop();

	public ControleurListe(Liste liste, VueListe vueListe) {
		Liste_ = liste;
		vueListe_ = vueListe;
		// vueListe.getTableListe().getModel().addTableModelListener(this);
		vueListe.getTableListe().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent mE) {
				if (mE.getClickCount() == 2) {
					JTable target = (JTable) mE.getSource();
					int ligSelection = target.getSelectedRow();
					int colSelection = target.getSelectedColumn();
					String nom = (String) target.getValueAt(ligSelection, 0);
					String chemin = BDApplication.getChemin(nom);
					if (chemin != null) {
						try {
							desk.open(new File("docs//" + chemin));
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					Liste_.testLigne(ligSelection, 0, nom);
					Liste_.execlisteMetaDonneesParTitre(nom);
					// int column = target.getSelectedColumn();
					// do some action if appropriate column
				}
			}
		});

	}
	/*
	 * @Override public void tableChanged(TableModelEvent e) { int row =
	 * e.getFirstRow(); int column = e.getColumn(); TableModel model =
	 * (TableModel)e.getSource(); String titres = model.getColumnName(column);
	 * Object donnees = model.getValueAt(row, column);
	 * 
	 * // Do something with the data... }
	 * 
	 * public void actionPerformed(ActionEvent e) { //if (e.getSource() ==
	 * vueListe.getTableListe().getSelectedRow()) Liste.setExiste(true); //else
	 * if (e.getSource() == vueListe.efface ) Liste.setExiste(false); }
	 */

}
