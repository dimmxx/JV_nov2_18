package homework.homework16;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeTable extends JPanel {


    public ShapeTable() {
        super(new GridLayout(1, 0));

        JTable table = new JTable(new MyTableModel());
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);

        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this panel.
        add(scrollPane);
    }

    class MyTableModel extends AbstractTableModel {

        DbWorkerItea2 worker = new DbWorkerItea2();
        private List<ShapeClass> list = worker.getShapeAll();
        private int tableLength = list.size();

        private String[] columnNames = {"id", "name", "area", "perimeter", "user"};
        private String[][] data = new String[tableLength][5];

        public MyTableModel(){
            fillArray();;
        }


        public void fillArray(){


            

//            for (int i = 0; i < tableLength; i++){
//                for (int k = 0; k < 5; k++){
//                    data[i][k] = "empty";
//                }
//            }


        }

        public int getColumnCount() {
            return columnNames.length;
        }

        public int getRowCount() {
            //return data.length;
            return 0;
        }

        public String getColumnName(int col) {
            return columnNames[col];
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            return null;
        }


    }


}





















