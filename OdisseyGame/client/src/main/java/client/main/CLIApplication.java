package client.main;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import client.domain.Player;

//import library.domain.Player;

public class CLIApplication {
	public static void main(String[] args) throws UnknownHostException, IOException {
		// 1 create a player
		Player player = new Player("Player1", 0);
        
		System.out.println("CLIENT: Player created " + player);
		// 2 open a network socket
		Socket clientSocket = new Socket("localhost", 10000);
		System.out.println("CLIENT: connected to server");
		// 3 send player object
		OutputStream outputStream = clientSocket.getOutputStream(); // factory pattern
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(player);
	}
}
