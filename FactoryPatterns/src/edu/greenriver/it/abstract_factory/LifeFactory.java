package edu.greenriver.it.abstract_factory;

import edu.greenriver.it.boardgame_parts.IGameBoard;
import edu.greenriver.it.boardgame_parts.IGameCards;
import edu.greenriver.it.boardgame_parts.IGameCurrency;
import edu.greenriver.it.boardgame_parts.IGamePieces;
import edu.greenriver.it.life.LifeCards;
import edu.greenriver.it.life.LifeCurrency;
import edu.greenriver.it.life.LifeGameBoard;
import edu.greenriver.it.life.LifePieces;

public class LifeFactory implements IGameFactory
{
	@Override
	public IGameBoard getBoard() 
	{
		return new LifeGameBoard();
	}

	@Override
	public IGamePieces getPieces() 
	{
		return new LifePieces();
	}

	@Override
	public IGameCurrency getCurrencies() 
	{
		return new LifeCurrency();
	}

	@Override
	public IGameCards getCards() 
	{
		return new LifeCards();
	}
}
