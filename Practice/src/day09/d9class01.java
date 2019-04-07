package day09;

import java.util.Scanner; 
// java.utill이라는 package에  scanner 라는 class를 가져오겠다
// 다른 패키지 안에 있는 클래스를 사용하려면 import package.class;을 선언해야 해당 클래스를 사용가능
public class d9class01 {

	public static void main(String[] args) {
		/* 클래스멤버와 객체멤버
		 * - 객체멤버
		 * 객체가 생성된 후에 사용할 수 있다 =new Tv
		 * 객체.멤버변수, 객체.멤버메서드로 호출
		 * 객체멤버는 만들어진 객체마다 가지고 있다

		 * - 클래스멤버
		 * 객체의 생성 없이 사용할수 있다
		 * 클래스.멤버변수, 클래스,멤버메서드로 호출
		 * 클래스멤버는 하나씩만 만들어진다
		 * Static 붙고 공유된다
		 */
		
		Scanner scan = new Scanner(System.in); //scan 은 객체
		int num = scan.nextInt(); 
		//nextInt()는 Scanner 클래스의 멤버메서드
		
		char ch = scan.next().charAt(0);
		//next()는 Scanner 클래스의 멤버메서드
		//charAt()은 String 클래스의 멤버메서드
		scan.close();
	}


}
