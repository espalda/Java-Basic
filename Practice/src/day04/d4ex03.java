package day04;

import java.util.Scanner;

public class d4ex03 {

	public static void main(String[] args) {
		//문제02 두 정수와 산술 연산자를 입력받아 연산 결과를 출력하는 코드
		//char op = scan.next().charAt(0); 문자열 하나를 입력 받는 scan 코드
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		char op = scan.next().charAt(0); 
		//방법01 switch문 이용
		//제한된 op값을 이용하므로 효율이 더 좋음
		switch (op){
		case '+' :
			System.out.println(num1 + num2); break;
		case '-' :
			System.out.println(num1 - num2); break;
		case '*' :
			System.out.println(num1 * num2); break;
			
		case '/' :
			switch(num2){
				case 0 :
					System.out.println("0으로 나눌수 없습니다"); break;
				default: System.out.println(num1 / num2);
			}
			break; //case문의 break
				
		case '%' :
			switch(num2){
				case 0 :
					System.out.println("0으로 나눌수 없습니다");
					break;
				default: System.out.println(num1 % num2);
			}
			break; //case문의 break
		default:
		System.out.println(op + "는 잘못된 연산자 입니다");break;}
	
		
		/*방법02 if문 이용
		
		if(op == '+'){
			System.out.println(num1 + num2);
		}
		else if(op == '-'){
			System.out.println(num1 - num2);
		}
		else if(op == '*'){
			System.out.println(num1 * num2);
		}
		else if(op == '/'){
			System.out.println((double)num1 / num2);
		}
		else{
			System.out.println(":-q 몰라요");
		}*/
		scan.close();

	}

}
