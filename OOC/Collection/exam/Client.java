package socket;

import java.io.*;
import java.net.*
;
import java.util.Scanner;

public class Client extends Thread{
	//ArrayList<Clients> student=new ArrayList<Clients>();
	ObjectOutputStream output = null;
    ObjectInputStream input = null;
	 Socket socket=null;


	    public Client(String address,int port)
	    {
	        try {
	            socket=new Socket(address,port);
	            System.out.println("Connected");
	            System.out.println("Client: ");

	            input=new ObjectInputStream(System.in);
	            output=new ObjectOutputStream(socket.getOutputStream());

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        String line="";
	        while(!line.equals(null))
	        {
	            try {
	                line=input.readLine();
	                output.writeUTF(line);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }

	        try {
	            input.close();
	            output.close();
	            socket.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	public static void main(String[] args) {
		int number;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of clients");
		number=in.nextInt();
		
		for(int i=0;i<number;i++) {
			Client client=new Client("127.0.0.1",5555);
		}
		
		Client client=new Client("127.0.0.1",5555);
		

	}

}
