package edu.greenriver.it.boardgame_parts;

import java.util.List;

import edu.greenriver.it.game_components.BoardSpace;
import edu.greenriver.it.game_components.Piece;

public interface IGameBoard 
{
	public List<BoardSpace> getBoardSpaces();
	
	//move pieces on spaces
	public boolean addPiece(BoardSpace space, Piece piece);
	public boolean removePiece(BoardSpace space, Piece piece);
	public boolean move(BoardSpace source, BoardSpace destination, Piece piece);
}
