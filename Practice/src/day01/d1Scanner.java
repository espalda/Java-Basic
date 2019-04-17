package day01;

import java.util.Scanner;

public class d1Scanner {

	public static void main(String[] args) {
		/* d1 Scanner
		 * Scanner scan = new Scanner(system.in);
		 * 자료형 변수명 = scan.next자료형();
		 * scan.close();
		 */
		
		//콘솔에서 입력받은 숫자가 1보다 크거나 같고 100보다 작거나 같은지 출력
		Scanner scan = new Scanner(System.in);
		
		char ch = scan.next().charAt(0);
		String str = scan.nextLine();
		int num = scan.nextInt();
		
		//방법1
		System.out.println(num >=1 && num <=100);
		
		//방법2
		boolean isScore = false;
		isScore = num >= 1 && num <= 100;
		System.out.println(isScore);

		//콘솔에서 입력받은 숫자의 산술연산 결과 출력
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
