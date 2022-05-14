package library.domain;

import java.io.Serializable;



public class Player implements Serializable{
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
	


	public String getNickname() {
		return nickname;
	}

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

	public void setScore(Integer score) {
		this.score = score;
	}

	public Integer getScore() {
		return score;
	}

	
}
