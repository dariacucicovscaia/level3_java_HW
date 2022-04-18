package server.main;

import java.io.IOException;

import library.tom.Game;
import library.tom.Gun;
import library.tom.Missile;
import library.tom.Ship;
import library.tom.Space;

public class CLIApplication {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//1 listen/run server
//		ServerSocket serverSocket = new ServerSocket(10000);
//		System.err.println("SERVER: Server started ... ");
//		
//		//2 accept client connection
//		Socket clientSocket = serverSocket.accept();
//		System.err.println("SERVER: Player connected ... ");
//		
//		//3 receive player 
//		InputStream inputStream = clientSocket.getInputStream();
//		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
//		
//		//4 print player in console
//		Player player =  Player.class.cast( objectInputStream.readObject());
//		
//		System.err.println("SERVER: received " + player);
		
		Game game = new Game();
		game.appendChild(new Space());
		game.getFirstChild().appendChild(new Ship());
		game.getFirstChild().appendChild(new Ship());

		game.getFirstChild().getFirstChild().appendChild(new Gun());
		game.getFirstChild().getLastChild().appendChild(new Gun());
		
		
		// the Ship shoots a missile from it's gun
		game.getFirstChild().getFirstChild().getFirstChild().appendChild(new Missile());
        game.getFirstChild().getFirstChild().getFirstChild().removeChild(0);
        game.appendChild(new Missile());
        game.getChildren();
	}

}




















