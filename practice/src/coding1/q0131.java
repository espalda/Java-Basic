package coding1;

public class q0131 {

	public static void main(String[] args) {
		/*
		문제 설명
		1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
		소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
		(1은 소수가 아닙니다.)
		제한 조건
		n은 2이상 1000000이하의 자연수입니다.
		입출력 예
		n	result
		10	4
		5	3
		입출력 예 설명
		입출력 예 #1
		1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환
		
		입출력 예 #2
		1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
		*/
		solution(5);
	}
	public static int solution(int n){
		//소수 갯수 구하기
		int cnt = 0;
		int total = 0;
		for(int prime=2; prime<=n; prime++){
		    for(int i=2; i<=prime; i++){
		    	if(prime%i == 0){
		    		cnt++;
		    	}
		    }
		    if(cnt == 1){
		    	total ++;
		    }
		    System.out.println(prime + "은 소수입니다.");
		    System.out.println("소수의 개수는 "+ total +"입니다.");
		}
		return n;
	}
	
	public static int prime(int n) {
		//소수구하기
		int cnt = 0;
	    for(int i=2; i<=n; i++){
	    	if(n%i == 0){
	    		cnt++;
	    	}
	    }
	    if(cnt == 1){
	    	System.out.println(n+"은 소수입니다.");
	    }else{
	    	System.out.println(n+"은 소수가 아닙니다.");
	    }
		return 0;	  
	}
}
