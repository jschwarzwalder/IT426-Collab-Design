/**
 * Jami Schwarzwalder
 * Oct 20, 2016
 * LifeFactory.java
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
public class LifeFactory implements IGameFactory {

	/**
	 * 
	 * @return
	 * @see edu.greenriver.it.abstract_factory.IGameFactory#getGameBoard()
	 */
	@Override
	public IGameBoard getGameBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @return
	 * @see edu.greenriver.it.abstract_factory.IGameFactory#getPieces()
	 */
	@Override
	public IGamePieces getPieces() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @return
	 * @see edu.greenriver.it.abstract_factory.IGameFactory#getCurrencies()
	 */
	@Override
	public IGameCurrency getCurrencies() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @return
	 * @see edu.greenriver.it.abstract_factory.IGameFactory#getCards()
	 */
	@Override
	public IGameCards getCards() {
		// TODO Auto-generated method stub
		return null;
	}

}
