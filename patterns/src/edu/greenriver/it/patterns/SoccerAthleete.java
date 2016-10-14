package edu.greenriver.it.patterns;

import java.util.HashMap;
import java.util.Map;

public class SoccerAthleete {
	//track the name and stats for a soccer athlete
	private String fullName;
	private Map<String, Object> stats = new HashMap<String, Object>();
	
	
	public SoccerAthleete(String fullName) {
		this.fullName = fullName;
	}
	
	public void addStatLine(String type, Object value){
		stats.put(type,  value);
		
	}
	
	public Map<String, Object> getStats(){
		return stats;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
}
