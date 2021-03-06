package lesson.lesson11_26122018_swing.p8_table_click;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.Arrays;


public class SimpleTableFile implements ListSelectionListener {

    private JTable aTable;
    private String[] names = {"File name", "Dir/file", "File size"};


    public SimpleTableFile() {
        JFrame frame = new JFrame("File Manager");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //String testPath = "/home/master/Documents/Test_DIR"; //LINUX
        String testPath = "/Users/mint/Documents/test"; //Mac


        aTable = new JTable(fileTable(testPath), names);

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

    private String[][] fileTable (String path){

        File files = new File(path);
        String data [][] = new String[files.list().length + 1][3];

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
                counter++;
            }
        }

        return data;
    }



    public static void main(String[] args) {
        new SimpleTableFile();
    }
}



