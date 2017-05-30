import java.util.*;
import java.io.*;
import java.net.*;

public class Sender implements Serializable, Runnable{
    
	public static Socket socket;
	public static ObjectInputStream inStream;
	public static ObjectOutputStream outStream;
	public static String waiting = "";
	
	
    public Sender(Socket socket){
        this.socket = socket;
    }
    
    public void run(){
        
        try{
            
			inStream = new ObjectInputStream(socket.getInputStream());
			outStream = new ObjectOutputStream(socket.getOutputStream());

			
		
			
			int size = 0;
            
            while((waiting=(String)inStream.readObject())!=null){
				
				if(waiting.equals("true")){
					

					
					Client.clientframe.authorizeframe.setVisible(false);
					Client.clientframe.listframe.setVisible(true);
					break;
					
				}else if(waiting.equals("false")){
					
					Client.clientframe.authorizeframe.error.setVisible(true);
					
				}
				
            }
			
			ArrayList <Book> book_0 = (ArrayList <Book>)inStream.readObject();
			Client.book = book_0;
			
			
				
		
			
			
        }catch(Exception e){
            e.printStackTrace();
        }
		
		
        
    }
	
	
    
}