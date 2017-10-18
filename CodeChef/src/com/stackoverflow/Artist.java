package com.stackoverflow;

import java.util.List;

class Artist {
	private String name;
	private String origin;
	private List<Talent> talent;
	
	
	public Artist(String name, String origin, List<Talent> talent) {
		super();
		this.name = name;
		this.origin = origin;
		this.talent = talent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public List<Talent> getTalent() {
		return talent;
	}
	public void setTalent(List<Talent> talent) {
		this.talent = talent;
	}
	@Override
	public String toString() {
		return "Artist [name=" + name + ", talent=" + talent + "]";
	}
	
	
}