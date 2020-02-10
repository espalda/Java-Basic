package coding1;

public class q0205 {

	public static void main(String[] args) {	
		/*
		문제 설명
		정수 num이 짝수일 경우 Even을 반환하고 홀수인 경우 Odd를 반환하는 함수, solution을 완성해주세요.
		
		제한 조건
		num은 int 범위의 정수입니다.
		0은 짝수입니다.
		
		입출력 예
		num	return
		3	Odd
		4	Even
		 */
		solution(1);
	}
	public static void solution(int num) {
	      String answer = "";
	      if(num%2 == 0) {
	    	  System.out.println("EVEN");  
	      }else {
	    	  System.out.println("ODD");
	      }
	  }

}
