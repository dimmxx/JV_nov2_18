package lesson.lesson11_26122018.p3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWind3 extends JFrame{


    JLabel label = new JLabel("Some text");
    JButton button = new JButton("Press me");

    MyWind3(){
        setSize(300, 300);
        setVisible(true);
        add(label, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
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
        label.setText("Button was pressed");

    }







}