package Test;

import java.util.*;

public class Card {

	public static void main(String[] args) {
		boolean s1 = false,
				s2 = false;
		int cnt = 0;
		while( !(s1 || s2)){
			CardPack cp = new CardPack();
			ArrayList<Card> user = new ArrayList<Card>();
			ArrayList<Card> dealer = new ArrayList<Card>();
			for(int i=1; i<=7; i++){
				user.add(cp.give());
				dealer.add(cp.give());
			}
			
			//System.out.println(PockerRule.pare(user));
			s1 = PockerRule.flush(user);
			System.out.println(s1);
			System.out.println(user);
			
			//System.out.println(PockerRule.pare(dealer));
			s1 = PockerRule.flush(dealer);
			System.out.println(s2);
			System.out.println(dealer);
			cnt++;
		}
		System.out.println(cnt);
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
	
	// 기능 : 모양이 주어지면 해당 모양의 1번 카드부터 k카드까지 팩에 추가
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
			Card c = new Card(list.get(0)); //0번지를 말하는건가? 네
			list.remove(0); //0번지를 제거? 네
			return c;
		}else{
			return null;
		}
	}
	
}


// 원페어 : 숫자가 같은 카드가 2장이고 한셋인 경우
class PockerRule{
	/* 기능 : 페어를 찾는 메소드
	 * 매개변수 : 카드 리스트
	 * 리턴타입 : 0 : 페어없음, 1 : 원페어, 2 : 투페어(페어가 2개이상)
	 */
	public static int pare(ArrayList<Card> list){ //Point p
		int pareCnt = 0; //페어의 갯수
		for(int i=0; i<list.size(); i++){
			int cnt = 0;	//같은 숫자의 갯수
			for(int j=0; j<list.size(); j++){
				if(list.get(i).getNum() == list.get(j).getNum()){
					cnt++;
				}
			}
			if(cnt == 2){
				pareCnt++;
			}
		}
		return pareCnt/2;
	}
	
	// 0- 스트레이트 아님, 1- 스트레이트, 2- 백스트레이트, 3-마운틴
	public static int straight(ArrayList<Card>list){
		Collections.sort(list, new Comparator<Card>(){
			@Override
			public int compare(Card c1, Card c2) {
				return c1.getNum()  - c2.getNum();
			}
		});
		//1이 있는지 체크
		boolean flag = false;
		boolean isStraight = false;
		for(int i=0; i<list.size()-3; i++){
			int straightCnt = 1;
			int std = list.get(i).getNum();
			if(std == 1){
				flag = true;
			}
				
			for(int j=i+1; j<list.size(); j++){
				if(std+straightCnt == list.get(j).getNum()){
					straightCnt++;
				}else if(std+straightCnt-1 
						== list.get(j).getNum()){
					continue;
				}else{
					break;
				}
			}
			//마운틴의 경우, 10,j,q,k
			if(straightCnt == 4 && std == 10 && flag){
				return 3;
			}
			if(straightCnt >= 5 && std == 1)	return 2; 
			if(straightCnt >= 5) isStraight = true;
		}
		if(isStraight){
			return 1;
		}
		return 0;
	}
	
	//플러쉬 : 모양이 같은 5개의 카드
	public static boolean flush(ArrayList<Card> list){
		//매개변수(자료형 변수)ArrayList가 자료형이 되는건가? list는 객체? 아니면 변수? 
		int sCnt = 0;	//스페이스 개수
		int cCnt = 0;	//클로버 개수
		int hCnt = 0;	//하트 개수
		int dCnt = 0;	//다이아 개수
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getShape().equals("S")) sCnt++; 	//i번지의 값을 반환하고, 카드의 shape를 가져오는게
			if(list.get(i).getShape().equals("H")) hCnt++;	//가져온 shape 가 S와 같은지 확인하겠다.
			if(list.get(i).getShape().equals("C")) cCnt++;	//만약 그 값이S이면 sCnt 의 값을 하나씩 증가하겠다!
			if(list.get(i).getShape().equals("D")) dCnt++;
		}
		if(sCnt >= 5 || hCnt >= 5 || dCnt >= 5 || cCnt >= 5)
			return true;
		return false;	
	}
}