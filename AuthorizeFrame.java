import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AuthorizeFrame extends Container{
	
	public JLabel topic, error;
	public JTextField insertLogin;
	public JPasswordField insertPassword;
	public JButton logIn, labelLogin, labelPassword;
	
	
	public AuthorizeFrame(){
		
		setSize(500,400);
		setLayout(null);
		
		Font font = new Font("Arial",Font.BOLD,40);
		
		topic = new JLabel("LOGIN");
		// topic.setForeground(Color.BLUE);
		topic.setBounds(175,50,200,30);
		topic.setFont(font);
		add(topic);
		
		error = new JLabel("LOGIN OR PASSWORD IS INCORRECT");
		error.setBounds(125,200,225,35);
		error.setForeground(Color.RED);
		error.setVisible(false);
		add(error);
		
		labelLogin = new JButton();
		labelLogin.setBounds(125,130,27,29);
		labelLogin.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
			}
			
		});
		
		add(labelLogin);
		
		insertLogin = new JTextField();
		insertLogin.setBounds(150,130,200,30);
		add(insertLogin);
		
		
		
		
		labelPassword = new JButton();
		labelPassword.setBounds(125,170,27,29);
		labelPassword.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
			}
			
		});
		
		add(labelPassword);
		
		insertPassword = new JPasswordField();
		insertPassword.setBounds(150,170,200,30);
		add(insertPassword);
		
		
		font = new Font("Arial",Font.BOLD,25);
		
		logIn = new JButton("Log In");
		logIn.setBounds(125,250,225,35);
		logIn.setFont(font);
		logIn.setForeground(Color.GREEN);
		logIn.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
				Client.Logging();
			}
			
		});
		
		add(logIn);
		
		
		
		
		// insert = new JLabel("INSERT MONEY:");
		// insert.setBounds(100,150,200,30);
		// add(insert);
		

		
		
		// back = new JButton(" BACK ");
		// back.setBounds(100,400,150,30);
		// back.addActionListener(new ActionListener(){
			
			// public void actionPerformed(ActionEvent e){
				// test.list.mainlist.updateCurs();
				// test.list.getcash.setVisible(false);
				// test.list.mainlist.setVisible(true);
				// test.list.repaint();
			// }
			
		// });
	

		repaint();
		
		
	}
	
	
	
}