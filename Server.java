import java.net.*;
import java.util.*;
import java.io.*;



public class Server implements Serializable{
	
	public static ServerSocket serversocket;
	public static Socket socket;
	public static Handler handler;
	
	
	public static void main(String[] args) {
		
		
		
	
		try{
			
			serversocket = new ServerSocket(1998);
			
			while(true){
                
                socket = serversocket.accept();
                
                handler = new Handler(socket);
                Thread t = new Thread(handler);
                t.start();
                
            }
		
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
	
	}
	
}

