package lesson.lesson11_26122018_swing.p1_window;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {

    public MyWindow (){
        super("My First Frame");
        setSize(700,300);
        //setResizable(false);

        add(getPanel());

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private JPanel getPanel(){

        JLabel label = new JLabel("Enter login and pasword");

        JButton button1 = new JButton("OK");
        JButton button2 = new JButton("Cancel");

        JTextField tFieldLogin = new JTextField();
        JTextField tFieldPass = new JTextField();

        JPanel panel = new JPanel();

        //panel.setLayout(new FlowLayout()); // по умолчанию
        //panel.setLayout(new GridLayout(2,3,5,10));
        panel.setLayout(null);
        Font font = new Font("Serif", Font.BOLD, 14);

        label.setLocation(20, 10);
        label.setSize(500,30);
        label.setFont(font);

        button1.setLocation(20,52);
        button1.setSize(100,50);
        button2.setLocation(20,104);
        button2.setSize(100,50);
        tFieldLogin.setLocation(170, 52);
        tFieldPass.setLocation(170, 104);
        tFieldLogin.setSize(300, 30);
        tFieldPass.setSize(300, 30);
        tFieldLogin.setFont(font);
        tFieldPass.setFont(font);

        panel.add(label);
        panel.add(tFieldLogin);
        panel.add(tFieldPass);
        panel.add(button1);
        panel.add(button2);

        return  panel;
    }



}
