package day02;

import java.util.Scanner;

public class d2switch1 {

	public static void main(String[] args) {
		/* d2 조건문 switch
		 * 변수 또는 식의 값 중에서 처리하는 값이 제한적일 때
		 * case값으로 들어갈수 있는 자료형은 정수,문자,문자열
		 * case의 값은 상수(변하지 않는 고정된 값)만 가능
		 
		 * 달이 입력되면 해당하는 달의 마지막 일수를 출력하는 코드를 switch case문으로 작성
		 * 31일까지 1 3 5 7 8 10 12
		 * 30일까지 4 6 9 11
		 * 28일까지 2
		 */

		//방법1
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		switch (num){
		case 1:System.out.println("31");break;
		case 3:System.out.println("31");break;
		case 5:System.out.println("31");break;
		case 7:System.out.println("31");break;
		case 8:System.out.println("31");break;
		case 10:System.out.println("31");break;
		case 12:System.out.println("31");break;
		
		case 2:System.out.println("28");break;
		
		case 4:System.out.println("30");break;
		case 6:System.out.println("30");break;
		case 9:System.out.println("30");break;
		case 11:System.out.println("30");break;
		
		default:
			System.out.println("잘못된 입력입니다.");
		}
		scan.close();
		
		//방법2
		switch(num){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31");break;
		
		case 2:
			System.out.println("28");break;
		
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30");break;
		}
		//if(month == 1 || month == 3 || month == 5 ||...)
		

	}

}
