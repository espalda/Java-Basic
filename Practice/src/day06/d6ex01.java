package day06;

public class d6ex01 {

	public static void main(String[] args) {
		/* d6 메서드 정의 선언
		 * 메서드 : 하나의 특정 작업을 수행하는 하도록 작성된 코드
		 * 기능 : 두 정수의 합을 알려주는 메소드
		 * 매개변수 : 기능을 실행할 때 필요한 정보, 두 정수 int num1, int num2
		 * 리턴타입 : 기능이 종료되고 알려주는 정보, 출력과 동작은 다른 의미, 자료형
		 * 			기능을 상세히 썼을 때 알려준다, 전달한다 일때 필요
		 * 			부연설명이 없으면 리턴타입이 필요없다
		 * 메서드명 : 기능을 잘 표현할 수 있는 이름
		 * 
		 * 메소드 선언 방법
		 * 출력 이름(입력){
		 * 		구현;
		 * }
		 * 리턴타입 메소드명(매개변수){
		 * 		구현;
		 * }
		 * */
		
			//sum()메소드가 printSum()메소드 보다 재사용성이 높다
			System.out.println(sum(1,2));
			printSum(1,2);
			
		}
		public static int sum(int num1, int num2){
		 	int res = num1 + num2;
		 	return res;
		 }
		/* 기능 : 두 수의 합을 콘솔에 출력하는 기능
		 * 매개변수 : 두 정수 int num1, num2
		 * 리턴타입 : 없다 void
		 * 메서드명 : printSum
		 */
		public static void printSum(int num1, int num2){
			System.out.println(num1+num2);
		}
		
}