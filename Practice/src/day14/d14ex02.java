package day14;

import java.util.ArrayList;

public class d14ex02 {

	public static void main(String[] args) {
		/* d14 래퍼 클래스 wrapper
		 * 일반 자료형을 클래스로 만든 클래스
		 * 매개변수로 객체를 요구할때
		 * 오토박싱 : 기본자료형 → 래퍼클래스의 객체
		 * 언박싱 : 래퍼클래스의 객체 → 기본자료형으로
		 * 정수형 int가 아닌 정수형 클래스 Integer가 들어가야 한다
		 */
		ArrayList<Integer> list;
		printObj(10);
	}
	
	public static void printObj(Object obj){
		System.out.println(obj.toString());
	}
}
