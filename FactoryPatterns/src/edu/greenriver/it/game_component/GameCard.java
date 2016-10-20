/**
 * Jami Schwarzwalder
 * Oct 20, 2016
 * GameCard.java
 * [Description Here]
 */
package edu.greenriver.it.game_component;

import java.util.List;

import edu.greenriver.it.boardgame_parts.IGameCards;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class GameCard implements IGameCards {
	
	private String text;
	private String type;
	private String frontImage;
	private String backImage;
	/**
	 * 
	 * @param type
	 * @return
	 * @see edu.greenriver.it.boardgame_parts.IGameCards#getDeck(java.lang.String)
	 */
	@Override
	public List<GameCard> getDeck(String type) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * 
	 * @param cards
	 * @see edu.greenriver.it.boardgame_parts.IGameCards#shuffle(java.util.List)
	 */
	@Override
	public void shuffle(List<GameCard> cards) {
		// TODO Auto-generated method stub
		
	}

}
