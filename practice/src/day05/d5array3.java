package day05;

public class d5array3 {

	public static void main(String[] args) {
		/* d5 배열 랜덤
		 * 배열은 주로 반복문과 사용
		 * 7개를 저장할수 있는 정수형 배열을 생성하고
		 * 1번지에는 1...6번지에는 6을 넣는 배열 작성
		 * 각 번지에 1~45사이의 랜덤한 수를 생성하여 저장하는 코드 작성
		 * int min = 1;
		 * int max = 3;
		 * 01 min 에서 max 사이의 정수를 랜덤으로 생성하는 코드, 중복 되는 숫자 존재함
		 * int com = (int)(Math.random()*(max-min+1) + min);
		 */
		
	/*	int [] arr = new int [7];
		int min = 1;
		int max = 45;
		for(int i=0 ; i<arr.length ; i++){
				arr[i] = (int)(Math.random()*(max-min+1) + min);
				System.out.println(arr[i]);
		}*/
		method(7);
	}
	
	public static int method(int num) {
		int [] arr = new int [num];
		int min = 1;
		int max = num;
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(max-min+1) +min);
			System.out.print(arr[i] + " ");
		}
		return num;
	}
}
