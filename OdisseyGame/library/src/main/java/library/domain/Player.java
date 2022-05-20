package library.domain;

import library.tom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.Serializable;



public class Player extends Node implements Serializable , Component{
	private static final long serialVersionUID = 1L;

	private String name;
	private Integer score;


	public Player() throws ParserConfigurationException, IOException, SAXException {
		setName(xmlt("default").getFirstChild(getXmltrav().getFirstChild(getXmltrav().getFirstChild())).getAttributes().getNamedItem("name").getNodeValue());
		setScore(Integer.parseInt(xmlt("default").getFirstChild(getXmltrav().getFirstChild(getXmltrav().getFirstChild())).getAttributes().getNamedItem("score").getNodeValue()));

		System.out.println(getName() + " " + getScore());

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getScore() {
		return score;
	}


}
