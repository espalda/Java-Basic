package day05;

import java.util.Scanner;

public class d5dowhile {

	public static void main(String[] args) {
		/* d5 do while문
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
		}while(menu != 5); /* 입력된 숫자 menu 가 5가 아니면 위에 코드를 실행하고 5일때 빠져나옴 */
		System.out.println("===== 메뉴2 시작 =====");
	
		int menu2;
		do {
			System.out.println("메뉴2");
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 종료");
			menu2 = scan.nextInt();
		}while(menu2 < 4); /* 입력된 숫자가 4보다 작을때 위의 코드를 실행하고 4이상일때 빠져나옴 */
		System.out.println("----- 메뉴2 종료 -----");
	scan.close();
	}
}
