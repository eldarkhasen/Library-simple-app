import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DeleteBook extends Container{
	
	public JButton back;

	
	public DeleteBook(){
		
		setLayout(null);
		setSize(500,400);
		
		back = new JButton(" BACK ");
		back.setBounds(100,300,150,30);
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Client.clientframe.listframe.setVisible(true);
				Client.clientframe.deletebook.setVisible(false);
			}
		});
		add(back);
	
		repaint();
	}
	
	
	
}