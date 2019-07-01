package day08;

public class d8overload {

	public static void main(String[] args) {
		/* d8 메서드 오버로딩 overloading
		 * 한 클래스내에서 같은 이름의 메서드를 여러개 정의하는 것
		 * 1. 매개변수의 갯수가 달라야 한다
		 * 2. 매개변수의 갯수가 같지만 자료형이 달라야 한다
		 */
		System.out.println(sum(1,2));
		System.out.println(sum(1.2, 1.2));
		System.out.println(sum(1,2,3));
	}
		/* 기능 : 두 정수의 합을 알려주는 기능
		 * 매개변수 : 두 정수 int num1, int num2 
		 * 리턴타입 : 합의 결과 int
		 * 매서드명 : sum 
		 */
		public static int sum (int num1, int num2){
			return num1+num2;
		}
		
		/* 기능 : 두 실수의 합을 알려주는 기능
		 * 매개변수 : 두 실수 double num1, double num2
		 * 리턴타입 : 합의 결과 double
		 * 매서드명 : sum
		 */
		public static double sum (double num1, double num2){
			return num1+num2;
		}
		
		/* 기능 : 세 정수의 합을 알려주는 기능
		 * 매개변수 : 세 정수 int num1, int num2, int num2
		 * 리턴타입 : int
		 * 매서드명 : sum
		 */
		public static int sum (int num1, int num2, int num3){
			return num1+num2+num3;
		}
		
		public static void dan (int num){
			for(int i=1; i<=9; i++){
				 System.out.println(num+ "x"+ i+ "="+ num * i);
			}
		}
	
		/* 기능 : 2단에서 9단을 출력하는 기능
		 * 매개변수 : int start, int end
		 * 리턴타입 : void
		 * 매서드명 : table
		 */
		public static void table (int start, int end){
			for(int i=start; i<=end; i++){
				dan(i);
				System.out.println();
			}
	}
		//기능 : 구구단 전체(2단에서 9단)이 출력되는 기능
		public static void table (){
			table(2,9);
		}
		

}
