/**
 * Jami Schwarzwalder
 * Oct 20, 2016
 * IGameCards.java
 * [Description Here]
 */
package edu.greenriver.it.boardgame_parts;

import java.util.List;
import java.util.Map;

import edu.greenriver.it.game_component.GameCard;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public interface IGameCards {
	
	//public Map<String, List<GameCard>> getAllCards();
	
	public List<GameCard> getDeck(String type);
	
	public void shuffle(List<GameCard> cards);
	
	

}
