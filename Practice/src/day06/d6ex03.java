package day06;

public class d6ex03 {

	public static void main(String[] args) {
		// d6 메서드 소수 출력
		/* 기능 : 주어진 정수가 소수이면 참, 합성수이면 거짓을 알려주는 메서드
		 * 리턴타입 (출력) : true, false > boolean
		 * 매개변수 (입력) : 정수 int num
		 * 메소드명 : isPrime
		 */
		int num= 5;
		
		if(isPrime(num)){
			System.out.println("소수");
		}else{
			System.out.println("합성수");
		}
	}
		
		public static boolean isPrime (int num){
			int cnt = 0;
			for(int i=1; i<=num; i++){
				if(num%i==0){
					cnt++;
				}
			}
			if(cnt == 2){
				return true;
			}
			else{
				return false;
			}
			
		}
		

}
