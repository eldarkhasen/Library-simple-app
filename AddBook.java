import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddBook extends Container{
	
	public JButton back, add;
	
	public JLabel name, author, year;
	public JComboBox yearBox;
	
	public JTextField nameText, authorText;
	
	public int y = -25;

	
	public AddBook(){
		
		setLayout(null);
		setSize(500,400);
		
		String years[] = new String[16];
		for(int i=0;i<16;i++){
			years[i] = (2000 + i) + "";
		}
		
		
		name = new JLabel("NAME: ");
		name.setBounds(100,100+y,100,30);
		add(name);
		
		author = new JLabel("AUTHOR: ");
		author.setBounds(100,150+y,100,30);
		add(author);
		
		year = new JLabel("YEAR: ");
		year.setBounds(100,200+y,100,30);
		add(year);
		
		nameText = new JTextField();
		nameText.setBounds(200,100+y,100,30);
		add(nameText);
		
		authorText = new JTextField();
		authorText.setBounds(200,150+y,100,30);
		add(authorText);
		
		yearBox = new JComboBox(years);
		yearBox.setBounds(200,200+y,100,30);
		add(yearBox);
		
		
		back = new JButton(" BACK ");
		back.setBounds(100,300+y,150,30);
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Client.clientframe.listframe.setVisible(true);
				Client.clientframe.addbook.setVisible(false);
			}
		});
		add(back);
		
		add = new JButton(" BACK ");
		add.setBounds(275,300+y,150,30);
		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Client.AddBookToLibrary();
				Client.clientframe.listframe.setVisible(true);
				Client.clientframe.addbook.setVisible(false);
			}
		});
		add(add);
	
		repaint();
	}
	
	
	
}