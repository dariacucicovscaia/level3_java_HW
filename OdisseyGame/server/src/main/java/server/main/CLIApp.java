package server.main;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import XML.XMLLoader;
import XML.XMLTraverser;
import library.domain.DomainFactory;
import library.tom.TOM;

public class CLIApp {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// domain factory
		DomainFactory df = new DomainFactory();
		Object obj = df.get("library.domain.Game");
		//System.out.println(obj.getClass().getSimpleName());
		
		//using tombuilder
		// 1. create the builder
		TOM.TOMBuilder tomBuilder = new TOM.TOMBuilder();
		
		TOM gameTom = tomBuilder
						.withStartTimeStamp(10)      // 2. setup the object
						.withEndTimeStamp(250)
						.build();                    //create the object  .build() << last step
		
		
		System.out.println(gameTom);
		
	}

}
