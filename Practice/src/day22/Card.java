package day22;

import java.util.ArrayList;
import java.util.Collections;

public class Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardPack cp = new CardPack();
		cp.shuffle();
		cp.show();
		System.out.println();
		cp.give();
		cp.show();
	}
	

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
	
	public void show(){
		System.out.println(shape +" , "+ num);
	}

	//[기본 생성자]
	public Card (){};
	
	//[생성자 오버로딩]
	public Card (int num, String shape){
		this.num = num;
		this.shape = shape;
	}
	//[복사 생성자]
	public Card (Card c){
		this.num = c.num;
		this.shape = c.shape;
	}
	@Override
	public String toString() {
		return ""+shape +","+ num + " ";
	}
}




class CardPack{
	private ArrayList<Card> list = new ArrayList<Card>();
	public CardPack(){
		cardPackSetAll();
		
	}
	/* 기능 : 모양이 주어지면 해당 모양의 1번 카드부터 k카드까지 팩에 추가
	 */
	private void cardPackSet(String shape){
		for(int i =1; i<=13; i++){
			Card c = new Card();
			c.setNum(i);
			c.setShape(shape);
			list.add(c);
		}
	}
	
	public void cardPackSetAll(){
		list.clear();
		cardPackSet("♠");
		cardPackSet("◆");
		cardPackSet("♥");
		cardPackSet("♣");
	}
	
	public void show(){
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) + " ");
			if((i+1) % 10 == 0) System.out.println();
		}
	}
	
	public void shuffle(){
		Collections.shuffle(list);
		System.out.println(list);
	}
	
	public Card give(){
		if(list.size() != 0){
			Card c = new Card(list.get(0));
			list.remove(0);
			return c;
		}else{
			return null;
		}
	}
	
	
	
	
	
}

