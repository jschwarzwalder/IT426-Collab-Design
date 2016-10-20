/**
 * Jami Schwarzwalder
 * Oct 20, 2016
 * LifeBoard.java
 * [Description Here]
 */
package edu.greenriver.it.life;

import java.util.List;

import edu.greenriver.it.boardgame_parts.IGameBoard;
import edu.greenriver.it.game_component.BoardSpace;
import edu.greenriver.it.game_component.GamePiece;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class LifeBoard implements IGameBoard {

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
