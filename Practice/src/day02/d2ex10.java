package day02;

public class d2ex10 {

	public static void main(String[] args) {
		// 문제01 구구단의 7단을 출력하는 코드의 반복문
		int i ;
		int sum ;
		for (i=1,sum=0 ; i <= 5 ; i++){
			sum = 7 * i;
			System.out.println("7 x " + i + " = " + sum);
			//i + "x" + i, i값 7로 저장후에 사용	
		}

	}

}
