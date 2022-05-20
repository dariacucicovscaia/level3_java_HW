package library.tom;

import library.domain.Game;
import library.domain.Player;
import library.domain.Ship;
import library.domain.Space;

public class TOM extends Node {
	public static class TOMBuilder {

		private Game game;
		private Space space;
		private Ship ship;
		private Player player;

		public TOMBuilder withGame(Game game) {
			this.game = game;
			return this;
		}
		public TOMBuilder withSpace(Space space) {
			this.space = space;
			return this;
		}
		public TOMBuilder withShip(Ship ship) {
			this.ship = ship;
			return this;
		}

		public TOMBuilder withPlayer(Player player) {
			this.player = player;
			return this;
		}



		public TOM build() {
			TOM tom = new TOM();

			if (this.game != null) {
				tom.appendChild(game);
			}
			if (this.game != null && this.space != null) {
				game.appendChild(space);
			}
			if (this.game != null && this.space != null && this.ship != null) {
				space.appendChild(ship);

			}
			if (this.game != null && this.space != null && this.ship != null && this.player != null) {
				ship.appendChild(player);
			}

			return tom;
		}

	}

}

		