import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClientFrame extends JFrame{
	
	public AuthorizeFrame authorizeframe;
	public ListFrame listframe;
	public AddBook addbook;
	public ListLibrary listlibrary;
	public DeleteBook deletebook;
	
	public ClientFrame(){
		
		setLayout(null);
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		authorizeframe = new AuthorizeFrame();
		authorizeframe.setLocation(0,0);
		authorizeframe.setVisible(true);
		add(authorizeframe);
		
		listframe = new ListFrame();
		listframe.setLocation(0,0);
		listframe.setVisible(false);
		add(listframe);
		
		addbook = new AddBook();
		addbook.setLocation(0,0);
		addbook.setVisible(false);
		add(addbook);
		
		listlibrary = new ListLibrary();
		listlibrary.setLocation(0,0);
		listlibrary.setVisible(false);
		add(listlibrary);
		
		deletebook = new DeleteBook();
		deletebook.setLocation(0,0);
		deletebook.setVisible(false);
		add(deletebook);
		
		repaint();
		
		// ip = new JTextField();
		// ip.setBounds(25,25,100,30);
		// add(ip);
		
		
		//Font font = new Font("Arial",Font.BOLD,25);
		
	
		
		/*
		send = new JButton("SENT");
		send.setBounds(135,290,200,50);
		send.setFont(font);
		send.setForeground(Color.BLUE);
		send.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				
			}
			
		});
		add(send);
		*/
		



		
	}
	
}