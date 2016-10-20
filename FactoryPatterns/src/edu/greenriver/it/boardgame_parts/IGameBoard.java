/**
 * Jami Schwarzwalder
 * Oct 20, 2016
 * IGameBoard.java
 * [Description Here]
 */
package edu.greenriver.it.boardgame_parts;

import java.util.List;

import edu.greenriver.it.game_component.BoardSpace;
import edu.greenriver.it.game_component.GamePiece;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public interface IGameBoard {
	
	public List<BoardSpace> getBoardspaces();
	
	//move pieces on spaces
	public void addPiece(BoardSpace space, GamePiece piece);
	public boolean removePiece(BoardSpace space, GamePiece piece);
	public boolean move(BoardSpace source, BoardSpace destination, GamePiece piece);

}
