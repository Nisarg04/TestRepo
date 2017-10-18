package com.stackoverflow;

public class Talent {
	
	int rank;
	String skill;
	
	public Talent(int rank, String skill) {
		this.rank = rank;
		this.skill = skill;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return rank + " " + skill;
	}
	
	
}
