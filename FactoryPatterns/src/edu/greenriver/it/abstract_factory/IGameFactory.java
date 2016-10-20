/**
 * Jami Schwarzwalder
 * Oct 20, 2016
 * IGameFactory.java
 * [Description Here]
 */
package edu.greenriver.it.abstract_factory;

import edu.greenriver.it.boardgame_parts.IGameBoard;
import edu.greenriver.it.boardgame_parts.IGameCards;
import edu.greenriver.it.boardgame_parts.IGameCurrency;
import edu.greenriver.it.boardgame_parts.IGamePieces;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */

//abstract Factory
public interface IGameFactory {
	
	//Factory methods...
	public IGameBoard getGameBoard();
	public IGamePieces getPieces();
	public IGameCurrency getCurrencies();
	public IGameCards getCards();

}
