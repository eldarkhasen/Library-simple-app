import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListLibrary extends Container{
	
	public JButton back;
	public JTable table;
	public JScrollPane js;
	
	public ListLibrary(){
		
		setLayout(null);
		setSize(500,400);
		
		String[] header = {"ID","NAME","AUTHOR","YEAR"};
		String[][] column = new String[100][4];
		
		
		table = new JTable(column, header);
		table.setBounds(0,0,350,400);
		js = new JScrollPane(table);
		
		js.setSize(350,400);
		js.setVisible(true);
		add(js);
		
		back = new JButton(" BACK ");
		back.setBounds(100,300,150,30);
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Client.clientframe.listframe.setVisible(true);
				Client.clientframe.listlibrary.setVisible(false);
			}
		});
		add(back);
	
		repaint();
	}
	
	
	
	public void updateLibrary(){
		
		js.setVisible(false);
		
		String[] header = {"ID","NAME","AUTHOR","YEAR"};
		String[][] column = new String[100][4];
		
		int k = 0;
		
		
		
		for(int i=0;i<Client.book.size();i++){
			if(Client.book.get(i).active.equals("1")){
				column[i+k][0] = Client.book.get(i).id+"";
				column[i+k][1] = Client.book.get(i).name;
				column[i+k][2] = Client.book.get(i).author;
				column[i+k][3] = Client.book.get(i).year;
			}else{
				k = k - 1;
			}
		}
		
		table = new JTable(column, header);
		table.setBounds(0,0,350,400);
		js = new JScrollPane(table);
		
		js.setSize(350,400);
		js.setVisible(true);
		add(js);
		
		repaint();
	}
	
	
	
}