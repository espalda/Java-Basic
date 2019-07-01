package day14;

public class d14review {

	public static void main(String[] args) {
		//d14 복습 예외 발생
		int num = 0;
		try{
			num = 1/0;
		}catch(ArithmeticException e){
			System.out.println("계산 관련 예외");
			e.printStackTrace();
		}
		catch(Exception e){ //항상 마지막에 있어야 함, 마지막에 모든 예외처리를 하기 때문에
			System.out.println("예외 발생");
			e.printStackTrace(); //프로그램이 정상적으로 완료되면서 에러원인을 알수있음
		}
		System.out.println(num);
		System.out.println(1.0/0.0);
		try {
			System.out.println(calc(1.0,0.0,'?'));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
		
	public static double calc(double num1, double num2, char op)
			//throw 교재에 예외를 발생시킨다 <=== 무슨말인가
			throws Exception, ArithmeticException{
			double res = 0.0;
			if((op == '/' || op == '%')&& num2 == 0.0)
				throw new ArithmeticException("0으로 나눌 수 없습니다");
				switch (op){
				case '+': res=num1+num2; break;
				case '-': res=num1-num2; break;
				case '*': res=num1*num2; break;
				case '/': res=num1/num2; break;
				case '%': res=num1%num2; break;
				default : 
					throw new Exception("잘못된 연산자입니다");
				}
			
			return res;
		}
}
