package Vues;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;


public class VueTags extends JPanel
{
	public VueTags()
	{
		
		  TableModel dataModel = new AbstractTableModel() {
	          public int getColumnCount() { return 1; }
	          public int getRowCount() { return 30;}
	          public Object getValueAt(int row, int col) { return new Integer(row*col); }
	      };
		
		JTable listeTags = new JTable(dataModel);
		this.add(listeTags);
		
	}
}