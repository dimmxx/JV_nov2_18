package homework.homework16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsEn extends JFrame {

    public final static int FRAME_WIDTH = 800;
    public final static int FRAME_HEIGHT = 700;

    private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    private int xPos = screenSize.width / 2 - FRAME_WIDTH / 2;
    private int yPos = screenSize.height / 2 - FRAME_HEIGHT / 2;

    private JButton buttonC = new JButton("Circle");
    private JButton buttonT = new JButton("Triangle");
    private JButton buttonR = new JButton("Rectangular");
    private JButton buttonBack = new JButton("Back");
    private JButton buttonCreate = new JButton("Create shape");
    private JTextField field1 = new JTextField(10);

    JPanel panelShape = getPanelShape();

    public GraphicsEn() {
        super("F-Factory");
        setBounds(xPos, yPos, FRAME_WIDTH, FRAME_HEIGHT);

        add(panelShape);

        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(3);
        initListeners();

    }

    private void initListeners(){
        buttonC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonCPressed();
            }
        });

        buttonR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonRPressed();
            }
        });

        buttonT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonTPressed();
            }
        });

        buttonCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ifButtonCreatePressed();
            }
        });
    }

    private JPanel getPanelShape() {
        JPanel panel = new JPanel();

        //panel.setBackground(new Color(70, 80, 255));

        panel.add(buttonC);
        panel.add(buttonR);
        panel.add(buttonT);
        panel.add(buttonCreate);
        panel.add(field1);

        return panel;
    }




    private void ifButtonCPressed(){
        makeCircle(Integer.parseInt(field1.getText()), "black");
    }


    private void ifButtonTPressed(){

    }
    private void ifButtonRPressed(){

    }

    private void ifButtonCreatePressed(){


    }




    public Circle makeCircle(int radius, String color){
        ShapeClass circle = new Circle(radius, color);
        return (Circle) circle;
    }




}
