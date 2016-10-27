package edu.greenriver.it.game_components;

import java.awt.Dimension;
import java.util.List;

public class BoardSpace 
{
	private String name;
	private Dimension location; //(x, y)
	private List<Piece> gamePieces;
	private List<BoardSpace> adjacents;
	
	public BoardSpace(String name) 
	{
		this.name = name;
	}
}
