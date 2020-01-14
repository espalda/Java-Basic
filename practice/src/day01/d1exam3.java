package day01;

public class d1exam3 {

	public static void main(String[] args) {
		/*
		 d1 연산자 operator
		 연산 = 데이터를 처리하여 결과를 산출하는 것
		 연산자 = 연산에 사용되는 표시나 기호
		 피연산자 = 연산 대상이 되는 데이터(리터럴, 변수)
		 
		 산술 : + - * / %, 나누기와 모드는 0으로 나눌수 없다
		 비교 : > >= < <= == != 크기비교, 조건식 (== 와 = 는 다름)
		 논리 : && ~하고, || ~하거나, !아니다 진리표, 조건식
		 대입 : = 을 기준으로 좌측에 변수명 1개만 와야한다
		 증감 : 하나씩 증가 ++, 하나씩 감소--
		 조건 : 연산자 위치에 따라 동작방식이 다르다 */
		
		System.out.println(1 < 2);
		System.out.println(1 > 2);
		System.out.println(1 <= 2);
		System.out.println(1 >= 2);
		System.out.println(1 == 2);
		System.out.println(1 != 2);
		
		int num1 = 7;
		int num2 = 9;
		System.out.println(num1 & num2);
		System.out.println(num1 /(double) num2);
		System.out.println(num1 == num2);
		/* 증감 연산자
		 * 증가 : 하나씩 증가 ++
		 * 감소 : 하나씩 감소 --
		 * 전위형 : 증감을 하고 동작을 한다 ++num
		 * 후위형 : 동작을 하고 증감을 한다 num++ */
		
		int i = 10;
		System.out.println("후위형 진행 : "+ i++);
		System.out.println("후위형 결과 : "+ i);
		
		int j = 10;
		System.out.println("전위형 진행 : "+ ++j);
		System.out.println("전위형 결과 : "+ j);
		
	

	}

}
