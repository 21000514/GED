package Vues;

import javax.swing.table.AbstractTableModel;

class MyTableModel extends AbstractTableModel {

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
	/*
	 * private String[] columnNames = { "First Name", "Last Name", "Sport",
	 * "# of Years", "Vegetarian" };
	 * 
	 * //ArrayList<MyObject> list = null; // MyTableModel(ArrayList<MyObject>
	 * list) { MyTableModel(Liste liste) { this.liste = liste; }
	 * 
	 * public int getColumnCount() { return columnNames.length; }
	 * 
	 * public int getRowCount() { return liste.size(); }
	 * 
	 * @Override public String getColumnName(int col) { return columnNames[col];
	 * }
	 * 
	 * public Object getValueAt(int row, int col) {
	 * 
	 * MyObject object = liste.get(row);
	 * 
	 * switch (col) { case 0: return object.firstName; case 1: return
	 * object.lastName; case 2: return object.sport; case 3: return
	 * object.years; case 4: return object.isVeg; default: return "unknown"; } }
	 * 
	 * @Override public Class getColumnClass(int c) { return getValueAt(0,
	 * c).getClass(); }
	 */
}