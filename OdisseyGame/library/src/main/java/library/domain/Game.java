package library.domain;

import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Game extends library.tom.Node implements Component {

	private String status;

	public Game() throws ParserConfigurationException, IOException, SAXException {
		setStatus(xmlt("default").getRoot().getAttributes().getNamedItem("status").getNodeValue());
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		
	}

}
