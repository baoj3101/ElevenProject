package Eleven;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.awt.Color;

public class Main
{
	public static void main( String args[] )
	{
            CardRunner();
            DeckRunner();
        }
        public static void CardRunner() {
            Card one = new Card("SPADES", 9);
            out.println(one.getSuit());
            out.println(one.getFace());

            Card two = new Card("DIAMONDS", 1);
            out.println(two);
            two.setFace(3);
            out.println(two);

            Card three = new Card("CLUBS", 4);
            out.println(three);

            Card four = new Card("SPADES", 12);
            out.println(four);

            Card five = new Card("HEARTS", 12);
            out.println(five);
	}
        public static void DeckRunner() {
            Deck one = new Deck();
            System.out.println("Before Shuffle ======================");
            for (int i = 1; i <= Deck.NUM_CARDS_DECK; i++) {
                System.out.println(i + " :: " + one.dealCard());
            }
            one.shuffle();
            System.out.println("After Shuffle ======================");
            for (int i = 1; i <= Deck.NUM_CARDS_DECK; i++) {
                System.out.println(i + " :: " + one.dealCard());
            }
        }
}