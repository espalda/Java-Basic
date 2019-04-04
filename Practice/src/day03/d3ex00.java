package day03;

import java.util.Scanner;

public class d3ex00 {

	public static void main(String[] args) {
		 /* d3 소수 판별 문제
		  * 문제 01 정수를 입력받아 입력받은 정수가 소수인지 아닌지 판별하는 반복문 코드
		  * 소수 : 약수가 1과 자기자신만 있는 수 약수가 2개인 수
		  * 약수 : 자신보다 작거나 같은 수 중 나누어 나머지가 0인수 
		  * num : 정수
		  * i : 반복문에서 사용할 변수
		  * cnt : 약수의 갯수
		  * 반복횟수 : i는 1부터 num보다 작거나 같을 때까지 1씩 증가
		  */
		 
		int num, i, cnt;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		for (i=1, cnt=0; i<=num; i++){
			
			// i가 num의 약수이면 약수의 갯수를 하나 증가
			// num을 i로 나누었을 때 나머지가 0과 같다 = i가 num의 약수
			
			if(num % i == 0){
				cnt++; // cnt +=1;//++cnt;//cnt = cnt +1;
				}
			
		}
		// 반복문 종료 후 약수의 갯수가 2개이면 소수라고 출력
		if(cnt == 2){
				System.out.println(num+ "는 소수");
		}
		// 아니면 소수가 아님으로 출력 
		else{
			System.out.println(num+ "은 소수가 아님");
		}
	
		scan.close();
	
		
		
				
		
		
	}

}
