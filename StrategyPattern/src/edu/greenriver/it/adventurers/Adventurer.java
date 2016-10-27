package edu.greenriver.it.adventurers;

import edu.greenriver.it.behaviors.Behavior;
import edu.greenriver.it.weapons.Weapon;

public class Adventurer 
{
	private String name;
	
	//encapsulated algorithms
	private Behavior behavior;
	private Weapon weapon;
	
	public Adventurer(String name, Behavior behavior, Weapon weapon)
	{
		//assign my fields
		this.name = name;
		this.behavior = behavior;
		this.weapon = weapon;
	}

	public String getName() 
	{
		return name;
	}

	public Behavior getBehavior() 
	{
		return behavior;
	}

	public Weapon getWeapon() 
	{
		return weapon;
	}

	@Override
	public String toString() 
	{
		return "Adventurer [name=" + name + ", behavior=" + behavior
				+ ", weapon=" + weapon + "]";
	}
}
