package day11;

public class d11trycatch2 {

	public static void main(String[] args) {
		/* d11 예외처리 exception
		 * 예외처리를 함으로써 프로그램이 중단되는것을 막을수 있고, 어디서 중단됬는지 알수있다
		 * throw 메서드에서 예외가 발생했을때 안에서 처리하지 않고 밖에서 처리하도록 하기 위해 사용
		 * 예외가 발생하면  throw new 예외객체(); 를 통해 예외를 던져준다
		 * throw가 있는 메서드는 메서드 선언부에  throws를 통해 어떠한 예외가 발생할 수 있는지 명시해주어야 한다
		 * 다만 RuntimeException 예외 클래스들은 명시하지 않아도 된다
		 */ 
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
			//throw new Exception("0으로 나눌 수 없습니다.");
			//new로 예외 객체를 생성하고 try catch로 예외를 처리한다
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
