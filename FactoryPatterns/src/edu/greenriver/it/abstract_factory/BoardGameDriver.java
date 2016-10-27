package edu.greenriver.it.abstract_factory;

import java.util.List;

import edu.greenriver.it.boardgame_parts.IGameBoard;
import edu.greenriver.it.boardgame_parts.IGamePieces;
import edu.greenriver.it.game_components.BoardSpace;
import edu.greenriver.it.game_components.Piece;

public class BoardGameDriver 
{
	public static void main(String[] args)
	{
		IGameFactory boardGame = new LifeFactory(); // new MonopolyFactory();
		
		//start some pieces on our board
		IGameBoard board = boardGame.getBoard();
		IGamePieces pieces = boardGame.getPieces();
		
		List<BoardSpace> spaces = board.getBoardSpaces();
		List<Piece> listOfPieces = pieces.getGamePieces();
		
		//for monopoly this will place a "dog" piece on "go"
		board.addPiece(spaces.get(0), listOfPieces.get(0));
	}
}
