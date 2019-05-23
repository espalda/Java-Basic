package Test;

import java.util.*;
import day23.Card;

public class C_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card();
		for(int i = 0; i<=13; i++){
			c.setNum(i);
			c.setShape("Heart");
		}
		
		 // c.setNum(5); c.setShape("Heart");
	   	 
		
		ArrayList<Card> list = new ArrayList<Card>();
		for(int i=1; i<=13; i++){
			list.add(new Card(c));
			}System.out.println(list);

	}
}
