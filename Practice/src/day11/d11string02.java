package day11;

import java.util.Scanner;

public class d11string02 {

	public static void main(String[] args) {
		/* d11 String class
		 * 문자열을 입력하세요: 112233
		 * 교체될 문자열을 입력하세요: 11
		 * 교체할 문자열을 입력하세요: 00
		 * 교체 결과: 002233
		 */
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String before = scan.nextLine();
		String after = scan.nextLine();
		
		System.out.print("문자열을 입력하세요:");
		System.out.println(str);
		System.out.print("교체될 문자열을 입력하세요: ");
		System.out.println(before);
		System.out.print("교체할 문자열을 입력하세요: ");
		System.out.println(after);
		
		
		if(str.contains(before)){
			System.out.print("교체 결과: ");
			String res = str.replace (before, after);
			System.out.println(res);
		}else{
			System.out.println("교체될 문자열이 없습니다");
		}
		
		scan.close();

	}

}
