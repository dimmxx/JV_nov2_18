package lesson.lesson11_26122018_swing.p2_window;

import javax.swing.*;
import java.awt.*;

public class MyWindows2 extends JFrame {


     public MyWindows2 (){

        super("My Frame");
        setSize(300,300);

        add(getPanel2());

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private JPanel getPanel(){
        JPanel panel = new JPanel();

        JLabel label1 = new JLabel("Login");
        JLabel label2 = new JLabel("Password");

        JTextField tField1 = new JTextField();
        JTextField tField2 = new JTextField();

        JButton button = new JButton("OK");

        panel.add(tField1);
        panel.add(tField2);
        panel.add(button);
        panel.add(label1);
        panel.add(label2);

        return panel;
    }

    private JPanel getPanel2(){
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel label1 = new JLabel("wefa");
        JLabel label2 = new JLabel("BUTT");
        JButton button = new JButton("OK");
        button.setSize(100, 65);
        button.setLocation(50,50);

        panel.add(button);
        panel.add(label1);
        panel.add(label2);

        return panel;
    }








}
