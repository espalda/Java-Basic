package day06;

public class d6meth05 {

	public static void main(String[] args) {
		/* d6 메서드 산술연산
		 * 두 정수와 산술 연산자가 주어졌을때 연산결과를 알려주는 메서드 작성
		 * 매개변수 : 두 정수와 산술 연산자
		 			int num1, int num2, char op
		 * 리턴타입 : double
		 * 메소드명 : calc
		 */
			double res = calc(1,0,'/');
			System.out.println(res);
	}
	
 		public static double calc(int num1, int num2, char op){
 			double res = 0.0;
 				switch (op){
 				case '+': res=num1+num2; break;
 				case '-': res=num1-num2; break;
 				case '*': res=num1*num2; break;
 				case '/':
 					if(num1 == 0 || num2 == 0){
 					   System.out.println("불가"); 
 					}
 					res=(double)num1/num2; break;
 				case '%': res=num1%num2; break;
 				default :
 					System.out.println("잘못된 연산자");
 				}
 			
 			return res;
 		}
 			
 		
}

