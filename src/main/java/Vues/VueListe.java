package Vues;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class VueListe extends JPanel {
	public VueListe() {
		setBorder(new TitledBorder("Liste")); // Titre du panel
		// setBackground(Color.white);
		setOpaque(false);
		// CONTROLEUR
		TableModel dataModel = new AbstractTableModel() {

			/*
			 * public int getColumnCount() { return 3; }
			 */
			@Override
			public int getColumnCount() {
				// TODO Auto-generated method stub
				return 6;
			}

			@Override
			public int getRowCount() {
				return 30;
			}

			@Override
			public Object getValueAt(int row, int col) {
				return new Integer(row * col);
			}

			/*
			 * Requete: Select Nom From Liste Where getValueAt(1,tailleRes)
			 */
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				switch (columnIndex) {
				case 0:
				case 1:
					return String.class;

				case 2:
					return Integer.class;

				case 3:
					return String.class;

				case 4:
					return Long.class;

				default:
					return Object.class;
				}
			}

		};

		JTable listeTags = new JTable(dataModel);

		JScrollPane scrollPane = new JScrollPane(listeTags);
		this.add(scrollPane);

	}

}