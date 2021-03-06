package lesson.lesson11_26122018_swing.p4_pass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Password extends JFrame {

    JButton button = new JButton("OK");
    JButton buttonBack = new JButton("Back");
    JTextField tField1 = new JTextField(20);
    JTextField tField2 = new JTextField(20);
    JLabel label1 = new JLabel("Login");
    JLabel label2 = new JLabel("PasswordCL");
    JLabel label3 = new JLabel();

    JPanel panel1 = getPanel1();
    JPanel panel2 = getPanel2();


    public Password() {
        super("My Frame");
        setSize(500, 300);
        add(panel1);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initListeners();
    }

    private void initListeners() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonPressed();
            }
        });
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonBackPressed();
            }
        });
    }


    private void ifButtonPressed() {
        if (checkCred1()) {
            label3.setText("Access granted");
            panel1.removeAll();
            add(panel2);
        } else {
            label3.setText("Access denied");
        }
    }

    private void ifButtonBackPressed() {


        repaint();

        add(getPanel1());
    }


    public boolean checkCred1() {
        if (Objects.equals(tField1.getText(), "") & Objects.equals(tField2.getText(), "")) {
            return true;
        }
        return false;
    }

    private JPanel getPanel1() {
        JPanel panel = new JPanel();
        panel.add(tField1);
        panel.add(label1);
        panel.add(tField2);
        panel.add(label2);
        panel.add(button);

        panel.add(label3);
        return panel;
    }

    private JPanel getPanel2() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(50, 150, 60));
        panel.add(buttonBack);
        return panel;
    }


}
