package edu.greenriver.it.magazines;

import edu.greenriver.it.adapters.BaseballAdapter;
import edu.greenriver.it.adapters.BasketBallAdapter;
import edu.greenriver.it.adapters.SoccerAdapter;
import edu.greenriver.it.other_adapters.SIBasketBallAdapter;
import edu.greenriver.it.other_adapters.SportsIllustrated;
import edu.greenriver.it.patterns.BaseballAthlete;
import edu.greenriver.it.patterns.BasketBallAthlete;
import edu.greenriver.it.patterns.SoccerAthlete;

public class TestAthletes 
{
	public static void main(String[] args) 
	{
		//testAdapterPartOne();
		testAdapterPartTwo();
	}
	
	public static void testAdapterPartTwo()
	{
		SportsIllustrated magazine = new SportsIllustrated("SI");

		BasketBallAthlete kingJames = new BasketBallAthlete("Lebron", "James");
		
		kingJames.addANewStat(new BasketBallAthlete.Stat("rings", 3));
		kingJames.addANewStat(new BasketBallAthlete.Stat("free-throw pct", .90));
		
		//use an adapter through inheritance
		magazine.printAthlete(new SIBasketBallAdapter(kingJames));
	}
	
	public static void testAdapterPartOne()
	{
		SoccerAthlete clint = new SoccerAthlete("Clint Dempsey");
		
		clint.addStatLine("goals", 7);
		clint.addStatLine("position", "striker");
		
		BaseballAthlete mikeTrout = new BaseballAthlete("Mike", "C", "Trout");
		
		mikeTrout.addStat("batting avg - 0.344");
		mikeTrout.addStat("position - center field");
		
		BasketBallAthlete kingJames = new BasketBallAthlete("Lebron", "James");
		
		kingJames.addANewStat(new BasketBallAthlete.Stat("rings", 3));
		kingJames.addANewStat(new BasketBallAthlete.Stat("free-throw pct", .90));
		
		//try to use my adapters
		Magazine espn = new Magazine("ESPN");
		
		//use an adapter with an interface
		espn.printAthlete(new SoccerAdapter(clint));
		espn.printAthlete(new BaseballAdapter(mikeTrout));
		espn.printAthlete(new BasketBallAdapter(kingJames));
	}
}
