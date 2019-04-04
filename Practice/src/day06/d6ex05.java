package day06;

public class d6ex05 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자가 주어졌을때 연산결과를 알려주는 메서드 작성
		 * 매개변수 : 두 정수와 산술 연산자
		 			int num1, int num2, char op
		 * 리턴타입 : double
		 * 메소드명 : calc
		 */
			
			double res = calc(1,2,'+');
			System.out.println(res);
		
	}
	
 		public static double calc(int num1, int num2, char op){
 			double res = 0.0;
 				switch (op){
 				case '+' :
 					res = num1 + num2; break;
 				case '-' :
 					res = num1 - num2; break;
 				case '*' :
 					res = num1 * num2; break;
 				case '/' :
 					res = num1 /(double)num2; break;
 				case '%' :
 					res = num1 % num2; break;
 				}
 			
 			return res;
 		}
 			
 			
}
 		 
	
		
		 
		
	


