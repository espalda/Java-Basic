package day05;

public class d5arr02 {

	public static void main(String[] args) {
		/* 배열은 주로 반복문과 사용
		 * 7개를 저장할수 있는 정수형 배열을 생성하고
		 * 1번지에는 1...6번지에는 6을 넣는 배열 작성
		 * 각 번지에 1~45사이의 랜덤한 수를 생성하여 저장하는 코드 작성
		 */
		int [] num = new int [7];
		int i=0;
		for(i=0 ; i<num.length ; i++){
			num[i] = i;
			System.out.println(num[i]);
		}
		
	}

}
