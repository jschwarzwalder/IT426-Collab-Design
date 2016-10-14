package edu.greenriver.it.patterns;

import java.util.ArrayList;
import java.util.List;

public class BaseballAthlete {
	
	private String fname;
	private String middle;
	private String lname;
	
	private List<String> stats = new ArrayList<String>();

	public BaseballAthlete(String fname, String middle, String lname) {
		
		this.fname = fname;
		this.middle = middle;
		this.lname = lname;
	}
	
	public void addStat(String stat){
		
		stats.add(stat);		
	}

}
