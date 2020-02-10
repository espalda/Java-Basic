package coding2;

public class q0205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		문제 설명
		양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
		예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 
		자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
		
		제한 조건
		x는 1 이상, 10000 이하인 정수입니다.
		
		입출력 예
		arr	return
		10	true
		12	true
		11	false
		13	false
		
		입출력 예 설명
		입출력 예 #1
		10의 모든 자릿수의 합은 1입니다. 10은 1로 나누어 떨어지므로 10은 하샤드 수입니다.
		
		입출력 예 #2
		12의 모든 자릿수의 합은 3입니다. 12는 3으로 나누어 떨어지므로 12는 하샤드 수입니다.
		
		입출력 예 #3
		11의 모든 자릿수의 합은 2입니다. 11은 2로 나누어 떨어지지 않으므로 11는 하샤드 수가 아닙니다.
		
		입출력 예 #4
		13의 모든 자릿수의 합은 4입니다. 13은 4로 나누어 떨어지지 않으므로 13은 하샤드 수가 아닙니다.
		 */
		
		solution(12);
		solution(13);
	}
		//정수 num
		//정수 sum = 정수 x의 10의 자리 숫자와 1의 자리 수의 합
		//정수 res = num을 sum으로 나눈 값
		//bool = 나머지가 0이며 true이면서 하샤드의 값 아니면 false
	public static void solution(int num) {
		int once = num;
		int rr = nump(num);
	      int res = once % rr;
	      if(res == 0) {
	    	  System.out.println(once +"은 "+ rr +"으로 나누어 떨어지므로 " + once + "은 하샤드 수 입니다.");
	      }else {
	    	  System.out.println(once +"은 "+ rr +"으로 나누어 떨어지지 않으므로 " + once + "은 하샤드 수가 아닙니다.");
	      }
	}
	
	//각 자리수의 합을 구하는 메서드 생성
	public static int nump(int num) {
		int sum = 0;
		while(num!=0) {	//각 자리수의 합구하기
            sum = sum + num % 10;	//num을 10으로 나눈 나머지를 sum에 더한다.
            num = num / 10;			//num을 10으로 나눈 값을 다시 num에 저장한다.
		}
		return sum;	
	}
}
