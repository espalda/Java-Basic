package day04;

public class d4review1 {

	public static void main(String[] args) {
		//d4 복습
		//1부터 10까지 짝수의 합의 반복문
		//방법1
		int i, sum;
		for (i=1,sum=0 ; i<=10 ; i++){
			if(i % 2 == 0){
				sum += i;
				}
			}
		System.out.println("문제01 = " + sum);
		
		//방법2 2부터 10까지 2개씩 증가하면서 더한다
		for (i=2,sum=0 ; i<=10; i+=2){
			sum += i;
			}
		System.out.println("문제02 = " + sum);
		
		//방법3 1부터 5까지 하나씩 증가하면서 해당수에 2를 곱해 더한다
		for(i=1,sum=0 ; i<=5 ; i++){
			sum += i*2;
			}
		System.out.println("문제03 = " + sum);
		
		//방법4 continue 이용방법
		for(i=1 ; i<=100 ; i++){
			if(i % 2 == 1){
				continue;
			}
			System.out.println(i);
		}
			

	}

}
