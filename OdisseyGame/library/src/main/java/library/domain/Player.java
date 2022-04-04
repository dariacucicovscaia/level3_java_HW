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

	public Player(String nickname, Integer score) {
		setNickname(nickname);
		setScore(score);
	}

	public Player(String nickname, Integer score, String password, String email) {
		setNickname(nickname);
		setScore(score);
		setPassword(password);
		setEmail(email);
	}
	


	@Override
	public String getNickname() {
		return nickname;
	}

	@Override
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
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

	
}