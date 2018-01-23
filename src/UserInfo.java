import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;


public class UserInfo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JTextField textLastName;
	public static JTextField  txtFirstName;
	
	public static JButton btnSubmit;
	
	ProducerConsumerPattern queimplement=null;

	
	
	public UserInfo() {
		
		
		final JFrame frame = new JFrame("Main Window");
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 390, 226);
		
		frame.getContentPane().add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(416, 225);
        frame.setLocation(200, 200);
        frame.setVisible(true);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("First Name");
		lblName.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblName.setBounds(17, 6, 60, 16);
		panel.add(lblName);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(100, 5, 171, 20);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblLastName.setBounds(17, 34, 58, 16);
		panel.add(lblLastName);
		
		textLastName = new JTextField();
		textLastName.setColumns(10);
		textLastName.setBounds(100, 34, 171, 20);
		panel.add(textLastName);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(150, 150, 86, 23);
		panel.add(btnSubmit);
		
		final ProducerConsumerPattern prodcons = new ProducerConsumerPattern();
		prodcons.startProcess();
		
		
        /*	
        label = new JLabel("Click button in Dialog...");
        label.setFont(new Font("Dialog", Font.PLAIN, 20));	
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(435, 315);
        frame.setLocation(200, 200);
        frame.setVisible(true);
		
		System.out.println("Printing from the panel");
		
		*/
		
		/*
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 315);
		getContentPane().add(panel);
		
		
		panel.setVisible(true);
		
		JLabel lblName = new JLabel("First Name");
		lblName.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblName.setBounds(10, 24, 68, 22);
		panel.add(lblName);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(116, 26, 213, 20);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblLastName.setBounds(10, 76, 68, 22);
		panel.add(lblLastName);
		
		textLastName = new JTextField();
		textLastName.setColumns(10);
		textLastName.setBounds(116, 78, 213, 20);
		panel.add(textLastName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblGender.setBounds(10, 122, 68, 22);
		panel.add(lblGender);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(116, 123, 68, 23);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(206, 123, 68, 23);
		panel.add(rdbtnFemale);
		
		JLabel lblDob = new JLabel("D.O.B");
		lblDob.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblDob.setBounds(10, 168, 68, 22);
		panel.add(lblDob);
		
		txtDOB = new JTextField();
		txtDOB.setColumns(10);
		txtDOB.setBounds(116, 170, 213, 20);
		panel.add(txtDOB);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblEmail.setBounds(10, 217, 68, 22);
		panel.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(116, 219, 213, 20);
		panel.add(txtEmail);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(116, 264, 89, 23);
		panel.add(btnSubmit);
		
		JButton btnChkStatus = new JButton("Check Status");
		btnChkStatus.setBounds(230, 264, 111, 23);
		panel.add(btnChkStatus);
		
	 */
	}
}
