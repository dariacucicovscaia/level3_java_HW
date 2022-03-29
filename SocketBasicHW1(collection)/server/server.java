package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("SERVER START");

		// create socket and try to conect
		ServerSocket serverSocket = new ServerSocket(777);
		Socket clientSocket = serverSocket.accept();

		DataInputStream din = new DataInputStream(clientSocket.getInputStream());
		DataOutputStream dout = new DataOutputStream(clientSocket.getOutputStream());

		System.out.println("Client sends: " + din.readUTF());
		dout.writeChars("hello from server");
		dout.flush();

		Thread.sleep(5000);

		System.out.println("SERVER END");
	}
}
