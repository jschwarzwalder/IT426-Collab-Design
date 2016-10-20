/**
 * Jami Schwarzwalder
 * Oct 20, 2016
 * IGameMoney.java
 * [Description Here]
 */
package edu.greenriver.it.boardgame_parts;

import java.util.List;

import edu.greenriver.it.game_component.GameCurrency;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public interface IGameCurrency {
	
	public List<GameCurrency> getCurrency(String type);
	public int getTotal(List<GameCurrency> money);

}
