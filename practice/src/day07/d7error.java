package day07;

public class d7error {

	public static void main(String[] args) {
			int num;
		/* d7 에러 발생 코드
		 * 에러 내용 : The local variable XXX may not have been initialized
		 * 에러 원인 : 지역 변수를 초기화 하지 않고 사용하는 경우
		 * 해결 방법 : 지역 변수를 초기화 한다
		 */
			//int num;
			//System.out.println(num);
		
		/* 에러 내용 : XXX num2 cannot be resolved to a variable
		 * 에러 원인 : 변수를 선언하지 않고 사용한 경우
		 * 해결 방법 : 변수를 선언한다
		 */
			//System.out.println(num2);
		
		/* 에러 내용 : ArithmeticException
		 * 에러 원인 : 0으로 나누었을 경우
		 * 해결 방법 : 0으로 나누는 상황을 피한다
		 */
			try{
				num = 1/0;
			}catch(ArithmeticException e){
				System.out.println("계산 도중에 발생한 에러");
				e.printStackTrace();
			}
			
		/* 에러 내용 : ArrayIndexOutOfBoundsException
		 * 에러 원인 : 배열에 유효하지 않는 번지로 접근하는 경우
		 * 해결 방법 : 배열의 유효한 번지로 접근한다
		 */
			try{
				int arr [] = new int [5];
				arr[5] = 1;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("배열에 잘못된 번지를 넣었을때 발생한 에러");
				e.printStackTrace();
			}
			
		/* 에러 내용 : Syntax error, insert "}" to complete ClassBody
		 * 에러 원인 : 괄호 실수
		 * 해결 방법 : 괄호의 짝을 맞춘다
		 */
			//for(int i=0; i<5; i++){
			
	}

}
