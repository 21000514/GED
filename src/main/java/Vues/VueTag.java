package Vues;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class VueTag extends JPanel {
	public VueTag() {
		setBorder(new TitledBorder("Tags")); // Titre du panel
		setBackground(Color.white);
		// setOpaque(false);
		// setBackground(Color.white);
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
		this.add(listeTags);

	}
}