
public class Running_Runner 
{
public static void main(String[] args) {
		
		String[] rank = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suit = {"Diamonds" , "Clubs" , "Hearts" , "Spades"};
		int[] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
		Deck unDealt = new Deck(rank, suit, value);
		unDealt.shuffle();
		
		int x = 0;
		while(unDealt.size() > 0)
		{
			if(x < 10)
			{
				System.out.print(x + "    ");
			}
			if(x >= 10)
			{
				System.out.print(x + "   ");
			}
			System.out.println(unDealt.deal());
			x++;
		}
	}
}
