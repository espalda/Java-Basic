package day04;

public class d4ex05 {

	public static void main(String[] args) {
		// 문제 : 1부터 100이하의 소수를 모두 출력하는 코드 작성
		// 소수 : 약수가 1과 그 자신밖에 없는 수
		
		int num = 1, i, cnt;
		for (i=1, cnt=0; i<=num; i++){
			if(num % i == 0){
				cnt++;
				}
		}
		if(cnt == 2){ // 반복문 종료 후 약수의 갯수가 2개이면 소수라고 출력
				System.out.println(num+ "는 소수");
		}
		
		
	}

}
