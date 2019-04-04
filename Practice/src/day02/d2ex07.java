package day02;

import java.util.Scanner;

public class d2ex07 {

	public static void main(String[] args) {
		//01 com이 랜덤으로 가위 바위 보 중에서 하나 선택된 상태에서 (랜덤으로 수 만들기)
		//02 user가 가위 바위 보 중 하나를 선택하면
		//03 누가 이겼는지 확인하는 게임
		//랜덤으로 원하는 범위의 정수(a~b) 만들기
		//0*(b-a+1) + a <= math.random()*(b-a+1) + a < 1*(b-a+1) + a
		//a <= math.random()*(b-a+1) + a  < b+1
		//(int)(Math.random()*(max-min+1) + min)
		int min = 1;
		int max = 3;
		//01 min 에서 max 사이의 정수를 랜덤으로 생성하는 코드
		//com이 가위(1) 바위(2) 보(3) 중에서 랜덤으로 하나 선택
		int com = (int)(Math.random()*(max-min+1) + min);
		//02 가위 바위 보 선택
		int user = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 : >");
		user = scan.nextInt();
		switch(user-com){
		case 0:
			System.out.println("무승부입니다.");
			break;
		case -1:
		case 2:
			System.out.println("졌습니다.");
			break;
		case 1:
		case -2: //default:
			System.out.println("이겼습니다.");
			break;
			
		}
		System.out.println(com);
		
		scan.close();
		
		
	}

}
