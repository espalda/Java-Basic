package day09;

import java.util.Scanner; 
//java.utill이라는 package안에  scanner라는 class를 가져오겠다
//다른 패키지 안에 있는 클래스를 사용하려면 import package.class;을 선언해야 해당 클래스를 사용가능
public class d9class1 {

	public static void main(String[] args) {
		/* d9 클래스 멤버변수
		 * 클래스 멤버변수와 객체(일반) 멤버변수
		 * - 객체(일반) 멤버변수
		 * 객체가 생성된 후에 사용할 수 있다
		 * 객체.멤버변수, 객체.멤버메서드로 호출
		 * 객체멤버는 만들어진 객체마다 가지고 있다
		 * 생성자로 초기화

		 * - 클래스 멤버변수 static
		 * 객체의 생성 없이 클래스를 통해 호출할수 있다 (객체가 있어도 호출 가능)
		 * 클래스.멤버변수, 클래스.멤버메서드로 호출
		 * 클래스 멤버변수는 하나씩만 만들어진다
		 * Static 붙고 멤버변수를 모든 객체들이 공유한다
		 * 생성자가 없어 static {초기화 블럭} 에서 초기화
		 * 
		 * 
		 * 0520 추가
		 * static 멤버 메서드 구현에 일반멤버변수와 일반 멤버 메소드를 사용할수 없다
		 * 일반 멤버변수와 멤버 메서드는 개체를 생성할때 할당된다.
		 * 따라서 객체 없이 사용할수 있는 static 멤버 메서드에서 사용할수 없다.
		 * 
		 * 멤버변수 초기화 순서
		 * 
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
