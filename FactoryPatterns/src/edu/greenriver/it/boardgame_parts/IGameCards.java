package edu.greenriver.it.boardgame_parts;

import java.util.List;

import edu.greenriver.it.game_components.Card;

public interface IGameCards 
{
	public List<Card> getDeck(String type);
	
	public void shuffle(List<Card> cards);
}
