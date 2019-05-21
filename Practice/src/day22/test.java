package day22;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Card> list = new ArrayList<Card>();
		String s = " ";
		for(int i=1; i<=13; i++){
			switch(s){
			case ("Heart") : System.out.println("♥"); break;
			case ("Space") : System.out.println("♠"); break;
			case ("dia") : System.out.println("◆"); break;
			case ("clover") : System.out.println("♣"); break;
			}
			list.add(new Card(i, " "));
			
			}System.out.println(list);
	}

}
