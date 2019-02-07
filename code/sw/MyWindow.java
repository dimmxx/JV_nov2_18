package sw;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class MyWindow extends JFrame {
	JLabel result=new JLabel(new ImageIcon("pic.jpg"));
	JTextField login=new JTextField();
	JButton send = new JButton("OK");
	
	JButton button1 = new JButton("To Panel#2");
	JButton button2 = new JButton("To Panel#1");
	JPanel panel;
	public MyWindow() {
		super("My first Frame");
		setSize(300, 300);
		//setResizable(false);
		panel=getLoginPanel();
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
				panel=getPanel2();
				panel.setVisible(true);
				add(panel);
			}});
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel=getPanel1();
				panel.setVisible(true);
				add(panel);
			}});
		send.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel=getResultPanel();
				panel.setVisible(true);
				add(panel);
			}});
		
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
		panel.add(label);
		panel.add(button2);
		return panel;
	}
	
	private JPanel getLoginPanel() {
		JPanel panel = new JPanel();
		panel.add(login);
		panel.add(send);
		return panel;
	}
	private JPanel getResultPanel() {
		JPanel panel = new JPanel();
		//if(login.getText().equals("admin")) {
			//result.setIcon(new ImageIcon("pic.png"));
		//}
		panel.add(result);
		return panel;
	}
}
