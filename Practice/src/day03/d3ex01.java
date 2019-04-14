package day03;

public class d3ex01 {

	public static void main(String[] args) {
		/* d3 반복문 최대공약수
		 * 최대공약수 : 두수의 공약수중 가장 큰 공약수
		 * 공약수 : 두수의 약수중에서 공통으로 들어가있는 약수
		 * i가 num 의 약수이면
		 * 약수 : num % i == 0
		 
		 * 8 : 1 2 4 8
		 * 12: 1 2 3 4 6 12
		 * 8과 12의 공약수 1 2 4
		 * 8과 12의 최대공약수 4
		 */
		
		//i가 num1의 약수이고 num2의 약수이면 gcd에 i를 저장한다
		int num1=12, num2=8;
		int i, gcd=0;
		
		for(i=1; i<=num1 ; i+=1){
			if(num1 % i == 0 && num2 % i == 0){
				gcd = i;
				}
			}
		System.out.println(gcd);
			

		
		
		
}
}
