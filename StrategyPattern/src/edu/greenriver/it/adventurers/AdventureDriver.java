package edu.greenriver.it.adventurers;

import edu.greenriver.it.behaviors.AggressiveBehavior;
import edu.greenriver.it.behaviors.SmartBehavior;
import edu.greenriver.it.magic.LightMagic;
import edu.greenriver.it.weapons.Shield;
import edu.greenriver.it.weapons.Staff;
import edu.greenriver.it.weapons.Sword;

public class AdventureDriver 
{
	public static void main(String[] args) 
	{
		//knight
		Adventurer oswald = new Adventurer("Oswald", new AggressiveBehavior(), new Shield());
		Adventurer susy = new Adventurer("Susy", new AggressiveBehavior(), new Sword());
		MagicalAdventurer gandalf = new MagicalAdventurer("Gandalf", new SmartBehavior(), new Staff(), new LightMagic());
		
		//interact with my knight
		gandalf.getBehavior().takeAction();
		gandalf.getWeapon().defendYourself();
		gandalf.getMagic().performMagic();
		
		//how can I add a new family of algorithms (strategy), without changing Adventurer
		
	}
}
