package lesson.lesson19_06022019_file_lambda.p2;

import javax.swing.*;

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
