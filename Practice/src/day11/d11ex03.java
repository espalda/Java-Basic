package day11;

public class d11ex03 {

	public static void main(String[] args) {
		// d11 예외 처리
		try {
			System.out.println(calc(1,0,'/'));
		} catch (Exception e) {
			//Exception e = new Exception("0으로 나눌수없습니다");
			e.printStackTrace();
		}finally {
			System.out.println("예외처리가 끝나면 무조건 실행되는 곳");
		}
	}
	public static double calc(int num1, int num2, char op)
		throws Exception //예외선언
		{
		double res= 0.0;
		if(op=='/' && num2==0){
			//throw new Exception("0으로 나눌 수 없습니다."); //new로 예외 객체를 생성하고 try catch로 예외를 처리한다
			Exception e = new Exception("0으로 나눌수 없습니다");
			throw e;
		}
		switch(op){
		case '+' : res = num1 + num2; break;
		case '-' : res = num1 - num2; break;
		case '*' : res = num1 * num2; break;
		case '/' : res = (double) num1 / num2; break;
		case '%' : res = num1 % num2; break;
		
		}
		return 0.0;
	}
	
}
