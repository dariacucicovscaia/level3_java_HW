package server.main;

import org.xml.sax.SAXException;
import server.domain.GameFactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;



public class CLIApp {
	public static void main(String[] args) throws ParserConfigurationException, IOException, ClassNotFoundException, InvocationTargetException, SAXException, InstantiationException, IllegalAccessException, NoSuchMethodException {
		GameFactory gf = new GameFactory();
		System.out.println(gf.createGame());

	}
}





































////domain factory
//		DomainFactory df = new DomainFactory();
//		Object obj = df.get("library.domain.Game");
//		//System.out.println(obj.getClass().getSimpleName());
//		
//		//using tombuilder
//		// 1. create the builder
//		TOM.TOMBuilder tomBuilder = new TOM.TOMBuilder();
//		
//		TOM gameTom = tomBuilder
//						.withStartTimeStamp(10)      // 2. setup the object
//						.withEndTimeStamp(250)
//						.build();                    //create the object  .build() << last step
//		
//		
//		System.out.println(gameTom);







