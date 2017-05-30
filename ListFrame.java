import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListFrame extends Container{
	
	public JButton add;
	public JButton list;
	public JButton delete;
	public JButton exit;
	
	
	
	public ListFrame(){
		
		setLayout(null);
		setSize(500,400);
		
		add = new JButton(" ADD NEW BOOK ");
		add.setBounds(150,50,200,30);
		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Client.clientframe.listframe.setVisible(false);
				Client.clientframe.addbook.setVisible(true);
			}
		});
		add(add);
		
		list = new JButton(" LIST OR EDIT BOOKS ");
		list.setBounds(150,100,200,30);
		list.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Client.clientframe.listframe.setVisible(false);
				Client.clientframe.listlibrary.setVisible(true);
				Client.clientframe.listlibrary.updateLibrary();
			}
		});
		add(list);
		
		delete = new JButton(" DELETE BOOK ");
		delete.setBounds(150,150,200,30);
		delete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Client.clientframe.listframe.setVisible(false);
				Client.clientframe.deletebook.setVisible(true);
			}
		});
		add(delete);
		
		exit = new JButton(" EXIT ");
		exit.setBounds(200,300,100,30);
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				System.exit(0);
			}
		});
		add(exit);
	
		repaint();
	}
	
	
	
	
	
	
	
	
	
	
	
}