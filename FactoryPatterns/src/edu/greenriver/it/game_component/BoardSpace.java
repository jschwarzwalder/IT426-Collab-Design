/**
 * Jami Schwarzwalder
 * Oct 20, 2016
 * GameBoard.java
 * [Description Here]
 */
package edu.greenriver.it.game_component;

import java.util.List;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class BoardSpace {
	private String name;
	private Dimension location; //(x,y)
	private List<GamePiece> gamePieces;
	private List<BoardSpace> adjacents;
	
	
	public BoardSpace (String name){
		this.name = name;
	}
	
}
