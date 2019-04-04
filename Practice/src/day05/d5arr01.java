package day05;

public class d5arr01 {

	public static void main(String[] args) {
		/* 배열 : 같은 의미를 가지는 같은 타입의 여러변수를 하나의 묶음으로 다루는 것
		 * 장점 : 물리적으로 연속된 공간으로 배열을 생성하기 때문에 접근이 빠르다
		 * 자료형 [] 배열이름; //배열 선언
		 * 배열이름 = new 자료형[배열의 크기]; //배열 생성
		 * 자료형 배열이름 []; //배열 선언
		 * 배열이름 = new 자료형[배열의 크기]; //배열 생성
		 * 자바의 배열은 모두 동적할당, 변경 가능
		 * 배열의 시작 번지는 0번지부터
		 * 배열의 마지막 번지는 (배열의 크기-1)번지 까지
		 * 배열은 주로 반복문과 사용
		 * 잘못된 번지로 접근하면 예외 발생
		 * ArrayIndexOutOfBoundsException
		 * 배열이름. length : 배열의 크기 알려줌
		 * 자료형 [] 배열이름 = new int[](값, 값2, 값3...};
		 * 자료형 [] 배열이름 = {값1, 값2, 값3...};
		 */
		int [] kor;
		kor = new int[10]; //int [] kor = new int [10];
		
		kor[0] = 10; //kor의 0번지에 10을 넣는다
		System.out.println(kor[0]);
		System.out.println(kor[9]);//초기값은 0으로 자동 초기화
		//System.out.println(kor[10]);
		//ArrayIndexOutOfBoundsException 잘못된 번지로 접근, 예외발생
		int i;
		for(i=0; i<kor.length; i++){//배열 이름.length는 배열의 크기를 알려줌
			System.out.println(i +"번지 : " + kor[i]);
		}
		/*Scanner scan = new Scanner(System.in);
		for(i=0 ; i<3 ; i++){
			kor[i] = scan.nextInt();
		}
		scan.close();*/
		int [] eng;
		eng = kor;
		for(i=0; i<eng.length; i++){
			System.out.println(i +"번지 : " + eng[i]);
		}
		eng[9] = 100;
		for(i=0; i<eng.length; i++){
			System.out.println(i +"번지 : " + kor[i]);
		}
		eng = new int[10]; //eng 배열 생성
		//kor 배열의 값을 eng 배열에 복사
		for(i=0; i<eng.length; i++){
			eng[i] = kor[i];
		}
	}

}
