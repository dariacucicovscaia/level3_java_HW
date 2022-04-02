package library.domain;

import java.io.Serializable;

public class Player implements PlayerInterface, Serializable {

	private static final long serialVersionUID = 1L;
	private String nickname;
	private String password;
	private String email;
	private Integer score;


	public Player() {

	}

	public Player(String nickname, Integer score, String password, String email) {
		super();
		this.nickname = nickname;
		this.score = score;
		this.password = password;
		this.email = email;
	}

	@Override
	public String getNickname() {
		return nickname;
	}

	@Override
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public Integer getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Player [nickname=" + nickname + ", score=" + score + "]";
	}
}