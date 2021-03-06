package day06;

public class d6method2 {

	public static void main(String[] args) {
		/* d6 메서드 최대공약수 최소공배수
		 * 메서드의 구현 위치는 클래스 안에 구현한다
		 * 다른 메소드 안에서 구현할 수 없다
		 * 메서드는 다른 메서드 안에서 호출 되어야 한다
		 * 메서드를 테스트하기 위해서는 main 메서드에서 호출해야한다
		 */
		int num1=10, num2=15;
		int gcdNum=1;
		gcdNum = gcd(num1,num2);
		
		System.out.println(num1+ "과 "+ num2+ "의 최대공약수 : "+ gcdNum);
		System.out.println(num1+ "과 "+ num2+ "의 최소공배수 : "+ lcm(num1,num2));
		}
	
		/* 기능 : 두 정수가 주어지면 두 정수의 최대공약수를 알려주는 메서드
		 * 매개변수 : 두정수 int num1, int num2
		 * 리턴타입 : 최대공약수 정수 int 
		 * 메소드명 : gcd
		 * public static 리턴타입 메소드명(매개변수)
		 */
		public static int gcd (int num1, int num2){
			int gcdNum = 1;
			for(int i=1; i<=num1; i++){
				if(num1%i == 0 && num2%i == 0){
					gcdNum = i;
				}
			}
			return gcdNum;
		}
		
		/* 기능 : 두 정수가 주어지면 두 정수의 최소공배수를 알려주는 메서드
		   		 최소공배수는 두 수의 곱에 최대공약수로 나눈 값이다
		 * 매개변수 : 두정수 int num1, int num2
		 * 리턴타입 : 최소공배수 정수 int 
		 * 메소드명 : lcm
		 */
		public static int lcm(int num1, int num2){
			return num1*num2/gcd(num1,num2);
			
	}
		
}
