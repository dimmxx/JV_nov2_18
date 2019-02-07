package next.ua;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWin extends JFrame{
	JButton b=new JButton();
	JLabel l=new JLabel();
	MyWin(){
		initListeners();
	}
	private void initListeners() {
		b.addActionListener((e) ->l.setText("OK"));
	}
}
