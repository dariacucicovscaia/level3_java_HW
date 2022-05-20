package library.domain;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;


public class Ship extends library.tom.Node implements Component {


	public Ship() throws ParserConfigurationException, IOException, SAXException {

		setHealth(Integer.parseInt(xmlt("default").getFirstChild(getXmltrav().getFirstChild()).getAttributes().getNamedItem("health").getNodeValue()));
		setAngle(Integer.parseInt(xmlt("default").getFirstChild(getXmltrav().getFirstChild()).getAttributes().getNamedItem("angle").getNodeValue()));
		setDistance(Integer.parseInt(xmlt("default").getFirstChild(getXmltrav().getFirstChild()).getAttributes().getNamedItem("distance").getNodeValue()));


	}


	private int health;
	private int distance;
	private int angle;

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

}
