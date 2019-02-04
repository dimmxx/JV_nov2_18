package homework.homework18;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GUIEngine extends JFrame {

    public final static int FRAME_WIDTH = 900;
    public final static int FRAME_HEIGHT = 800;

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private int xPos = screenSize.width / 2 - FRAME_WIDTH / 2;
    private int yPos = screenSize.height / 2 - FRAME_HEIGHT / 2;

    private String saveText;
    private String loadText;

    private Image image;

    private String imageURL = "res/internalization/England.png";

    private JButton buttonRU = new JButton("Русский");
    private JButton buttonSP = new JButton("Español");
    private JButton buttonEN = new JButton("English");
    private JButton buttonFR = new JButton("Français");

    private JButton buttonSave = new JButton(saveText);
    private JButton buttonLoad = new JButton(loadText);

    private JLabel label = new JLabel();


    JPanel panel = getPanel();


    public GUIEngine(Pudge pudge) {
        super("Pudge International");
        setBounds(xPos, yPos, FRAME_WIDTH, FRAME_HEIGHT);
        add(panel);


        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(3);
        initListeners();

    }

    private void initListeners() {
        buttonEN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonENPressed();
            }
        });

        buttonRU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonRUressed();
            }
        });

        buttonFR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonFRPressed();
            }
        });

        buttonSP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonSPPressed();
            }
        });

        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonSavePressed();
            }
        });

        buttonLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonLoadPressed();
            }
        });


    }

    private JPanel getPanel() {
        JPanel panel = new JPanel(new FlowLayout());
        panel.setBackground(new Color(70, 80, 255));

        drawImage();

        panel.add(buttonRU);
        panel.add(buttonEN);
        panel.add(buttonFR);
        panel.add(buttonSP);
        panel.add(buttonSave);
        panel.add(buttonLoad);
        panel.add(drawImage());

        return panel;
    }

    public JLabel drawImage() {

        JLabel label = new JLabel();

        try {
            image = ImageIO.read(new File(imageURL));

        } catch (
                IOException e) {
            e.printStackTrace();
        }

        ImageIcon icon = new ImageIcon(image);

        label.setIcon(icon);
        return label;
    }


    private void ifButtonRUressed() {

    }

    private void ifButtonENPressed() {

    }

    private void ifButtonFRPressed() {

    }

    private void ifButtonSPPressed() {


    }

    private void ifButtonSavePressed() {


    }

    private void ifButtonLoadPressed() {


    }


}
