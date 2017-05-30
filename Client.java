import java.net.*;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class Client implements Serializable{
	
	public static ClientFrame clientframe;
	
	public static Socket socket;
	public static Sender sender;
	public static ObjectOutputStream outStream;
	public static ArrayList <Book> book = new ArrayList <Book>(0);
	
	public static String login, password;
	
	public static void main(String[] args){
		
		clientframe = new ClientFrame();
		clientframe.setVisible(true);
		
	}
	
	public static void Logging(){
	
		try{	
			
			
			socket = new Socket("127.0.0.1",1998);
			outStream = new ObjectOutputStream(socket.getOutputStream());
			
			login = clientframe.authorizeframe.insertLogin.getText();
			password = clientframe.authorizeframe.insertPassword.getText();
			
			User add = new User(login,password);
			
			outStream.writeObject(add);
			
			
			Connected();
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void Connected(){
		
		sender = new Sender(socket);
		Thread t = new Thread(sender);
		t.start();
		
	}
	
	public static void AddBookToLibrary(){
		
		try{
			String name = Client.clientframe.addbook.nameText.getText();
			String author = Client.clientframe.addbook.authorText.getText();
			String year = String.valueOf(Client.clientframe.addbook.yearBox.getSelectedItem());
			
			Book add = new Book(book.size()+1,name,author,year);
			book.add(add);
			
			Message mes = new Message(login, password, )
			
			outStream.writeObject(book);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	} 
	
	
	
	
	
	/*public static void saving(){
		
		try{
			
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("users.jambo"));

			out.writeObject(user);
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
	}
	
	public static void loadData(){
		
		try{
			
			FileInputStream fis = new FileInputStream("users.jambo");
			ObjectInputStream oin = new ObjectInputStream(fis);
			
			user = (ArrayList <User>)oin.readObject();
			
			oin.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
*/
	
}