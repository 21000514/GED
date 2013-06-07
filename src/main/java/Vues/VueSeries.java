package Vues;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class VueSeries extends JPanel {
	public VueSeries() {
		setBorder(new TitledBorder("Series")); // Titre du panel
		/* Background */
		setBackground(Color.white);

		TableModel dataModel = new AbstractTableModel() {
			public int getColumnCount() {
				return 1;
			}

			public int getRowCount() {
				return 8;
			}

			public Object getValueAt(int row, int col) {
				return new Integer(row * col);
			}
		};

		JTable listeTags = new JTable(dataModel);
		this.add(listeTags);

		/*
		 * ImageIcon icon = new ImageIcon("img//gdeFond2.jpg"); JLabel img = new
		 * JLabel(icon); add(img);
		 */
	}
}
