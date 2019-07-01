package day23;

import java.util.*;

public class CardPack {

	private ArrayList<Card> list = new ArrayList<Card>();
	
	//shape이 정해지면 shape의 1부터 13까지의 카드정보를 카드팩에 추가 
	public void cardPackSet(String shape){
		for(int i =1; i<=13; i++){
			Card c =  new Card();
			c.setNum(i);
			c.setShape(shape);
			list.add(c);
		}
	}
	
	//카드팩을 초기화 하는 메서드
	public void cardPackSetAll(){
		list.clear();
		cardPackSet("S");
		cardPackSet("D");
		cardPackSet("H");
		cardPackSet("C");
	}
	
	//카드팩의 내용을 보여주는 메서드
	public void show(){
		for(int i=0; i<list.size(); i++){ 			//0부터 리스트이 크기만큼 하나씩 증가해서
			System.out.println(list.get(i) + " ");  //각 번지를 하나씩 가져오는 메서드
			if((i+1) % 10 == 0){					//10개 마다 줄 바꿈
				System.out.println();
			}
		}
	}
	
	//카드팩을 섞는 메서드
	public void shuffle(){
		Collections.shuffle(list);
	}
	
	//카드팩에서 0번지의 한장을 빼는 메서드
	public Card give(){
		if(list.size() != 0){				//카드의 개수가 0이 아니면
			Card c = new Card(list.get(0));	//카드 클래스의 객체 c에 list의 0번지를 가져오겠다
			list.remove(0);					//0번지 값을 삭제하고 c값을 되돌려준다.
				return c;
		}else{				//
			return null;
		}
	}
	
	//[기본생성자] 카드팩을 초기화 시키고 섞는다
	public CardPack(){
		cardPackSetAll();
		shuffle();
	}
}
