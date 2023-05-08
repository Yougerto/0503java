package tw.org.iii.myclasses;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyTable extends JTable {
	private FoodDB foodDB;
	private MyModel myModel;
	
	public MyTable() throws Exception {
		foodDB = new FoodDB();
		foodDB.queryData(FoodDB.SQL_QUERY);
		
		myModel = new MyModel();
		setModel(myModel);
	}
	
	private class MyModel extends DefaultTableModel {

//		@Override
//		public void removeRow(int row) {
//			// TODO Auto-generated method stub
//			super.removeRow(row);
//		}

		@Override
		public int getRowCount() {
			return foodDB.getRows();
		}

		@Override
		public int getColumnCount() {
			return foodDB.getCols();
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			// TODO Auto-generated method stub
			return super.isCellEditable(row, column);
		}

		@Override
		public Object getValueAt(int row, int column) {
			return foodDB.getData(row+1, column+1);
		}

		@Override
		public void setValueAt(Object aValue, int row, int column) {
			// TODO Auto-generated method stub
			super.setValueAt(aValue, row, column);
		}
		
	}

}