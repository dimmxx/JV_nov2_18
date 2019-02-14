package homework.homework21;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

public class GrEngine extends JFrame {

    JLabel labelImage1 = new JLabel(new ImageIcon("res/mav/images/France.png"));
    JLabel labelImage2 = new JLabel(new ImageIcon("res/mav/images/png/England.png"));

    JTextArea textArea1 = new JTextArea();
    JTextArea textArea2 = new JTextArea();

    public GrEngine() {
        super("Maven");

        JPanel panel = new JPanel(new GridLayout(2, 2));




        textArea1.setLineWrap(true);
        textArea1.setText(readTextFile("res/mav/text/innerText.txt"));


        textArea2.setLineWrap(true);
        textArea2.setText(readTextFile("res/outerText.txt"));



        panel.add(labelImage1);
        panel.add(textArea1);

        panel.add(labelImage2);
         panel.add(textArea2);



        add(panel);

        setSize(700, 700);
        setVisible(true);
        setDefaultCloseOperation(3);


    }


    private String readTextFile(String path) {

        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                content.append(sCurrentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }


}
