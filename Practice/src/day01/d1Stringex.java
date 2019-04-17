package day01;

public class d1Stringex {

	public static void main(String[] args) {
		//d1 String 예제
		String name = "JA" + "VA";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + ""); //결과값 14
		System.out.println("" + 7 + 7); //결과값 77, 앞에 문자열이 있으면 문자열 + 숫자 = 문자
		System.out.println("" + (7 + 7)); //소괄호 우선


	}

}
