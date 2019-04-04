package day04;

public class d4ex01 {

	public static void main(String[] args) {
			//복습
			//문제01 1부터 10까지 짝수의 합의 반복문
			int i, sum;
			for (i=1,sum=0 ; i<=10 ; i++){
				if(i % 2 == 0){
					sum += i;
					}
				}
			System.out.println("문제01 = " + sum);
			
			//문제02 2부터 10까지 2개씩 증가하면서 더한다
			for (i=2,sum=0 ; i<=10; i+=2){
				sum += i;
				}
			System.out.println("문제02 = " + sum);
			
			//문제03 1부터 5까지 하나씩 증가하면서 해당수에 2를 곱해 더한다
			for(i=1,sum=0 ; i<=5 ; i++){
				sum += i*2;
				}
			System.out.println("문제03 = " + sum);
				

	}

}
