package coding1;

public class q0122 {

	public static void main(String[] args) {
		/*
		문제 설명
		정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
		제한 사항
		n은 0 이상 3000이하인 정수입니다.
		입출력 예
		n	return
		12	28
		5	6
		*/
		solution(12);
	}
	 public static int solution(int n) {
		 int res = 0;
		 if(n>=0 && n<=3000) {
			 for(int i=1; i<=n; i++) {
				 if(n%i == 0) {
					 res = res+i;
				 }
			 }System.out.println(res);
		 }
		return res;

	 }
}