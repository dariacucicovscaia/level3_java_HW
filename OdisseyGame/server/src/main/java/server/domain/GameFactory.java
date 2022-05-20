package server.domain;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import library.domain.*;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import library.tom.TOM;
import server.xml.XMLLoader;
import server.xml.XMLTraverser;

public class GameFactory {
	public static TOM createGame() throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		TOM tom = createGame("default");
		//default.xml
		return tom;
	}

	public static TOM createGame(String id) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		TOM tom = null;
//1. LOAD XML 
		XMLTraverser xmltrav = new XMLTraverser(
				
				new XMLLoader().load("SpaceOdissey/server/src/main/resources/"+ id +".xml")
		);
		
//2. TOM BUILD
		TOM.TOMBuilder tomBuilder = new TOM.TOMBuilder();

		tomBuilder.withGame(
				(Game)( DomainFactory.create(
						xmltrav.getRoot().getNodeName())
				)
		);

		tomBuilder.withSpace(
				(Space) ( DomainFactory.create(
						xmltrav.getFirstChild().getNodeName())
				)
		);


		tomBuilder.withShip(
				(Ship)( DomainFactory.create(
						xmltrav.getFirstChild(xmltrav.getFirstChild()).getNodeName()
				)
		));



		tomBuilder.withPlayer(
				(Player) ( DomainFactory.create(
						xmltrav.getFirstChild(xmltrav.getFirstChild(xmltrav.getFirstChild())).getNodeName())
				)
		);

		
		tom = tomBuilder.build();

		return tom;
	}
}








