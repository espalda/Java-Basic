package day09;

import java.util.Scanner; 
// java.utill이라는 package에  scanner 라는 class를 가져오겠다
// 다른 패키지 안에 있는 클래스를 사용하려면 import package.class;을 선언해야 해당 클래스를 사용가능
public class d9ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //scan 은 객체
		int num = scan.nextInt(); 
		//nextInt()는 Scanner 클래스의 멤버메서드
		
		char ch = scan.next().charAt(0);
		//next()는 Scanner 클래스의 멤버메서드
		//charAt()은 String 클래스의 멤버메서드
		scan.close();
	}


}
