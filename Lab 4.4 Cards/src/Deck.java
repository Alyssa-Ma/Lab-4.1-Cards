/**
 * 
 * @author Alyssa Ma
 * 3/13/18
 * Period 2
 */
public class Deck (String [] rank, String [] suit, int [] value)
{
	ArrayList<Card> unDealt = new ArrayList<Card>();
	ArrayList<Card> Dealt = new ArrayList<Card>();
	
	for(int i = 0; i < ranks.length; i++)
	{
		for(int j = 0; j < suits.length ; j++)
		{
			unDealt.add(newCard(ranks[i], suits[j], value[i]));
		}
	}
}
