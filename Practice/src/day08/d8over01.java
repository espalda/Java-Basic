package day08;

public class d8over01 {

	public static void main(String[] args) {
		/* d8 메서드 오버로딩 조건
		 * 한 클래스안에서 메소드명이 동일한 메서드가 여러개일 경우
		 * 1. 매개변수의 갯수가 다르다
		 * 2. 매개변수의 갯수가 같지만 자료형이 다르다
		 */
		System.out.println(sum(1,2));
		System.out.println(sum(1.2, 1.2));
		System.out.println(sum(1,2,3));

	}
		/* 기능 : 두 정수의 합을 알려주는 기능
		 * 매개변수 : 두 정수 int num1, int num2 
		 * 리턴타입 : 합의 결과 int
		 * 매서드명 : sum 
		 */
	
		public static int sum (int num1, int num2){
			return num1+num2;
		}
		/*
		 * 기능 : 두 실수의 합을 알려주는 기능
		 * 매개변수 : 두 실수 double num1, double num2
		 * 리턴타입 : 합의 결과 double
		 * 매서드명 : sum
		 */
		public static double sum (double num1, double num2){
			return num1+num2;
		}
		/* 기능 : 세 정수의 합을 알려주는 기능
		 * 매개변수 : 세 정수 int num1, int num2, int num2
		 * 리턴타입 : int
		 * 매서드명 : sum
		 */
		public static int sum (int num1, int num2, int num3){
			return num1+num2+num3;
		}
}
