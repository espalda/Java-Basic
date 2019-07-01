package day02;

import java.util.Scanner;

public class d2exam3 {

	public static void main(String[] args) {
		/* d2 조건문 if 학점
		 * 점수가 주어지면 점수에 맞는 학점을 출력하는 코드 작성
		 * 90점 이상 100점 이하 A
		 * 80점 이상 90점 미만 B
		 * 70점 이상 80점 미만 C
		 * 60점 이상 70점 미만 D
		 * 0점 이상 60점 미만 F
		 * 0점 미만, 100점 초과 잘못된 점수입니다
		 */
		
		Scanner scan = new Scanner(System.in);
		double score = scan.nextDouble();
		if (score <= 100 && score >= 90){
			System.out.println("A");
		}
		else if (score < 90 && score >= 80){
			System.out.println("B");
		}
		else if (score < 80 && score >= 70){
			System.out.println("C");
		}
		else if (score < 70  && score >= 60){
			System.out.println("D");
		}
		else if (score < 60 && score >= 0){
			System.out.println("F");
		}
		else{
			System.out.println("잘못된 점수입니다.");
		}
		
		//it (score < 0 || score > 100) or 연산자 사용
		//변수는 항상 좌측에 입력

		double score1 = scan.nextDouble();
		if ((int)score1 / 10 == 9 || score1 == 100){
			System.out.println("A");
		}
		else if ((int)score1 / 10 == 8){
			System.out.println("B");
		}
		else if (score1 < 80 && score1 >= 70){
			System.out.println("C");
		}
		else if (score1 < 70  && score1 >= 60){
			System.out.println("D");
		}
		else if (score1 < 60 && score1 >= 0){
			System.out.println("F");
		}
		else{
			System.out.println("잘못된 점수입니다.");
		}
		scan.close();
		
		
	}
}
