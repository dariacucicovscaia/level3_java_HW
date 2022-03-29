package client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
public class ClientApp {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("CLIET START");

		// create socket and try to conect
		Socket clientSocket = new Socket("localhost", 7777);
		DataOutputStream dout = new DataOutputStream(clientSocket.getOutputStream());

		dout.writeUTF("P18Y3M3D");
		dout.close();

		System.out.println("CLIENT END");
	}
}
