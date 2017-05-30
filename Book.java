import java.io.*;
public class Book implements Serializable{
	
	public int id;
	public String name;
	public String author;
	public String year;
	public String active;
	
	public Book(){}
	
	public Book(int id, String name, String author, String year){
		this.id = id;
		this.name = name;
		this.author = author;
		this.year = year;
		this.active = "1";
	}
	
}