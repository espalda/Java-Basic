package review;

public class test3 {

	public static void main(String[] args) {
		//3번 소수 판별 문제
		prime(7);
	}
	public static void prime(int num){
		int cnt = 0;
		for(int i=2; i<=num; i++){
			if(num % i == 0){
				cnt++;	
			}
		}
		if(cnt == 1){
			System.out.println(num+"는(은) 소수입니다");
		}else{
			System.out.println(num+"는(은) 소수가 아닙니다");
		}
		
	}
	
	public static void prime2(int num){
		int i;
		for(i=2; i<num; i++){
				if(num%1==0) break;
			}
		
		if(i!=num){
			System.out.println(num+"는 소수가 아니다");
		}else{
			System.out.println(num+"는 소수");
		}
	}
}

