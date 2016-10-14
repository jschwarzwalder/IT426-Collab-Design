package edu.greenriver.it.patterns;

import java.util.HashSet;
import java.util.Set;

public class BasketballAthlete {
	
	private String fname;
	private String lname;
private Set<Stat> stats = new HashSet<Stat>();
	
	
	public BasketballAthlete(String fname, String lname){
		this.fname = fname;
		this.lname = lname;
	}
	public static class Stat {
		private String type;
		private Object value;
		
		
		
		
		public Stat(String type, Object value) {
			super();
			this.type = type;
			this.value = value;
		}

		public String getType() {
			return type;
		}

		public Object getValue() {
			return value;
		}
		
		
		
	}

}
