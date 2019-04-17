package day17;

import java.util.*;

public class d17ball {

	public static void main(String[] args) {
		//d17 야구게임
		Scanner scan = new Scanner(System.in);
		List<Integer> com = d17Lotto.random(1, 9, 3);  //컴퓨터의 숫자
		
		List<Integer> play = new LinkedList();
		int num1 = scan.nextInt();	//나의 숫자
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		play.add(num1);
		play.add(num2);
		play.add(num3);
		
//		int strike =0;
//		int ball =0;
//		while(strike<3){
//			int num1 = scan.nextInt();
//			int num2 = scan.nextInt();
//			int num3 = scan.nextInt();
//			user.add(num1);
//			user.add(num2);
//			user.add(num3);

	}
	/* 기능 : 스트라이트의 갯수를 계산하는 반복문 메서드
	 * 매개변수 : 
	 * 리턴타입 : 갯수 int
	 */
	public static int countball (List<Integer> list,
			List<Integer> num1){
		for(int i=0; i<list.size(); i++){
			//List<Integer> cnt = d17Lotto.count(list, play(i));
		}
		
		
		return 0;
	}
	
	
	
	
	
	
	
}
