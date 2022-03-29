package server;

import java.io.*;
import java.net.*;
import java.time.Period;

public class ServerApp {
	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException,
			IllegalArgumentException, IllegalAccessException {
		System.out.println("SERVER START");

		// create socket and try to conect
		ServerSocket serverSocket = new ServerSocket(7777);
		Socket clientSocket = serverSocket.accept();

		DataInputStream din = new DataInputStream(clientSocket.getInputStream());
		DataOutputStream dout = new DataOutputStream(clientSocket.getOutputStream());


		String g =din.readUTF(); 
			Period p = Period.parse(g);
			System.out.print("your are: ");
			System.out.println(p.getYears() + " years and " + p.getMonths() + " months old");
        
		System.out.println("SERVER END");
	}
}
