package day01;

public class d1ex01 {

	public static void main(String[] args) {
		/* d1 자료형 변수명
		 * 변수 : 값을 저장할수 있는 메모리상의 공간, 단 하나의 값만 저장
		 * 변수의 초기화 : 변수를 사용하기 전에 처음으로 값을 저장하는 것
		
		 * 논리형 boolean
		 * 문자형 char
		 * 정수형 byte, short, int, long
		 * 실수형 float, double

		 * byte = 1byte
		 * short, char = 2byte
		 * int = 4byte
		 * long = 8byte
		 * float = 4byte 유효숫자는 7자리까지
		 * double = 8byte 유효숫자는 15자리까지
		 */
	
		int num = 0;
		char ch = 'A';
		long num2 = 123l;
		float num3 = 1.123f;	//float은 f가 필수
		double num4 = 1.1234d;
		
		System.out.println(num);
		System.out.println(ch);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

		int i = 20;
		boolean isEven = i % 2 == 0 ? true:false;
		System.out.println(i + "은 짝수? " + isEven);
		
	}

}
