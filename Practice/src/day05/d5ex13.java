package day05;



public class d5ex13 {

	public static void main(String[] args) {
		// 두수의 공약수들을 배열에 저장하여 출력하는 코드 작성
		// 최대 10개를 저장 가능
		int [] arr = new int [10];
		int i;
		int cnt=0; //공약수의 갯수
		int num1 = 8;
		int num2 = 12;
		for(i=1 ; i<=num1 ; i++){
			if(cnt == 10){
				break; //10개 이상은 더이상 구하지 말라
			}
			if(num1 % i == 0 && num2 % i == 0){
				arr[cnt] = i;
				cnt++; //공약수 갯수를 하나 증가	
			}
		}
		for(int j=0; j<cnt; j++){
			System.out.print(arr[j] + " ");
		}
		
		
	}

}
