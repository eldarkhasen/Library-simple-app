import java.net.*;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class test{
	
	
	public static ArrayList <User> user = new ArrayList <User>(0);
	public static ArrayList <Book> book = new ArrayList <Book>(0);
	
	
	public static void main(String[] args){
		
		User add0 = new User("zhandos","1234567890");
		User add1 = new User("akezhan","1234567890");
		User add2 = new User("azamat","1234567890");
		User add3 = new User("eldar","1234567890");
		User add4 = new User("sena","1234567890");
		
		user.add(add0);
		user.add(add1);
		user.add(add2);
		user.add(add3);
		user.add(add4);
		
		Book a0 = new Book(1,"SDP-1","A.Zhandos","2012");
		Book a1 = new Book(1,"Java","K.Azamat","2002");
		Book a2 = new Book(1,"C#","A.Akezhan","2010");
		Book a3 = new Book(1,"CSS","Kh.Eldar","2011");
		Book a4 = new Book(1,"HTML","N.Sena","2016");
		
		book.add(a0);
		book.add(a1);
		book.add(a2);
		book.add(a3);
		book.add(a4);
		
		saveData();
		loadData();
		
		for(int i=0;i<user.size();i++){
			System.out.println(user.get(i).login);
		}
		
		for(int i=0;i<book.size();i++){
			System.out.println(book.get(i).name);
		}
		
		
		
	}
	
	
	public static void saveData(){
		
		try{
			
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("User.data"));

			out.writeObject(user);
			
			out.close();
			
			out = new ObjectOutputStream(new FileOutputStream("Library.data"));

			out.writeObject(book);
			
			out.close();
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
	}
	
	
	public static void loadData(){
		
		try{
			
			FileInputStream fis = new FileInputStream("User.data");
			ObjectInputStream oin = new ObjectInputStream(fis);
			
			user = (ArrayList<User>)oin.readObject();
			
			oin.close();
			
			
			fis = new FileInputStream("Library.data");
			oin = new ObjectInputStream(fis);
			
			book = (ArrayList<Book>)oin.readObject();
			
			oin.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	

	

	
	

	
}