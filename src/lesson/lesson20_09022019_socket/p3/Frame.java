package lesson.lesson20_09022019_socket.p3;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Frame extends JFrame {

    private JLabel image;
    private JLabel path;
    private JLabel text;
    private File file = new File("res/plane/plane.png");

    public Frame() throws HeadlessException {

        super("MainFrame");
        setSize(700, 700);
        image = new JLabel(new ImageIcon(file.getAbsoluteFile().toString()));
        image.setSize(50, 50);
        image.setLocation(50, 50);

        path = new JLabel(file.getAbsoluteFile().toString());

        add(image);
        add(path);


        setDefaultCloseOperation(3);
        setVisible(true);

    }








    public static void main(String[] args) {


        new Frame();











    }





}
