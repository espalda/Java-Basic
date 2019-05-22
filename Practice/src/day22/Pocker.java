package day22;

import java.util.*;

public class Pocker {
	
	public static void main(String[] args) {
	ArrayList<Card> user = new ArrayList<Card>();
	
	
	
	
	 
	}
}

class CardPack{
	
	
}






class Card{
	private int num;
	private String shape;
	public int getNum() {
		return num;
	}
	public String getShape() {
		return shape;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	
	@Override
	public String toString() {
		String s = new String();
		if(shape.equals("S")) s += "♠"; //s += ?????
		else if (shape.equals("D")) s += "◆";
		else if (shape.equals("C")) s += "♣";
		else if (shape.equals("H")) s += "♥";
		
		if(num == 11) s += "J";
		else if(num == 12) s += "Q";
		else if(num == 13) s += "K";
		else s += num;
		return s;
	}
	public Card(){};
	public Card(Card c){
		this.num = c.num;
		this.shape = c.shape;
	}
}