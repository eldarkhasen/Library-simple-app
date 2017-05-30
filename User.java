import java.io.*;
public class User implements Serializable{
	
	public String login;
	public String password;
	public String status;
	
	public User(){}
	
	public User(String login, String password){
		this.login = login;
		this.password = password;
		this.status = "authorize";
	}
	
}