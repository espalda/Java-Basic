package day22;

import java.util.ArrayList;
import java.util.Collections;

public class Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardPack cp = new CardPack();
		
		
	}
	
	// 카드 1장의 정보를 나타내는 클래스
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
		return "("+shape +","+ num +")";
	}
}


	// user 와 dealer 를 생성해서 user와 dealer에게 카드 7장씩 나눠주는 코드
	// 카드팩에서 유저와 딜러에게 카드를 1장씩 반복해서 7번 나눠주고
	// 유저와 딜러는 그 정보를 가지고 있어야 한다. set();

class CardPack{
	// 카드 1팩의 정보를 나타내는 클래스 52장의 1팩
	private ArrayList<Card> list = new ArrayList<Card>();
	
	// 기본생성자 : 새로운 카드팩을 생성하고 카드팩 섞음
	public CardPack(){
		cardPackSetAll();
		shuffle();
	}
	
	// 기능 : 새로운 카드팩을 만드는 메서드
	public void cardPackSetAll(){
		list.clear();
		cardPackSet("S");
		cardPackSet("D");
		cardPackSet("H");
		cardPackSet("C");
	}
	
	//기능 : 모양이 주어지면 해당 모양의 1번 카드부터 k카드까지 팩에 추가
	private void cardPackSet(String shape){
		for(int i =1; i<=13; i++){
			Card c = new Card();
			c.setNum(i);
			c.setShape(shape);
			list.add(c);
		}
	}
	
	// 기능 : 현재 카드팩 내용을 보여주는 메서드
	public void show(){
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i) + " ");
			if((i+1) % 10 == 0) System.out.println();
		}
	}
	
	// 기능 : 카드팩을 섞는 메서드
	public void shuffle(){
		Collections.shuffle(list);
	}
	
	// 기능 : 카드팩에서 한장을 꺼내는 메서드
	public Card give(){
		if(list.size() != 0){
			Card c = new Card(list.get(0)); //0번지를 말하는건가?
			list.remove(0); //0번지를 제거?
			return c;
		}else{
			return null;
		}
	}
	
	
	
	
}

