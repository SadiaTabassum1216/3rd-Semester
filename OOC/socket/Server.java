package socket;

import java.io.*;
import java.net.*;

public class Server {

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

    }

    public static void main(String[] args) {
        Server server=new Server(5000);

    }

}