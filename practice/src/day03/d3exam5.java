package day03;

public class d3exam5 {

	public static void main(String[] args) {
		//d3 반복문 구구단
		//구구단 7단을 출력하는 반복 코드
		int i, sum;
			 for (i=1, sum=0 ; i<=9 ; i++){
				 sum = 7 * i;
				 System.out.println("7 X " + i + " = " + sum);
		}
		
		//구구단 7단을 출력하는 반복 코드
		int num = 3;
		int res = 0;
			for (i=1 ; i<=9 ; i++){
			res = num * i;
			System.out.println(num + " x " + i + " = " + res);
		}
		
		//구구단 전체 나오는 방법	
		for(num=2; num<=9; num++){
			System.out.println(num + " 단");
			for (i=1 ; i<=9 ; i++){
				res = num * i;
				System.out.println(num + " x " + i + " = " + res);
			}
		}
		
		
}
}		
	


