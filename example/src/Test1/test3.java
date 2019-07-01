package Test1;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime(4);
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
}

