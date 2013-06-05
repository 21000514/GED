package Vues;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class VueListe extends JPanel {
	public VueListe() {

		TableModel dataModel = new AbstractTableModel() {
			public int getColumnCount() {
				return 1;
			}

			public int getRowCount() {
				return 30;
			}

			public Object getValueAt(int row, int col) {
				return new Integer(row * col);
			}
		};

		JTable listeTags = new JTable(dataModel);

		JScrollPane scrollPane = new JScrollPane(listeTags);
		this.add(scrollPane);

	}

}