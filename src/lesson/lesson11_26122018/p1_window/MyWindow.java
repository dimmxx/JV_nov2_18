//package lesson.lesson11_26122018.p1_window;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class MyWindow extends JFrame {
//
//    public MyWindow (){
//        super("My First Frame");
//        //setSize(300,300);
//        setSize(150,150);
//        setResizable(false);
//
//        JLabel label = new JLabel("Some text");
//
//        JButton button1 = new JButton("Hello1");
//        JTextField tField = new JTextField();
//        JButton button2 = new JButton("Hello2");
//        JButton button3 = new JButton("Hello3");
//        JButton button4 = new JButton("Hello4");
//        JButton button5 = new JButton("Hello5");
//        JButton button6 = new JButton("Hello6");
//
//        JPanel panel = new JPanel();
//
//       //panel.setLayout(new FlowLayout()); // по умолчанию
//         panel.setLayout(new GridLayout(2,3,5,10));
//
//        panel.add(tField);
//        panel.add(button1);
//        panel.add(button2);
//        panel.add(button3);
//        panel.add(button4);
//        panel.add(button5);
//        panel.add(button6);
//
//        add(panel);
//
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//    }
//
//
//}
