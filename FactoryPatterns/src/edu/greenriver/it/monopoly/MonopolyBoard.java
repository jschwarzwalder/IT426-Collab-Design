/**
 * Jami Schwarzwalder
 * Oct 20, 2016
 * MonopolyBoard.java
 * [Description Here]
 */
package edu.greenriver.it.monopoly;

import java.util.List;

import edu.greenriver.it.abstract_factory.ArrayList;
import edu.greenriver.it.boardgame_parts.IGameBoard;
import edu.greenriver.it.game_component.BoardSpace;
import edu.greenriver.it.game_component.GamePiece;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class MonopolyBoard implements IGameBoard {

	BoardSpace go = new BoardSpace("Go");
	BoardSpace mediterraenean = new BoardSpace("Medditerian");
	BoardSpace baltic = new BoardSpace("baltic ave");
	
	spaces = new ArrayList<BoardSpace>();
	
	spaces.add(go);
	spaces.add(mediterraenean);
	spaces.add(baltic);
	
	/**
	 * 
	 * @return
	 * @see edu.greenriver.it.boardgame_parts.IGameBoard#getBoardspaces()
	 */
	@Override
	public List<BoardSpace> getBoardspaces() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param space
	 * @param piece
	 * @see edu.greenriver.it.boardgame_parts.IGameBoard#addPiece(edu.greenriver.it.game_component.BoardSpace, edu.greenriver.it.game_component.GamePiece)
	 */
	@Override
	public void addPiece(BoardSpace space, GamePiece piece) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 
	 * @param space
	 * @param piece
	 * @return
	 * @see edu.greenriver.it.boardgame_parts.IGameBoard#removePiece(edu.greenriver.it.game_component.BoardSpace, edu.greenriver.it.game_component.GamePiece)
	 */
	@Override
	public boolean removePiece(BoardSpace space, GamePiece piece) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 * @param source
	 * @param destination
	 * @param piece
	 * @return
	 * @see edu.greenriver.it.boardgame_parts.IGameBoard#move(edu.greenriver.it.game_component.BoardSpace, edu.greenriver.it.game_component.BoardSpace, edu.greenriver.it.game_component.GamePiece)
	 */
	@Override
	public boolean move(BoardSpace source, BoardSpace destination, GamePiece piece) {
		// TODO Auto-generated method stub
		return false;
	}

}
