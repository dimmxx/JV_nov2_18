package lesson.lesson11_26122018_swing.p8_table_click;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;


public class SimpleTable implements ListSelectionListener {

    JTable aTable;

    public SimpleTable() {
        JFrame frame = new JFrame("Table");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        final String[] names = {"First Name", "Last Name", "Id"};
        final Object[][] data = {
                {"Mark", "Andrews", new Integer(1)},
                {"Tom", "Ball", new Integer(2)},
                {"Alan", "Chung", new Integer(3)},
        };

        TableModel dataModel = new AbstractTableModel() {
            public int getColumnCount() {
                return names.length;
            }

            public int getRowCount() {
                return data.length;
            }

            public Object getValueAt(int row, int col) {
                return data[row][col];
            }

            public String getColumnName(int column) {
                return names[column];
            }

            public Class getColumnClass(int col) {
                return getValueAt(0, col).getClass();
            }

            public void setValueAt(Object aValue, int row, int column) {
                data[row][column] = aValue;
            }
        };

        aTable = new JTable(dataModel);

        ListSelectionModel listMod = aTable.getSelectionModel();
        listMod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listMod.addListSelectionListener(this);

        JScrollPane scrollpane = new JScrollPane(aTable);
        scrollpane.setPreferredSize(new Dimension(700, 700));
        frame.getContentPane().add(scrollpane);
        frame.pack();
        frame.setVisible(true);

        aTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    System.out.println(" double click");
                }
            }
        });
    }

    public void valueChanged(ListSelectionEvent e) {
        int maxRows;
        int[] selRows;
        Object value;

        if (!e.getValueIsAdjusting()) {
            selRows = aTable.getSelectedRows();

            if (selRows.length > 0) {
                for (int i = 0; i < 3; i++) {
                    // get Table data
                    TableModel tm = aTable.getModel();
                    value = tm.getValueAt(selRows[0], i);
                    System.out.println("Selection : " + value);
                }
                System.out.println();
            }
        }
    }



//    public void fileTable(){
//
//         String testPath = "/home/master/Documents/Test_DIR"; //LINUX
//        //String testPath = "/Users/mint/Documents/test"; //Mac
//
//        File files = new File(testPath);
//
//
//        final String[] ColNames = {"Name", "Size", "Permissions"};
//        final String[][] fileData = new String[files.listFiles().length][3];
//
//        for (int i = 0; i < fileData.length; i++){
//            fileData[i][0] = files.list();
//
//
//
//    }



    public static void main(String[] args) {
        new SimpleTable();
    }
}



