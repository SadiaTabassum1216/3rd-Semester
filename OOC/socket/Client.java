package socket;

import java.io.*;
import java.net.*;

public class Client {
    DataInputStream input=null;
    DataOutputStream out=null;
    Socket socket=null;

    public Client(String address,int port)
    {
        try {
            socket=new Socket(address,port);
            System.out.println("Connected");
            System.out.println("Client: ");

            input=new DataInputStream(System.in);
            out=new DataOutputStream(socket.getOutputStream());

        } catch (IOException e) {
            e.printStackTrace();
        }

        String line="";
        while(!line.equals("Over"))
        {
            try {
                line=input.readLine();
                out.writeUTF(line);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            input.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client=new Client("127.0.0.1",5000);

    }

}
