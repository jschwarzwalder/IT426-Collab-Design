package edu.greenriver.it.monopoly;

import java.util.ArrayList;
import java.util.List;

import edu.greenriver.it.boardgame_parts.IGameBoard;
import edu.greenriver.it.game_components.BoardSpace;
import edu.greenriver.it.game_components.Piece;

public class MonopolyGameBoard implements IGameBoard
{
	private List<BoardSpace> spaces;
	
	public MonopolyGameBoard()
	{
		BoardSpace go = new BoardSpace("GO");
		BoardSpace mediterraenean = new BoardSpace("mediterraenean ave");
		BoardSpace baltic = new BoardSpace("baltic ave");
		
		spaces = new ArrayList<BoardSpace>();
		
		spaces.add(go);
		spaces.add(mediterraenean);
		spaces.add(baltic);
	}
	
	@Override
	public List<BoardSpace> getBoardSpaces() 
	{
		return spaces;
	}

	@Override
	public boolean addPiece(BoardSpace space, Piece piece) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removePiece(BoardSpace space, Piece piece) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean move(BoardSpace source, BoardSpace destination, Piece piece) 
	{
		// TODO Auto-generated method stub
		return false;
	}
}
