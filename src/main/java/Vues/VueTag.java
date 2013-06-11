package Vues;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class VueTag extends JPanel implements Observer {
	public VueTag() {
		TableModel dataModel = new AbstractTableModel() {
			public int getColumnCount() {
				return 1;
			}

			public int getRowCount() {
				return 11;
			}

			public Object getValueAt(int row, int col) {
				return new Integer(row * col);
			}
		};

		JTable tableTag = new JTable(dataModel);
		tableTag.getColumnModel().getColumn(0).setPreferredWidth(125);
		this.add(tableTag);

	}

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}
}