/**
 * Jami Schwarzwalder
 * Oct 20, 2016
 * MonopolyFactory.java
 * [Description Here]
 */
package edu.greenriver.it.abstract_factory;

import edu.greenriver.it.boardgame_parts.IGameBoard;
import edu.greenriver.it.boardgame_parts.IGameCards;
import edu.greenriver.it.boardgame_parts.IGameCurrency;
import edu.greenriver.it.boardgame_parts.IGamePieces;
import edu.greenriver.it.monopoly.MonoployCurrency;
import edu.greenriver.it.monopoly.MonopolyBoard;
import edu.greenriver.it.monopoly.MonopolyCards;
import edu.greenriver.it.monopoly.MonopolyPieces;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class MonopolyFactory implements IGameFactory {

	/**
	 * 
	 * @return
	 * @see edu.greenriver.it.abstract_factory.IGameFactory#getGameBoard()
	 */
	@Override
	public IGameBoard getGameBoard() {
		// TODO Auto-generated method stub
		return new MonopolyBoard();
	}

	/**
	 * 
	 * @return
	 * @see edu.greenriver.it.abstract_factory.IGameFactory#getPieces()
	 */
	@Override
	public IGamePieces getPieces() {
		// TODO Auto-generated method stub
		return new MonopolyPieces();
	}

	/**
	 * 
	 * @return
	 * @see edu.greenriver.it.abstract_factory.IGameFactory#getCurrencies()
	 */
	@Override
	public IGameCurrency getCurrencies() {
		// TODO Auto-generated method stub
		return new MonoployCurrency();
	}

	/**
	 * 
	 * @return
	 * @see edu.greenriver.it.abstract_factory.IGameFactory#getCards()
	 */
	@Override
	public IGameCards getCards() {
		// TODO Auto-generated method stub
		return new MonopolyCards();
	}

}
