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
}