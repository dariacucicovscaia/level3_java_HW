package library.domain;

public class ClientSidePlayer extends Player implements PlayerInterface {


	private static final long serialVersionUID = 1L;
	
	public ClientSidePlayer(String nickname, Integer score) {
		setNickname(nickname);
		setScore(score);
	}
	
	@Override
	public String toString() {
		return "Player [nickname=" + getNickname() + ", score=" + getScore() + "]";
	}
}
