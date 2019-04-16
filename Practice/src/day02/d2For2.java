package day02;

public class d2for02 {

	public static void main(String[] args) {
		//d2 반복문 예제
		//1에서 10까지 합을 출력하는 반복문
		int i, sum;
		for (i=1,sum = 0 ; i<=10 ; i++){
			sum += i;
		}
			System.out.println("1부터 10까지의 합 :" + sum);
			
		//1에서 10까지 숫자중 짝수인 수의 합을 출력하는 반복문	
		//방법1
		for (i=1,sum=0 ; i<=10 ; i++){
			if(i % 2 == 0){
				sum += i;
				}
			}
		System.out.println("방법1: " + sum);
		
		//방법2
		for (i=2,sum=0 ; i<=10; i+=2){
			sum += i;
			}
		System.out.println("방법2: " + sum);
		
		//방법3
		for(i=1,sum=0 ; i<=5 ; i++){
			sum += i*2;
			}
		System.out.println("방법3: " + sum);
		
		
	}

}
