package lesson.lesson19_06022019.p2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin extends JFrame {

    JButton b = new JButton();
    JLabel l = new JLabel();

    MyWin(){

        initListeners();

    }

//    private void initListeners() {
//        b.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                l.setText("OK");
//            }
//        });


     private void initListeners(){

    b.addActionListener((e) -> l.setText("OK"));

    }


}
