/**
 * 
 * @author Alyssa Ma
 * 3/15/18
 * Period 2
 */
public class Card
{
	int x;
	int y;
	
	String [] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	String [] suit = {"Diamonds", "Clubs", "Hearts", "Spades"};
	int [] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
	
	/**
	 * Card(String [] rank, String [] suit, int [] value)
	{
		this.rank = rank;
		this.suit = suit;
		this.value = value;
	}
	
	 * @param otherCard
	 * @return
	 */
	
	public boolean equals(Card otherCard)
	{
		return 
	}
	
	public String toString()
	{
		return rank[x] + "of " + suit[y];
	}


	public String[] getRank() {
		return rank;
	}


	public void setRank(String[] rank) {
		this.rank = rank;
	}


	public String[] getSuit() {
		return suit;
	}


	public void setSuit(String[] suit) {
		this.suit = suit;
	}


	public int[] getValue() {
		return value;
	}


	public void setValue(int[] value) {
		this.value = value;
	}
}
