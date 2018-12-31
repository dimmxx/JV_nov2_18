package lesson.classwork_26122018.sw;


import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowDisp {


    public static void main(String avg[]) throws IOException {
        new WindowDisp();
    }

    public WindowDisp() throws IOException {

        JLabel label = new JLabel();
        //BufferedImage img = ImageIO.read(new File("run.png"));

        ImageIcon icon = new ImageIcon(new ImageIcon("run.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
        label.setIcon(icon);

        //ImageIcon icon = new ImageIcon(img);
        JFrame frame = new JFrame();
        //frame.setLayout(null);
        frame.setSize(700, 700);

        label.setIcon(icon);
        //lbl.setLocation(10,10);
        //lbl.setSize(300,200);

        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

