package edu.greenriver.it.patterns;

public class Magazine {
	
	private String name;
	
	public Magazine(String name){
		this.name = name;
	
	}
	
	public void printAthlete(IAthlete athlete){
		
		System.out.println("Athlete: " + athlete.getFirstName() + ", " + athlete.getLastName());
	}
	
	public void printAthleeteStats(IAthlete athlete){
		
		System.out.println("Stats: " + athlete.getEntireStatLine());
	}
}
