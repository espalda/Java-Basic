package day01;

public class d1exam4 {

	public static void main(String[] args) {
		/* d1 형변환 casting
		 * 묵시적, 자동 형변환 : 데이터 손실이 없다
		 * 명시적 형변환 : 데이터 손실이 발생할수도 있다 */
		
		//10을 3으로 나눈 결과 출력
 		int num = 10;
 		int num5 = 3;
 		System.out.println((double) num / num5);

		System.out.println((double) 10 / 3);
		
		double res;
		res = num / (double) num5;
		System.out.println(res);
		
		/* 실수 + 정수 = 실수
		 * 정수 / 정수 = 정수
		 * 실수로 나누면 전부 결과값이 전부 실수로 출력 */
		int num1 = 1 + 2;
		int num2 = 1 - 2;
		int num3 = 1 * 2;
		double num4 = 1 / 2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println((char)('A'+1));
		char ch  = 'A'+1;
		System.out.println(ch);
		char ch2 = (char)(ch + 1);
		System.out.println(ch2);
		
		
		int x = 50000;
		long y = x;	//형변환
		
		//long type을 int 에다 담으려고 하면 데이터 크기가 다르기 때문에 컴파일러 에러가 발생
		//큰것을 작은것으로 명시적 강제 형변환
		long x2 = 5;
		int y2 = (int) x2;
	}

}
