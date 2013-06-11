package Vues;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

import Modele.Liste;

public class VueListe extends JPanel implements Observer {
	private Liste liste;
	private final static int NBCOL = 5;
	/*
	 * private String[] titres = {"Nom", "Taille", "Auteur", "Durée", "Note"};
	 *//*
		 * private String[] titres = {"First Name", "Last Name", "Sport",
		 * "# of Years", "Vegetarian"}; private Object[][] donnees = {
		 * {"burger", "Smith", "Snowboarding", new Integer(5), new
		 * Boolean(false)}, {"himym", "Doe", "Rowing", new Integer(3), new
		 * Boolean(true)}, {"homer", "Black", "Knitting", new Integer(2), new
		 * Boolean(false)}, {"Jane", "White", "Speed reading", new Integer(20),
		 * new Boolean(true)}, {"Joe", "Brown", "Pool", new Integer(10), new
		 * Boolean(false)} };
		 */
	private String[] titres = { "Nom", "Type", "Auteur", "Dimension", "Taille",
			"Note/10" };
	private Object[][] donnees = {
			{ "une image", "type", "auteur", "dimension", "taille",
					new Integer(10) },// , new Boolean(false)},
			{ "homer", "type", "auteur", "dimension", "taille", new Integer(10) },
			{ "himym", "type", "auteur", "dimension", "taille", new Integer(10) },
			{ "himym", "type", "auteur", "dimension", "taille", new Integer(1) },
			{ "himym", "type", "auteur", "dimension", "taille", new Integer(0) }, };
	private JTable tableListe;

	public VueListe(Liste liste) {
		setLayout(new BorderLayout()); // Pour placer liste au centre
		initListe();
	}

	public void initListe() {
		TableModel listeModele = new AbstractTableModel() {
			@Override
			public String getColumnName(int col) {
				return titres[col].toString();
			}

			public int getColumnCount() {
				return titres.length;
			}

			public Object getValueAt(int row, int col) {
				return donnees[row][col];
			}

			public int getRowCount() {
				return donnees.length;
			}

			@Override
			public Class getColumnClass(int c) {
				return getValueAt(0, c).getClass();
			}

			/*
			 * @Override public boolean isCellEditable(int row, int column) {
			 * return false; }
			 */
			@Override
			public void setValueAt(Object value, int row, int col) {
				donnees[row][col] = value;
				fireTableCellUpdated(row, col); // notifie les listeners que la
												// valeur a changee
			}
			// Requete: Select Nom From Liste Where getValueAt(1,tailleRes)

			/*
			 * @Override public Class<?> getColumnClass(int columnIndex) {
			 * switch (columnIndex) { case 0: case 1: return String.class;
			 * 
			 * case 2: return Integer.class;
			 * 
			 * case 3: return String.class;
			 * 
			 * case 4: return Long.class;
			 * 
			 * default: return Object.class; } }
			 */
		};

		tableListe = new JTable(listeModele);
		tableListe.setAutoCreateRowSorter(true);// permet de trier la liste
												// selon les titres
		/*
		 * TableColumn column = null; for (int i = 0; i < NBCOL; i++) { column =
		 * tableListe.getColumnModel().getColumn(i); if (i == 0) {
		 * column.setPreferredWidth(100); //Largeur premiere colonne column is
		 * bigger } else { column.setPreferredWidth(50); } }
		 */
		// tableListe.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		// //redimensionnement table impossible
		tableListe.getTableHeader().setBackground(new Color(227, 231, 244));
		JScrollPane sp = new JScrollPane();// creation d'un scrollpane
		sp.setViewportView(tableListe);
		// sp.setBackground(new Color(227, 231, 244));

		this.add(sp);
	}

	public JTable getTableListe() {
		return tableListe;
	}

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

}