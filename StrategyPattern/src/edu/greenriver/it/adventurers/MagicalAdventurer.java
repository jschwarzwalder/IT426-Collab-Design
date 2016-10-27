package edu.greenriver.it.adventurers;

import edu.greenriver.it.behaviors.Behavior;
import edu.greenriver.it.magic.Magic;
import edu.greenriver.it.weapons.Weapon;

public class MagicalAdventurer extends Adventurer
{
	//store a family of objects (strategies)
	private Magic magic;
	
	public MagicalAdventurer(String name, Behavior behavior, Weapon weapon, Magic magic)
	{
		super(name, behavior, weapon);
		
		this.magic = magic;
	}
	
	public Magic getMagic()
	{
		return magic;
	}
}
