package com.example.exintermediate.form;

public class BaseballTeamForm {
	private Integer id;
	private String leagueName;
	private String teamName;
	private String headquaters;
	private String inauguaration;
	private String history;


	public BaseballTeamForm() {}


	public BaseballTeamForm(Integer id, String leagueName, String teamName, String headquaters,
			String inauguaration, String history) {
		this.id = id;
		this.leagueName = leagueName;
		this.teamName = teamName;
		this.headquaters = headquaters;
		this.inauguaration = inauguaration;
		this.history = history;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getHeadquaters() {
		return headquaters;
	}

	public void setHeadquaters(String headquaters) {
		this.headquaters = headquaters;
	}

	public String getInauguaration() {
		return inauguaration;
	}

	public void setInauguaration(String inauguaration) {
		this.inauguaration = inauguaration;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}


	@Override
	public String toString() {
		return "BaseballTeamForm [headquaters=" + headquaters + ", history=" + history + ", id="
				+ id + ", inauguaration=" + inauguaration + ", leagueName=" + leagueName
				+ ", teamName=" + teamName + "]";
	}



}
