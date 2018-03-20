import java.util.ArrayList;

/**
 * 
 * @author Alyssa Ma
 * 3/13/18
 * Period 2
 */
public class Deck
{
	ArrayList<Card> unDealt = new ArrayList<Card>();
	ArrayList<Card> Dealt = new ArrayList<Card>(); 

	public Deck(String [] rank, String [] suit, int [] value)
	{
		for(int x = 0; x < rank.length; x++)
		{
			for(int y = 0; y < suit.length; y++)
			{
				unDealt.add(0, new Card(rank [x] , suit [y], value [x]));
			}
		}
	}

	public boolean isEmpty()
	{
		return(unDealt.size() == 0);
	}

	public int size()
	{
		return(unDealt.size());
	}

	public Card deal()
	{
		if(!unDealt.isEmpty())
		{
			Card x = unDealt.remove(0);
			Dealt.add(x);
			return x; 
		}
		else
		{
		return null;
		}
	}

	public void shuffle()
	{
		unDealt.addAll(getDealt());
		
		for(int a = 1; a < 52; a++)
		{
			int b = (int)(Math.random()*a);
			Card c = unDealt.get(b);
			unDealt.set(b, unDealt.get(a));
			unDealt.set(a, c);
		}

	}

	public ArrayList<Card> getUnDealt() 
	{
		return unDealt;
	}

	public void setUnDealt(ArrayList<Card> unDealt) 
	{
		this.unDealt = unDealt;
	}

	public ArrayList<Card> getDealt() 
	{
		return Dealt;
	}

	public void setDealt(ArrayList<Card> dealt) 
	{
		this.Dealt = dealt;
	}

}
