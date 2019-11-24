package com.ipl.d.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String playerName;
	private String playerRenk;
	private int playerNumber;
	private int playerRuns;
	private int playerTotalCentury;
	private int playerTotalWicket;
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Team team;

	public Player() {
	}

	public Player(long id, String playerName, String playerRenk, int playerNumber, int playerRuns,
			int playerTotalCentury, int playerTotalWicket, Team team) {

		this.id = id;
		this.playerName = playerName;
		this.playerRenk = playerRenk;
		this.playerNumber = playerNumber;
		this.playerRuns = playerRuns;
		this.playerTotalCentury = playerTotalCentury;
		this.playerTotalWicket = playerTotalWicket;
		this.team = team;
	}

	public Player(String playerName, String playerRenk, int playerNumber, int playerRuns, int playerTotalCentury,
			int playerTotalWicket, Team team) {
		this.playerName = playerName;
		this.playerRenk = playerRenk;
		this.playerNumber = playerNumber;
		this.playerRuns = playerRuns;
		this.playerTotalCentury = playerTotalCentury;
		this.playerTotalWicket = playerTotalWicket;
		this.team = team;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerRenk() {
		return playerRenk;
	}

	public void setPlayerRenk(String playerRenk) {
		this.playerRenk = playerRenk;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public int getPlayerRuns() {
		return playerRuns;
	}

	public void setPlayerRuns(int playerRuns) {
		this.playerRuns = playerRuns;
	}

	public int getPlayerTotalCentury() {
		return playerTotalCentury;
	}

	public void setPlayerTotalCentury(int playerTotalCentury) {
		this.playerTotalCentury = playerTotalCentury;
	}

	public int getPlayerTotalWicket() {
		return playerTotalWicket;
	}

	public void setPlayerTotalWicket(int playerTotalWicket) {
		this.playerTotalWicket = playerTotalWicket;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
