package lesson.classwork_26122018.sw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow1 extends JFrame {

    JButton button1 = new JButton("To Panel#2");
	JButton button2 = new JButton("To Panel#1");
	JPanel panel;

	public MyWindow1() {
		super("My panels");
		setSize(300, 300);
		setResizable(true);
        panel = getPanel1();
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initListeners();
	}

	private void initListeners() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panel.setVisible(false);
                panel = getPanel2();
                panel.setVisible(true);
                add(panel);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                panel = getPanel1();
                panel.setVisible(true);
                add(panel);
            }
        });


    }


    private JPanel getPanel1() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("PANEL #1");
		panel.add(label);
		panel.add(button1);
		return panel;
	}

	private JPanel getPanel2() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("PANEL #2");
		JLabel label1 =new JLabel("label1");
		panel.add(label);
		panel.add(label1);
		panel.setBackground(Color.BLUE);
		panel.add(button2);
		return panel;
	}





}
