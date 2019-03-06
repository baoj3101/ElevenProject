package Eleven;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck{
    public static final int NUMCARDS = 52;
    public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");

    private List<Card> cards;
    private int top;
    
    public Deck(){
        cards = new ArrayList <Card>();
        top = 51;
        for (String m:SUITS){
            for (int i=1;i<14;i++){
                cards.add(new BlackJackCard(m,i));
            }
        }
    }
    
    public String dealCard(){
        int x = top;
        --top;
        return cards.get(x).toString();
    }
    
    public void shuffle(){
        Collections.shuffle(cards);
        top = 51;
    }
        
}




   //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck

   
   //make a dealCard() method that returns the top card
   
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 