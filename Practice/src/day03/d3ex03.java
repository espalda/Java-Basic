package day03;

public class d3ex03 {

	public static void main(String[] args) {
		/* d3 반복문 서로소
		 * 서로소 : 두 수의 최대 공약수가 1인 두 수 사이의 관계
		 * 3과 7은 서로소 관계
		 * 4와 6은 서로소가 아님
		 * 최대공약수가 1과 같으면 서로소 관계라고 출력하고 아니면 서로소가 아니라고 출력
		 */
		
		int num1=9, num2=7;
		int i, gcd=1;
		for (i=1 ; i<=num1 ; i++){
			if( num1 % i == 0 && num2 % i == 0){
				gcd = 1;
			}
		}

		if(gcd == 1){
			System.out.println(num1 + "과 " + num2 +"는 서로소 입니다");
		}else{
			System.out.println("서로소가 아니다.");
		}
		
		
		
		
}}
