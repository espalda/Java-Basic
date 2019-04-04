package day04;

public class d4ex07 {

	public static void main(String[] args) {
		//문제01 100이하의 소수를 모두 출력하는 코드 작성
		//소수 : 약수가 1과 그 자신밖에 없는 수

		int num;
		int i = 1, cnt = 0;
		for(num=1 ; num<=100 ; num++){
			for(i=1, cnt=0 ; i<=100 ; i++){
				if( num % i == 0){
					cnt++;
				}
			}
			if(cnt == 2){
				System.out.print(num + " ");
			}
			
		}
		System.out.println();
		
	}

}
