package day05;

public class d5ex07 {

	public static void main(String[] args) {
		/* d5 변수의 유효범위
		 * 일반 변수는 선언되면 해당 변수를 감싸고 있는 괄호안에서 유효하다
		 * i를 반복문에서만 사용할 경우
		 */
		
		for(int i = 0 ; i<10 ; i++){
			System.out.println(i);
		}
		for (int i = 0 ; i<5 ; i++){
			System.out.println(i);
		}
		
		
	}

}
