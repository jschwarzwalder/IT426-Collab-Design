package edu.greenriver.it.boardgame_parts;

import java.util.List;

import edu.greenriver.it.game_components.Currency;

public interface IGameCurrency 
{
	public List<Currency> getCurrency(String type);
	public int getTotal(List<Currency> currencies);
}
