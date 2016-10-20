/**
 * Jami Schwarzwalder
 * Oct 20, 2016
 * MonoployCurrency.java
 * [Description Here]
 */
package edu.greenriver.it.monopoly;

import java.util.List;

import edu.greenriver.it.boardgame_parts.IGameCurrency;
import edu.greenriver.it.game_component.GameCurrency;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class MonoployCurrency implements IGameCurrency {

	/**
	 * 
	 * @param type
	 * @return
	 * @see edu.greenriver.it.boardgame_parts.IGameCurrency#getCurrency(java.lang.String)
	 */
	@Override
	public List<GameCurrency> getCurrency(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param money
	 * @return
	 * @see edu.greenriver.it.boardgame_parts.IGameCurrency#getTotal(java.util.List)
	 */
	@Override
	public int getTotal(List<GameCurrency> money) {
		// TODO Auto-generated method stub
		return 0;
	}

}
