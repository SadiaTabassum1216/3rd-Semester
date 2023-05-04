package socket;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server extends Thread{

	 public Server(int port)
	    {
	        DataInputStream in=null;
	        ServerSocket server=null;
	        Socket socket=null;

	        try {
	            server=new ServerSocket(port);
	            System.out.println("Server started.");
	            System.out.println("Waiting for the client..........");

	            socket=server.accept();
	            System.out.println("Client accepted.");

	            in=new DataInputStream(new BufferedInputStream(socket.getInputStream()));


	        } catch (IOException e) {
	            e.printStackTrace();
	        }


	        String line="";

	        while(!line.equals("Over"))
	        {
	            try {
	                line=in.readUTF();
	                System.out.println(line);

	            } catch (IOException e) {
	                e.printStackTrace();
	            }

	        }
	        System.out.println("Connection closed.");

	    }


	public static void main(String[] args) {
		Server server=new Server(5555);
	}

}
