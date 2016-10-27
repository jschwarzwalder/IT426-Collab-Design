package edu.greenriver.it.abstract_factory;

import edu.greenriver.it.boardgame_parts.IGameBoard;
import edu.greenriver.it.boardgame_parts.IGameCards;
import edu.greenriver.it.boardgame_parts.IGameCurrency;
import edu.greenriver.it.boardgame_parts.IGamePieces;

//abstract factory...
public interface IGameFactory 
{
	//factory methods...
	public IGameBoard getBoard();
	public IGamePieces getPieces();
	public IGameCurrency getCurrencies();
	public IGameCards getCards();
}
