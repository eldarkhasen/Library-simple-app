import java.io.*;
import java.util.*;

public class Message implements Serializable{
	
	public String login, password, status;
	public ArrayList <Book> array;
	
	public Message(){
		
	}
	
	public Message(String login, String password, String status, ArrayList <Book> array){
		this.login = login;
		this.password = password;
		this.status = status;
		this.array = array;
	}
	
}