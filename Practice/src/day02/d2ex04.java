package day02;

public class d2ex04 {

	public static void main(String[] args) {
		// d2 중첩 if문
		// 일반 if문
		int num = 12;
		if(num % 2 == 0 && num % 3 == 0){
			System.out.println(num + "은 6의배수");
		}
		
		// 중첩 if문
		int num1 = 12;
		if(num1 % 2 == 0){
			if(num1 % 3 == 0){
				System.out.println("6의 배수");
			}
			else{
				System.out.println("2의 배수");
			}
		}
		else if(num1 % 3 == 0){
			System.out.println("3의 배수");
		}
		else{
			System.out.println("2,3,4의 배수가 아님");
		}
		
		
		
	}
}



