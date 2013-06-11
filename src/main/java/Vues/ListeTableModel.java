package Vues;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import Modele.Liste;
import Modele.Metadonnee;

public class ListeTableModel extends AbstractTableModel {

	private Liste liste;
	private Object[][] donnees;

	ListeTableModel(ArrayList<Metadonnee> listeMetadonnees) {
		this.liste = liste;
	}

	/*
	 * Object[] getData() { return new Object[] {getNom(), getPrenom(), ...}; }
	 * Object[][] data = new Object[listeMetadonnees.size()][];
	 * 
	 * for (int i=0; i<(listeMetadonnees.size()); i++)
	 * donnees[i]=liste.get(i).getData();
	 * 
	 * //JTable j = new JTable(donnees, new Object[] {"Nom","Prénom",...});
	 * 
	 * @Override public String getColumnName(int col) { return
	 * titres[col].toString(); }
	 * 
	 * public int getColumnCount() { return titres.length; }
	 * 
	 * public Object getValueAt(int row, int col) { return donnees[row][col]; }
	 * 
	 * public int getRowCount() { return donnees.length; }
	 * 
	 * @Override public Class getColumnClass(int c) { return getValueAt(0,
	 * c).getClass(); }
	 * 
	 * 
	 * @Override public void setValueAt(Object value, int row, int col) {
	 * donnees[row][col] = value; fireTableCellUpdated(row, col); // notifie les
	 * listeners que la // valeur a changee } // Requete: Select Nom From Liste
	 * Where getValueAt(1,tailleRes)
	 */

	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
