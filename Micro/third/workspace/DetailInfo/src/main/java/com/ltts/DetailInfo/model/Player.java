package com.ltts.DetailInfo.model;

public class Player {
	private int playerId;
	private String playerName;
	private String playerTeam;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int playerId, String playerName, String playerTeam) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerTeam = playerTeam;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerTeam() {
		return playerTeam;
	}
	public void setPlayerTeam(String playerTeam) {
		this.playerTeam = playerTeam;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerTeam=" + playerTeam + "]";
	}
	

}
