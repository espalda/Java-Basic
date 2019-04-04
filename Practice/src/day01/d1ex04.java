package day01;

import java.util.Scanner;

public class d1ex04 {

	public static void main(String[] args) {
		/* d1 화면에서 입력받기
		 * Scanner scan = new Scanner(system.in);
		 * 자료형 변수명 = scan.next자료형();
		 * scan.close();
		 */
		
		//문제01 콘솔에서 입력받은 숫자가 1보다 크거나 같고 100보다 작거나 같은지 출력
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		//- 방법01
		System.out.println(num >=1 && num <=100);
		
		//- 방법02
		boolean isScore = false;
		isScore = num >= 1 && num <= 100;
		System.out.println(isScore);

		//문제02 콘솔에서 입력받은 숫자의 산술연산 결과 출력
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
			System.out.println(num1 + num2);
			System.out.println(num1 - num2);
			System.out.println(num1 * num2);
			System.out.println((float)num1 / num2);
			System.out.println(num1 % num2);
		scan.close();
	}
	

}
