package library.tom;

import library.domain.DomainFactory;
import library.domain.Node;

public class TOM extends Node {
	// Optional property
	private Integer startTimeStamp = null; // boxed value of --> start game
	private Integer endTimeStamp = null;

	public static class TOMBuilder {

		private Integer startTimeStamp = null;
		private Integer endTimeStamp = null;

		
		public TOMBuilder withStartTimeStamp(Integer startTimeStamp) { // not void
			this.startTimeStamp = startTimeStamp;
			return this;
		}

		public TOMBuilder withEndTimeStamp(Integer endTimeStamp) { // not void
			this.endTimeStamp = endTimeStamp;
			return this;

		}

		DomainFactory domainFactory = new DomainFactory();
		Node game = (Node) domainFactory.get("library.domain.Game");
		Node space = (Node) domainFactory.get("library.domain.Space");
		Node ship = (Node) domainFactory.get("library.domain.Ship");

		public void withSpace() {
			game.appendChild((Node) space);
		}

		public void withShip() {
			space.appendChild((Node) ship);
		}

		public TOM build() {
			TOM tom = new TOM();
			tom.appendChild(game);
		
			withSpace();
			withShip();

			//System.out.println(tom.walkTheTree(game));

			if (this.startTimeStamp != null) {
				tom.startTimeStamp = this.startTimeStamp;
			}
			if (this.endTimeStamp != null) {
				tom.endTimeStamp = this.endTimeStamp;
			}

			return tom;
		}
	}

	@Override
	public String toString() {
		return "TOM -> startTimeStamp = " + startTimeStamp + "\n" + "    -> endTimeStamp = " + endTimeStamp + "\n";
	}
}
