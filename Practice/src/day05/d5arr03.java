package day05;

public class d5arr03 {

	public static void main(String[] args) {
		/* d5 배열 랜덤 코드 작성
		 * 배열은 주로 반복문과 사용
		 * 7개를 저장할수 있는 정수형 배열을 생성하고
		 * 1번지에는 1...6번지에는 6을 넣는 배열 작성
		 * 각 번지에 1~45사이의 랜덤한 수를 생성하여 저장하는 코드 작성
		 * int min = 1;
		 * int max = 3;
		 * 01 min 에서 max 사이의 정수를 랜덤으로 생성하는 코드
		 * int com = (int)(Math.random()*(max-min+1) + min);
		 */
		int [] arr = new int [7];
		int min = 1;
		int max = 45;
		for(int i=0 ; i<arr.length ; i++){
				arr[i] = (int)(Math.random()*(max-min+1) + min);
				System.out.println(arr[i]);
		}
		
		
	}

}
