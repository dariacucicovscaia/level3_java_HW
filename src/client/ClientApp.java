package client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.*;
public class ClientApp {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("CLIET START");

		// create socket and try to conect
		Socket clientSocket = new Socket("localhost", 7777);
		DataOutputStream dout = new DataOutputStream(clientSocket.getOutputStream());

		int numOfIterations = 2;
		dout.writeInt(numOfIterations);
		
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(5);
		
		
		
		for(Integer l:list) {
			dout.writeInt(l);
		}
		
		dout.close();

		System.out.println("CLIENT END");
	}
}
