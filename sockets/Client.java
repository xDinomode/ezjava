import java.net.*;
import java.io.*;

public class Client {
	public static void main(String args[]){
		int port = Integer.parseInt(args[0]);
		try{
			System.out.println("Connecting to localhost on port " + port);
			Socket client = new Socket("localhost", port);
			System.out.println("Just connected to " + client.getRemoteSocketAddress());
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);
			out.writeUTF("Hello from client  " + client.getLocalSocketAddress());
			InputStream inFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			System.out.println("Server says "  + in.readUTF());
			client.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
