package coding1;

public class test3 {
	/*문제 설명
	두 정수 a,b가 주어졌을 때 a와 b사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
	예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

	제한 조건
	a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
	a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
	a와 b의 대소관계는 정해져있지 않습니다.*/
	public static void main(String[] args) {
		solution(3,5);
		solution(3,3);
		solution(5,3);
	}
	
	// 예 a=1이고 b=3 이면 answer= 1+2+3 = 6
	// a>b 클 때 3>1
	// b 부터 a 까지 증가 하는 반복문
	 public static long solution(int a, int b) {
	      long answer = 0;
	      //a,b 의 범위 설정 하는법
	      if(a > b) {
	    	  for(int i=b; i<=a; i++) {
		    	answer += i;
		      }
	    	  System.out.println("a > b = " + answer);
	      }else if (a < b){
	    	  for(int i=a; i<=b; i++) {
			    	answer += i;
		      }
	    	  System.out.println("a < b = " + answer);
	      }else {
	    	  System.out.println("a = b " + a);
	      }
	      return answer;
	  }
	 
	
}
