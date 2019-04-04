package day08;

public class d8ex01 {

	public static void main(String[] args) {
		// d8 메서드 복습
		sum(1,3);
		// 이러한 형태는 의미가 없다
		
		int res = sum(1,2);
		System.out.println(res);
		// int res를 대입해서 사용할수 있다
	}
		/* 기능 : 두 정수의 합을 알려주는 메서드
		 * 매개변수 : int num1, int num2
		 * 리턴타입 : int
		 * 메서드명 : sum
		 */
	public static int sum (int num1, int num2){
		return num1+num2;
		
	}

}
