package lesson.lesson11_26122018_swing.p8_table_click;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableColumnModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Enumeration;

public class SimpleTableFile1 implements ListSelectionListener {

    private JTable aTable;
    private boolean doubleclick = false;
    private String testPath = "/home/master/Documents/Test_DIR";
    File files = new File(testPath);
    JFrame frame;

    String[] names = {"File name", "Dir/file", "File size"};
    Object[][] data = fileTable(testPath);


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
            public void setValueAt(Object aValue, int row, int column) {
                data[row][column] = aValue;
            }
        };


    //String testPath = "/home/master/Documents/Test_DIR"; //LINUX
    // String testPath = "/Users/mint/Documents/test"; //Mac

    public SimpleTableFile1() {
        frame = new JFrame("File manager");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        aTable = makeTable(testPath);

        ListSelectionModel listMod = aTable.getSelectionModel();
        listMod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listMod.addListSelectionListener(this);

        JScrollPane scrollpane = new JScrollPane(aTable);
        scrollpane.setPreferredSize(new Dimension(1000, 700));
        frame.getContentPane().add(scrollpane);
        frame.pack();
        frame.setVisible(true);

        aTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    System.out.println(" double click");
                    doubleclick = true;
                }
            }
        });
    }

    public void valueChanged(ListSelectionEvent e) {
        int[] selRows;
        Object value;
        if (!e.getValueIsAdjusting()) {
            selRows = aTable.getSelectedRows();

            if (doubleclick == true && selRows[0] == 0) {
                doubleclick = false;

                testPath = files.getParent();
                aTable = makeTable(testPath);
                //System.out.println("!!!!!!!!!!!!");
                aTable.setModel(dataModel);




            }



        }
    }


    private JTable makeTable(String testPath){


        Object[][] data = fileTable(testPath);


        JTable table = new JTable(dataModel);
        return table;
    }


    private Object[][] fileTable(String path) {
        File files = new File(path);
        String data[][] = new String[files.list().length + 1][3];
        data[0][0] = "..";
        int counter = 0;
        for (int i = 0; i < files.list().length; i++) {
            if (files.listFiles()[i].isDirectory()) {
                data[counter + 1][0] = files.list()[i];
                data[counter + 1][1] = "DIR";
                counter++;
            }
        }
        for (int i = 0; i < files.list().length; i++) {
            if (files.listFiles()[i].isFile()) {
                data[counter + 1][0] = files.list()[i];
                data[counter + 1][1] = "";
                data[counter + 1][2] = String.valueOf((new File(path + "/" + files.list()[i]).length()));
                counter++;
            }
        }
        return data;
    }

    public static void main(String[] args) {
        new SimpleTableFile1();
    }
}



