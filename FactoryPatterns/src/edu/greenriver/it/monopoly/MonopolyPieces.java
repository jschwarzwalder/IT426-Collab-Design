package edu.greenriver.it.monopoly;

import java.util.ArrayList;
import java.util.List;

import edu.greenriver.it.boardgame_parts.IGamePieces;
import edu.greenriver.it.game_components.Piece;

public class MonopolyPieces implements IGamePieces 
{
	private List<Piece> pieces;
	
	public MonopolyPieces()
	{
		pieces = new ArrayList<Piece>();
		
		pieces.add(new Piece("dog"));
		pieces.add(new Piece("hat"));
		//...
	}
	
	@Override
	public List<Piece> getGamePieces() 
	{
		return pieces;
	}
}
