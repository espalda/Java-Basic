package day07;

public class d7ex02 {

	public static void main(String[] args) {
		/* d7 일반변수 참조변수
		 * 일반 변수 : 값을 저장하는 변수 int num1, double num2, char op
		 * 참조 변수 : 주소를 저장하는 변수 int arr []
		 * 매개변수의 원본이 바뀌려면 매개변수가 참조변수이어야 한다
		 */

	}	
		
		/* 기능 : 배열을 num로 초기화 하는 메서드
		 * 매개변수 : int [] arr, int num
		 * 리턴타입 : 없음 void
		 * 메서드명 : initArr 
		 */
		public static void initArr(int [] arr, int num){
			for(int i=0; i<arr.length; i++){
				arr[i] = num;
			}
		}
		public static void printArr(int [] arr){
			for(int tmp : arr){
				System.out.println(tmp + " ");
			}
			System.out.println();
		}

}
