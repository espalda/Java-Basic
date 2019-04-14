package day11;

import java.util.Scanner;

public class d11str01 {

	public static void main(String[] args) {
		/* d11 string class의 생성자와 메서드
		 * 문자열을 입력하세요: Hello world		 
		 * 찾을 문자열을 입력하세요: He
		 * Hello world에는 He가 있습니다
		 */
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String search = scan.nextLine();
		
		System.out.print("문자열을 입력하세요:");
		System.out.println(str);
		System.out.print("찾을 문자열을 입력하세요: ");
		System.out.println(search);
		
		if(str.indexOf(search)>=0) System.out.println(str+"에는 "+ search+"가 있습니다"); //indexOf 사용
		if(str.contains(search))System.out.println(str+"에는 "+ search+"가 있습니다"); //contains 사용
		else System.out.println(str+"에는 "+ search+"가 없습니다");
		
		scan.close();
		

	}

}