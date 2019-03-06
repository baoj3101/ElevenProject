package Eleven;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
		//String suit
		//int face
        private String suit;
        private int face;
        
  	public Card(String suit, int face){
            setCards(suit,face);
        }

        public void setCards(String s, int f){
            this.suit = s;
            this.face = f;
        }
            
        public String getSuit(){
            return this.suit;
        }
        
        public int getFace(){
            return this.face;
        }
        
        public void setFace(int f){
            this.face = f;
        }
        public void setSuit(String s){
            this.suit = s;
        }


  	public String toString(){
            return FACES[this.face] + " of " + this.suit;

 }
}