package day08;

public class d8ex04 {

	public static void main(String[] args) {
		/* d8 재귀 호출 factorial
		 * 자기 자신을 호출하는 메서드
		 * java.lang.StackOverflowError 발생하면 재귀 호출을 의심
		 */
		System.out.println(factorial(5));
		
		}
		// 잘못된 재귀 메서드
		public static void print(){
			System.out.println("Hello");
			print();
	}
		/* 5! 1*2*3*4*5
		   	  3!*4*5	
		   	  4!*5
		 * 기능 : 정수 num이 주어지면 주어진 정수 num!를 알려주는 메서드
		 * 매개변수 : int num
		 * 리번타입 : int
		 * 메서드명 : factorial
		 */
		
		public static int factorial (int num){
			if(num == 1 || num == 0)
				return 1;
			if(num <0)
				return -1;
			return factorial(num-1)*num;
		}
		

}
