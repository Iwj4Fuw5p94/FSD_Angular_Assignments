package com.hexaware.apicodingchallange.dto;

public class PlayersDTO {

	private Long playerId;
	private String playerName;
	private int jerseyNumber;
	private String role;
	private Long totalMatches;
	private String teamName;
	private String country;
	private String playerDescription;
	public PlayersDTO() {
		super();
	}
	public PlayersDTO(Long playerId, String playerName, int jerseyNumber, String role, Long totalMatches,
			String teamName, String country, String playerDescription) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.country = country;
		this.playerDescription = playerDescription;
	}
	public Long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Long playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Long getTotalMatches() {
		return totalMatches;
	}
	public void setTotalMatches(Long totalMatches) {
		this.totalMatches = totalMatches;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPlayerDescription() {
		return playerDescription;
	}
	public void setPlayerDescription(String playerDescription) {
		this.playerDescription = playerDescription;
	}
	@Override
	public String toString() {
		return "PlayersDTO [playerId=" + playerId + ", playerName=" + playerName + ", jerseyNumber=" + jerseyNumber
				+ ", role=" + role + ", totalMatches=" + totalMatches + ", teamName=" + teamName + ", country="
				+ country + ", playerDescription=" + playerDescription + "]";
	}
	
	
	
	
}
