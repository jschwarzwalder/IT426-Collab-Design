package edu.greenriver.it.abstract_factory;

import edu.greenriver.it.boardgame_parts.IGameBoard;
import edu.greenriver.it.boardgame_parts.IGameCards;
import edu.greenriver.it.boardgame_parts.IGameCurrency;
import edu.greenriver.it.boardgame_parts.IGamePieces;
import edu.greenriver.it.monopoly.MonopolyCards;
import edu.greenriver.it.monopoly.MonopolyCurrency;
import edu.greenriver.it.monopoly.MonopolyGameBoard;
import edu.greenriver.it.monopoly.MonopolyPieces;

public class MonopolyFactory implements IGameFactory
{
	@Override
	public IGameBoard getBoard() 
	{
		return new MonopolyGameBoard();
	}

	@Override
	public IGamePieces getPieces() 
	{
		return new MonopolyPieces();
	}

	@Override
	public IGameCurrency getCurrencies() 
	{
		return new MonopolyCurrency();
	}

	@Override
	public IGameCards getCards() 
	{
		return new MonopolyCards();
	}
}
