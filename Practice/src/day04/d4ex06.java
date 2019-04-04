package day04;

public class d4ex06 {

	public static void main(String[] args) {
		//1에서 100까지 짝수만 출력하는 코드 작성
		//1부터 100까지 증가하는 i
		//짝수는 2로 나누었을때 나머지가 0
		//방법01 조건문 이용
		int i = 1;
		for(i=1 ; i<=100 ; i++){
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
		
		//방법02 수학적 방법
		for(i=2 ; i<=100 ; i+=2){
			System.out.println(i);
		}
			
		//방법03 수학적 방법
		for(i=1 ; i<=50 ; i++){
			System.out.println(i * 2);
		}
		
		//방법04 continue 이용방법
		for(i=1 ; i<=100 ; i++){
			if(i % 2 == 1){
				continue;
			}
			System.out.println(i);
		}
	}

}
