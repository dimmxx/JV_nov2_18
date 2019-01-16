package lesson.lesson11_26122018_swing.p4_pass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Password extends JFrame {

    JButton button = new JButton("OK");
    JTextField tField1 = new JTextField();
    JTextField tField2 = new JTextField();
    JLabel label3 = new JLabel("...");



    public Password(){
        super("My Frame");
        setSize(300,300);
        add(getPanel());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initListeners();
    }

    private void initListeners(){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                ifButtonPressed();

            }
        });
    }



    private void ifButtonPressed(){
        if(checkCred1()) {

            label3.setText("Granted");



        }

    }






    public boolean checkCred1() {
        if (Objects.equals(tField1.getText(), ""))      {
            return true;
        }
        return false;
    }

     public boolean checkCred2() {
        if (Objects.equals(tField2.getText(), "")){
            return true;
        }
        return false;
    }


    private JPanel getPanel(){
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Login");
        JLabel label2 = new JLabel("Password");
        panel.add(tField1);
        panel.add(tField2);
        panel.add(button);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        return panel;
    }

}
