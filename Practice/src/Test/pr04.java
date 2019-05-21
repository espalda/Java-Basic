package Test;

public class pr04 {

	public static void main(String[] args) {
		// 산술연산자를 이용한 계산하는 예제를 메소드를 이용하여 작성
		// 메서드는 계산만 출력은 메인에서
		
		
	}
		
	public static double calc(int num1, int num2, char ch) throws Exception{
		
		
		double res = 0.0;
		switch(ch){
		case('+'): res = num1 + num2; break;
		case('-'): res = num1 - num2; break;
		case('*'): res = num1 * num2; break;
		case('/'): 
			if(num2 == 0) throw new Exception("잘못된 연산자 입니다.");
			res = num1 / num2; break;
		case('%'): 
			if(num2 == 0) throw new Exception("잘못된 연산자 입니다.");
			res = num1 % num2; break;
		default:
			throw new Exception("잘못된 연산자 입니다.");
		}
		return res;

		}
	}

	

	
	
