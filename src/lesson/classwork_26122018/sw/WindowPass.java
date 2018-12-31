package lesson.classwork_26122018.sw;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowPass extends JFrame {

    JButton buttonOK = new JButton("OK");
	JButton buttonCancel = new JButton("Cancel");
	JButton buttonBack = new JButton("Back");
	JTextField jTextFieldName = new JTextField();
	JTextField jTextFieldPass = new JTextField();
	JLabel label = new JLabel("Enter name and password");

	JPanel panel;

	public WindowPass() {
		super("My panels");
		setSize(400, 400);
		setResizable(true);
        panel = getPanel1();
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initListeners();
	}

	private void initListeners() {
        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	if(checkCreds()) {
                    panel.setVisible(false);
                    panel = getPanel2();
                    panel.setVisible(true);
                    add(panel);
                } else {
            		label.setText("Wrong password");
				}
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                panel = getPanel1();
                panel.setVisible(true);
                add(panel);
            }
        });

        buttonBack.addActionListener(new ActionListener() {
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


		//panel.setBackground(Color.CYAN);
        panel.setLayout(null);
        label.setLocation(20, 20);
        label.setSize(200,30);
        jTextFieldName.setSize(200, 30);
		jTextFieldPass.setSize(200, 30);
		jTextFieldName.setLocation(20,60);
		jTextFieldPass.setLocation(20,100);
		buttonOK.setLocation(20, 150);
		buttonOK.setSize(90, 50);
		buttonCancel.setLocation(120, 150);
		buttonCancel.setSize(90, 50);
		panel.add(label);
		panel.add(buttonOK);
		panel.add(buttonCancel);
		panel.add(jTextFieldName);
		panel.add(jTextFieldPass);
		return panel;
	}

	private JPanel getPanel2() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Access granted");
		panel.add(label);
		panel.add(buttonBack);
		return panel;
	}

	private boolean checkCreds(){
	    if(jTextFieldName.getText().equals("admin") & jTextFieldPass.getText().equals("123")){
	        return true;
        }
	    return false;
    }
}
