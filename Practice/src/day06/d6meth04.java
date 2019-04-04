package day06;

public class d6meth04 {

	public static void main(String[] args) {
		
		int num1=7, num2=3;
		if(isCoPrime(num1, num2)){
			System.out.println("두 수는 서로소");
		}else{
			System.out.println("두 수는 서로소가 아님");
		}
	}
	
		public static int gcd (int num1, int num2){
			int gcdNum = 1;
			for(int i=1; i<=num1; i++){
				if(num1 % i == 0 && num2 % i == 0){
					gcdNum = i;
				}
			}
			return gcdNum;
		}
		/* 기능 : 주어진 두 정수가 주어지면 서로소인지 아닌지를 참 또는 거짓으로 알려주는 메소드
		 * 매개변수 : 정수 int num1, int num2
		 * 리턴타입 : 참 또는 거짓  boolean
		 * 메소드명 : isCoPrime
		 */
		public static boolean isCoPrime(int num1, int num2){
			if(gcd(num1, num2) == 1)
				return true; // 실행문이 한줄이면 중괄호 생략 가능
			else
				return false;
			
			
			
		}
		
		
}
