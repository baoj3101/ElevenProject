package Eleven;

public class BlackJackCard extends Card
{
  	//constructors
  	public BlackJackCard( String s, int f)
  	{
            super(s, f);    // this is calling Card constructor
  	}

  	//accessors
	public int getValue()
	{
            if( getFace() == 1 )    // BlackJack rules, A
		return 11;
            if( getFace() >= 10 )   // 10, J, Q, K
		return 10;
            return getFace();       // 2 - 9
	}

  	//toString
  	public String toString()
  	{
            return super.toString() + " " + getValue();
  	}
 }