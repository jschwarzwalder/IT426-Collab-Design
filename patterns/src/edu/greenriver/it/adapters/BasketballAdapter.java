/**
 * Jami Schwarzwalder
 * Oct 18, 2016
 * BasketballAdapter.java
 * [Description Here]
 */
package edu.greenriver.it.adapters;

import java.util.Set;

import edu.greenriver.it.magazines.IAthlete;
import edu.greenriver.it.patterns.BasketBallAthlete;
import edu.greenriver.it.patterns.BasketBallAthlete.Stat;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class BasketballAdapter implements IAthlete {
	
	private BasketBallAthlete athlete;
	
	public BasketballAdapter(BasketBallAthlete athlete) {
	
		this.athlete = athlete;
	}


	@Override
	public String getFirstName() {
		
		return athlete.getFname();
		
	}

	
	@Override
	public String getLastName() {
		
		return athlete.getLname();
	}

	
	@Override
	public String getEntireStatLine() {
		
		//assemble the stat line
		Set<Stat> stats = athlete.getStats();
		StringBuilder builder = new StringBuilder();
		
		for (Stat stat : stats) {
			builder.append(stat.getType());
			builder.append(": ");
			builder.append(stat.getValue());
			builder.append("\n");
		}
		
		return builder.toString();
	}

}
