package day19;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentmng smng = new Studentmng();
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		do{
			smng.printMenu();
			menu = scan.nextInt();
			switch(menu){
			case 1: 
				Student s = smng.inputStd(scan);
				if(smng.insert(s))
					System.out.println("학생정보를 추가 했습니다");
				else
					System.out.println("이미 등록된 학번입니다");
				break;
			case 2:
				Student s2 = smng.inputStd(scan);
				if(smng.update(s2))
					System.out.println("해당 학생정보를 수정 했습니다");
				else
					System.out.println("존재하지 않는 학번입니다");
				break;
			case 3:
				Student s3 = smng.inputID(scan);
				if(smng.delete(s3))
					System.out.println("해당 학생정보를 삭제 했습니다");
				else
					System.out.println("존재하지 않는 학번입니다");
				break;
			case 4: 
				smng.print();
				break;
			case 5: break;
			default:
				System.out.println("┌");
				System.out.println("잘못된 메뉴를 선택했습니다");
				System.out.println("					┘");
			}
			
		}while(menu != 5);
		scan.close();
	}

}
