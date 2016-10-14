package edu.greenriver.it.patterns;

public class TestAthletes {

	public static void main(String[] args) {
		SoccerAthleete clint = new SoccerAthleete("Clint Dempsey");
		
				clint.addStatLine("goals", 7);
		clint.addStatLine("position", "striker");
		
		BaseballAthlete mikeTrout = new BaseballAthlete("Mike", "C", "Trout");
		
		mikeTrout.addStat("batting avg -0.3444");
		mikeTrout.addStat("position - center field");
		
		BasketballAthlete kingJames = new BasketballAthlete ("Lebron", "James");
		
		kingJames.addANewStat(new BasketballAthlete.Stat("rings", 3));
		kingJames.addANewStat(new BasketballAthlete.Stat("free-throw-pass", 3));
	}

}
