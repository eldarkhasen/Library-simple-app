import java.util.*;
import java.io.*;
import java.net.*;

public class Handler implements Runnable, Serializable{
    
	public static Socket socket;
	public static ObjectInputStream inStream;
	public static ObjectOutputStream outStream;
	
	
	public static ArrayList <User> user = new ArrayList <User>(0);
	public static ArrayList <Book> book = new ArrayList <Book>(0);
	
	
	public static boolean finding = false;
	public static int ind;
    
    public Handler(Socket socket){
        this.socket = socket;
    }
    
    public void run(){
		
		loadData();
	
		
        try{
			
			
			
            
            inStream = new ObjectInputStream(socket.getInputStream());
			outStream = new ObjectOutputStream(socket.getOutputStream());
			
            User check;
			
            
				while((check = (User)inStream.readObject())!=null){
					
					
					for(int i=0;i<5;i++){
						if(user.get(i).login.equals(check.login) && user.get(i).password.equals(check.password) ){
							finding = true;
							ind = i;
						}
					}
					
					if(finding){
						outStream.writeObject("true");
						outStream.writeObject(book);
						user.get(ind).status = "list";
						break;
					}else{
						outStream.writeObject("false");
					}
					
					

				}
				
				
			
				
		
				
			
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
	
	
	
	
	public static void saveData(){
		
		try{
			
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Library.data"));

			out.writeObject(book);
			
			out.close();
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
	}
	
    
	
}