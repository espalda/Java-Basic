package day20;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentmng smng = new Studentmng();
		/* Std std = new Std("나", "소리", "20190422","컴", 0.0);
		 * std.insertSubject(new grade("A+","세종","하늘",3));
		 * std.insertSubject(new grade("B","정조","하늘",2));
		 * System.out.println(std);
		 */
		
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		do{
			smng.printMenu();
			menu = scan.nextInt();
			Student std;	//스캐너를 통해 입력받을 객체 선언
			Student res;	//입력받은 결과 객체 선언
			int submenu;
			switch(menu){
			case 1: 
				std = smng.inputStd(scan);
				if(smng.insert(std))
					System.out.println("학생정보를 추가 했습니다");
				else
					System.out.println("이미 등록된 학번입니다");
				break;
				
			case 2:
				/* 메뉴 출력(2.1 학생정보 수정 or 2.2 과목등록)
				 * 메뉴 선택
				 * 선택된 메뉴에 따라 해당 기능 동작
				 */
				System.out.println("2-1. 학생정보수정");
				System.out.println("2-2. 학생 수강과목 등록");
				System.out.print("서브 메뉴를 선택하세요(1 or 2) : ");
				
				submenu = scan.nextInt();
				if(submenu == 1){
				std = smng.inputStd(scan); 

				if(smng.update(std))
					System.out.println("해당 학생정보를 수정 했습니다");
				else
					System.out.println("존재하지 않는 학번입니다");
				}else if(submenu == 2){

					std = smng.inputID(scan);
					res = smng.search(std);
					if(res == null){
						System.out.println("존재하지 않는 학번입니다");
						break;
					}
					Grade grade = smng.inputSubject(scan);
					res.insertSubject(grade);
					smng.update(res);
				}
				break;
				
			case 3:
				std = smng.inputID(scan);
				if(smng.delete(std))
					System.out.println("해당 학생정보를 삭제 했습니다");
				else
					System.out.println("존재하지 않는 학번입니다");
				break;
				
			case 4: 
				System.out.println("4.1 학생정보 전체 출력");
				System.out.println("4.2 학생 수강과목 전체 출력");
				System.out.print("서브 메뉴를 선택하세요(1 or 2) : ");
				submenu = scan.nextInt();
				if(submenu == 1) smng.print();
				else if(submenu == 2){
					std = smng.inputID(scan);
					res = smng.search(std);
					if(res == null)		System.out.println("해당 학번 학생이 없습니다"); //예외처리
					else if(!res.printSubjects())	System.out.println("수강한 강의가 없습니다");
				}
				break;
				
			case 5: break;
			default:
				System.out.println("┌ 잘못된 메뉴를 선택했습니다 ┘");
			}
			
		}while(menu != 5);
		scan.close();
	}

}
