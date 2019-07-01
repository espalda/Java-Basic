package day18;

import day18.Card.kind;

public class d18enums {

	public static void main(String[] args) {
		/* d18 열거형 enums
		 * 제한된 값들을 가지는 멤버들을 효율적으로 관리하기 위해서 사용
		 * 상수
		 */
		Card c = new Card();
		System.out.println(c.k);
		
		c.k = kind.CLOVER;
		System.out.println(c.k.ordinal());
		System.out.println(c.k.name());
	}
}
class Card{
	public enum kind {
	SPACE(1), CLOVER(2), HEART(3), DIA(4);
	private final int value;
		kind(int value){this.value = value;}
		public int getValue(){return value;}
	}
	kind k = kind.SPACE;
}
	
	

