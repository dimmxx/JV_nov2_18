package lesson.classwork_26122018.sw;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ResizeImage extends JFrame{

    public static void main(String[] args) throws IOException {
        new ResizeImage();
    }

        public ResizeImage() throws IOException {

        JLabel label = new JLabel();
        JLabel label1 = new JLabel();

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

       //panel2.setBackground();


        ImageIcon icon = new ImageIcon(new ImageIcon("cells.png").getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT));
        ImageIcon icon1 = new ImageIcon(new ImageIcon("run.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));

        JFrame frame = new JFrame();
        frame.add(panel1);
        frame.add(panel2);
        frame.setSize(700, 700);



        label.setIcon(icon);
        label1.setIcon(icon1);

        panel1.add(label);
        panel2.add(label1);
       // frame.add(label1);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
