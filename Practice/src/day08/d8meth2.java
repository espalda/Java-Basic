package day08;

public class d8meth2 {

	public static void main(String[] args) {
		//d8 메서드 산술연산
		System.out.println(calc(22,0,'/'));
	}	
		/* 기능 : 두정수의 산술 연산 결과를 알려주는 메서드
		 * 매개변수 : int num1, int num2, char op
		 * 리턴타입 : 산술연산의 결과 res = double
		 * 메소드명 : calc
		 */
	public static double calc (int num1, int num2, char op){
		double res = 0.0;
			switch (op){
			case '+' : res = num1+num2; break;
			//case '+' : return num1+num2;
			case '-' : res = num1-num2; break;
			case '*' : res = num1*num2; break;
			case '/' : 
					if(num2 == 0){
					   System.out.println("불가");break;			
					 }
					res = (double)num1/num2; break;
			case '%' : res = num1%num2; break;
			default :
				System.out.println("잘못된 연산자");
			}
			return res;
	}

}
