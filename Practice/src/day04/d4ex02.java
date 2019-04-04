package day04;

public class d4ex02 {

	public static void main(String[] args) {
		//문제 : 12와 15의 최대공약수
		//최대공약수는 12로도 나누어 지고 15로도 나누어지는 공통된 수 중 큰수
		int num1 = 10, num2 = 15;
		int i, gcd= 1;
		for (i=1 ; i<=num1 ; i++){
				if(num1 % i == 0 && num2 % i == 0){
					gcd = i;
				}
		}System.out.println("최대공약수" + gcd);
		
		
		//문제 : 12와 15의 최소공배수
		int lcm=1;
		for(i=1 ; i<=num1*num2 ; i++){
			if(i % num1 ==0 && i % num2 ==0){
				lcm=i;
				break;
			}
		}
		System.out.println("최소공배수 " + lcm);
		

	}

}
