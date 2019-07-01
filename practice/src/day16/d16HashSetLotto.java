package day16;

import java.util.*;

public class d16HashSetLotto {

	public static void main(String[] args) {
		//d16 HashSet Lotto
		Set set = new HashSet();	//set 인터페이스를 생성
		while (set.size() < 6){ 	//i는 0번지부터 5까지 하나씩 증가
			int num = (int)(Math.random()*45)+1; //1에서 45까지의 랜덤한 수 생성
			set.add(new Integer(num));
		}
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	}
}
