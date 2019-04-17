package day13;

import java.util.Scanner;

import day12.Student;
import day12.StudentManager;

public class StudentScan {

	public static void main(String[] args) {
		//d13 스캐너 Student manager
		StudentManager mng = new StudentManager();
		int menu=0;
		Scanner scan = new Scanner(System.in);
		do{
			mng.printMenu();
			menu = scan.nextInt();
			Student s;
			if(menu == 1){
				System.out.println("[추가할 학생 정보를 입력하세요]");
				s = mng.inputStudent(scan);
				mng.insert(s);
				
			}else if(menu == 2){
				System.out.println("[수정할 학생 정보를 입력하세요]");
				s = mng.inputStudent(scan);
				mng.modify(s);
				
			}else if(menu == 3){
				System.out.println("[삭제할 학생 정보를 입력하세요]");
				s = mng.inputSearchStudent(scan);
				mng.delete(s);

			}else if(menu == 4){
				System.out.println("[--- 학생 정보 ---]");
				mng.print();
				
			}else if(menu == 5){
				System.out.println("[종료]");
			}else{
				System.out.println("[잘못된 입력 입니다]");
			}

		}while(menu != 5);
		/* for문
		 * for( ; menu !=5 ;){}
		 * while문
		 * while(menu != 5){}
		 */
		
		scan.close();

	}
		
		
}
