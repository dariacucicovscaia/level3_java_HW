package server.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import library.domain.ClientSidePlayer;

public class CLIApplication {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//1 listen/run server
		ServerSocket serverSocket = new ServerSocket(10000);
		System.err.println("SERVER: Server started ... ");
		
		//2 accept client connection
		Socket clientSocket = serverSocket.accept();
		System.err.println("SERVER: Player connected ... ");
		
		//3 receive player 
		InputStream inputStream = clientSocket.getInputStream();
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
		
		//4 print player in console
		ClientSidePlayer player =  (ClientSidePlayer) objectInputStream.readObject();
		System.err.println("SERVER: received " + player);
	}

}
