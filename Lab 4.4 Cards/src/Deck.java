import java.util.ArrayList;

/**
 * 
 * @author Alyssa Ma
 * 3/13/18
 * Period 2
 */
public class Deck(String [] rank, String [] suit, int [] value)
{
	
	
	this.Dealt = new ArrayList<Card>();
	this.unDealt = new ArrayList<Card>();
	
	int totalCards = rank.length * suit.length;

	ArrayList<Card> unDealt = new ArrayList<Card>();
	ArrayList<Card> Dealt = new ArrayList<Card>();
	
	for(int i = 0; i < ranks.length; i++)
	{
		for(int j = 0; j < suits.length ; j++)
		{
			unDealt.add(newCard(ranks[i], suits[j], value[i]));
		}
	}
	
	public boolean isEmpty()
	{
		
	}
	
	public int size()
	{
		
	}
	
	public 
}
