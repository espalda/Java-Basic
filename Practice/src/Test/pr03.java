package Test;

import java.util.Scanner;

public class pr03 {

	public static void main(String[] args) {
		// 산술연산자를 이용한 계산하는 예제를 메소드를 이용하여 작성
		// 메서드는 계산만 출력은 메인에서
		
		
		
		
		
	}
		
	public static void calc(int num1, int num2, int ch){
		Scanner scan = new Scanner(System.in);
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		ch = scan.next().charAt(0);
		double res = 0.0;
		switch(ch){
		case('+'): System.out.println(res = num1 + num2); break;
		case('-'): System.out.println(res = num1 - num2); break;
		case('*'): System.out.println(res = num1 * num2); break;
		case('/'): 
			if(num2 == 0 && ch == '/')
				System.out.println("0으로 나눌수 없습니다.");
				System.out.println(res = num1 / num2); break;
		case('%'): 
			if(num2 == 0 && ch == '%')
				System.out.println("0으로 나눌수 없습니다.");
				System.out.println(res = num1 % num2); break;
		
		default: System.out.println("잘못된 연산자 입니다.");
		
		}
	
	}
	
	
	

}
