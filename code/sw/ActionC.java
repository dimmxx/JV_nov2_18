package sw;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ActionC extends JFrame {
	JLabel label = new JLabel("SomeText");
	JButton button = new JButton("Press me");
	ActionC(){
		setSize(300,300);
		setVisible(true);
		add(label,BorderLayout.NORTH);
		add(button,BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initListeners();
	}
	private void initListeners() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ifButtonPressed();
			}});
	}
	
	private void ifButtonPressed() {
		label.setText("Button was pressed");
	}
}
