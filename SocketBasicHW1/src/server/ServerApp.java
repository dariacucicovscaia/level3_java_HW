package server;

import java.io.*;
import java.net.*;
import java.util.*;

public class ServerApp {
	public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException,
			IllegalArgumentException, IllegalAccessException {
		System.out.println("SERVER START");

		// create socket and try to conect
		ServerSocket serverSocket = new ServerSocket(7777);
		Socket clientSocket = serverSocket.accept();

		DataInputStream din = new DataInputStream(clientSocket.getInputStream());
		DataOutputStream dout = new DataOutputStream(clientSocket.getOutputStream());

		int numOfIterations = din.readInt();

		
		List<Integer> lprim = new ArrayList<Integer>();
		for (int i = 0; i < numOfIterations; i++)
			lprim.add(din.readInt());


		int sum = 0;
		System.out.print("Collection consists of: ");
		for (Integer il : lprim) {
			sum += il;
			System.out.print(il+" ");
		}
		System.out.println("\nThe sum is: " + sum);

		
		System.out.println("SERVER END");
	}
}
