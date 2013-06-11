package Vues;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class VueSeries extends JPanel implements Observer {
	private String titre = "Series";

	public VueSeries() {

		initSerie();
	}

	public void initSerie() {
		TableModel dataModel = new AbstractTableModel() {
			@Override
			public String getColumnName(int col) {
				return titre;
			}

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

		JTable tableSerie = new JTable(dataModel);
		tableSerie.getColumnModel().getColumn(0).setPreferredWidth(125);
		this.add(tableSerie);

		/*
		 * ImageIcon icon = new ImageIcon("img//gdeFond2.jpg"); JLabel img = new
		 * JLabel(icon); add(img);
		 */
	}

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}
}
