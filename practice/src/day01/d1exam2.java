package day01;

public class d1exam2 {

	public static void main(String[] args) {
		/* 
		 d1 자료형 data type
		 변수 : 값을 저장할수 있는 메모리상의 공간, 단 하나의 값만 저장
		 변수의 초기화 : 변수를 사용하기 전에 처음으로 값을 저장하는 것
		
		 논리형 boolean 1byte
		 문자형 char 2byte  작은따옴표를 이용하여 한 글자를 표현
		 정수형 byte(1), short(2), int(4), long(8)
		 실수형 float(4), double(8)
		 float 유효숫자는 7자리까지
		 double 유효숫자는 15자리까지 */
	
		int num = 0;
		char ch = 'A';
		long num2 = 123l;	//뒤에 소문자 l이나 대문자 L을 적어야 한다 
		float num3 = 1.123f;	//실수 뒤에 소문자 f나 대문자 F를 붙여야 한다
		double num4 = 1.1234d;
		
		System.out.println(num);
		System.out.println(ch);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		int i = 20;
		boolean isEven=i % 2 == 0 ? true : false;
		System.out.println(i + "은 짝수? " + isEven);
		
	}

}
