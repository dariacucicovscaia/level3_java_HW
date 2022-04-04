package client.domain;

public class Player extends library.domain.Player {

	private static final long serialVersionUID = 1L;

	public Player(String nickname, Integer score) {
		super(nickname, score);
	}

	@Override
	public String toString() {
		return "Player [nickname=" + getNickname() + ", score=" + getScore() + "]";
	}

}
