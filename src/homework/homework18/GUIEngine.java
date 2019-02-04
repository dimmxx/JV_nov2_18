package homework.homework18;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class GUIEngine extends JFrame {

    public final static int FRAME_WIDTH = 900;
    public final static int FRAME_HEIGHT = 800;

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private int xPos = screenSize.width / 2 - FRAME_WIDTH / 2;
    private int yPos = screenSize.height / 2 - FRAME_HEIGHT / 2;

    private static final Locale localeEN = new Locale("en", "EN");
    private static final Locale localeFR = new Locale("fr", "FR");
    private static final Locale localeES = new Locale("es", "ES");
    private static final Locale localeRU = new Locale("ru", "RU");

    private Image image;

    private JButton buttonRU = new JButton("Русский");
    private JButton buttonSP = new JButton("Español");
    private JButton buttonEN = new JButton("English");
    private JButton buttonFR = new JButton("Français");

    private JButton buttonSave = new JButton();
    private JButton buttonLoad = new JButton();

    private JLabel label = new JLabel();
    private JLabel labelPhrase = new JLabel();

    JPanel panel = getPanel();

    Pudge pudge = null;
    ResourceBundle localData = null;

    public GUIEngine() throws IOException, ClassNotFoundException {
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
                try {
                    ifButtonRUressed();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
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

    private JPanel getPanel() throws IOException, ClassNotFoundException {
        JPanel panel = new JPanel(new FlowLayout());
        panel.setBackground(new Color(70, 80, 255));

        pudge = DataStreamEngine.loadState();
        localize();

        panel.add(buttonRU);
        panel.add(buttonEN);
        panel.add(buttonFR);
        panel.add(buttonSP);
        panel.add(buttonSave);
        panel.add(buttonLoad);
        panel.add(labelPhrase);
        panel.add(drawImage());

        return panel;
    }

    public void localize() {
        localData = ResourceBundle.getBundle("TextBundle", pudge.getLocale());
        buttonSave.setText(localData.getString("save"));
        buttonLoad.setText(localData.getString("load"));
        labelPhrase.setText(localData.getString("phrase"));
    }


    public JLabel drawImage() {
        JLabel label = new JLabel();
        try {
            image = ImageIO.read(new File(localData.getString("url")));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        ImageIcon icon = new ImageIcon(image);
        label.setIcon(icon);
        return label;
    }


    private void ifButtonRUressed() throws IOException, ClassNotFoundException {
        Pudge pudge = new Pudge(localeRU);
        localize();

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
