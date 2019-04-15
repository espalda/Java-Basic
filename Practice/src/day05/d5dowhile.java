package day05;

import java.util.Scanner;

public class d5dowhile {

	public static void main(String[] args) {
		/* d5 Do while문
		 * for,while : 조건식에 따라 한번도 실행되지 않을 수 있다.
		 * do while : 조건식에 따라 최소한 1번은 실행

		 * do{
		 * 		실행문;
		 * }while(조건식);
		 */
		
		int menu;
		Scanner scan = new Scanner(System.in);
		do{ 
			System.out.println("메뉴");
			System.out.println("1.학생정보 추가");
			System.out.println("2.학생정보 수정");
			System.out.println("3.학생정보 삭제");
			System.out.println("4.학생정보 확인");
			System.out.println("5.종료");
			System.out.print("메뉴를 선책하세요 : ");
			menu = scan.nextInt();
		}while(menu != 5);
		scan.close();
	}

}
