/**
 * Jami Schwarzwalder
 * Oct 20, 2016
 * BoardGameDriver.java
 * [Description Here]
 */
package edu.greenriver.it.abstract_factory;

/**
 *
 * @author Jami Schwarzwalder
 * @version 1.1
 */
public class BoardGameDriver {
	
	public static void main(String[] args){
		IGameFactory boardGame = new MonolpolyFactory();
		
		//Start some pieces on our board
		IGameBoard board = boardGame.getBoard();
		IGamePieces pieces = boardGame.getPieces();
		
		
	}

}
