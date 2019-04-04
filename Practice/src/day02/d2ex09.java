package day02;

public class d2ex09 {

	public static void main(String[] args) {
		// 문제 : 1에서 10까지 합을 출력하는 반복문
		int i, sum;
		for (i=1,sum = 0 ; i<=10 ; i++){
			sum = sum + i;
			//sum += i;
		}
			System.out.println("1부터 10까지의 합 :" + sum);
			
		// 문제 : 1에서 10까지 숫자중 짝수인 수의 합을 출력하는 반복문	
		// 방법1
		// 1부터 10까지 하나씩 증가하면서 짝수이면 더한다.
		for (i=1,sum=0 ; i<=10 ; i++){
			if(i % 2 == 0){
				sum += i;
				}
			}
		System.out.println("문제01 = " + sum);
		
		// 방법2 
		// 2부터 10까지 2개씩 증가하면서 더한다.
		for (i=2,sum=0 ; i<=10; i+=2){
			sum += i;
			}
		System.out.println("문제02 = " + sum);
		
		// 방법3
		// 1부터 5까지 하나씩 증가하면서 해당수에 2를 곱해 더한다.
		for(i=1,sum=0 ; i<=5 ; i++){
			sum += i*2;
			}
		System.out.println("문제03 = " + sum);
		
		
	}

}
