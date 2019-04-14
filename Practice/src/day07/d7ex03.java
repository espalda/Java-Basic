package day07;

public class d7ex03 {

	public static void main(String[] args) {
		//d7 메서드 구구단 출력
		//table();
		//printMul(2,6);
		printDan(2);
		//printAll(2,9);
	}
		public static void table (){
			for(int num=2; num<=9; num++){
				for(int i=1; i<=9; i++){
					System.out.print(num + "x"+ i+ "="+ num*i);
					System.out.println();
				}
				System.out.println();
			}
	}
		/* 기능 : 두 정수가 주어지면 두 정수의 곱을 출력하고 그 결과를 알려주는 메서드
		 * 매개변수 : 두 정수 int num1, int num2
		 * 리턴타입 : 곱한 결과 int
		 * 메소드명 : printMul
		 */		
		public static int printMul(int num1, int num2){
			System.out.println(num1+ "x"+ num2+ "="+ num1*num2);
			return num1*num2;
		}
	
		/* 
		 * 기능 : 두 정수가 주어지면 해당하는 단을 출력하는 메서드
		 * 매개변수 : 단 int num
		 * 리턴타입 : 없음 void
		 * 메소드명 : printDan
		 */
		public static void printDan(int num){
			for(int i=2; i<=9; i++){
				printMul(num,i);
			}
		}
		
		/* 기능 : 두 정수가 주어지면 두 정수의 곱을 출력하는 메서드
		 * 매개변수 : int start, int end
		 * 리턴타입 : void
		 * 메소드명 : printA
		 */	
		public static void printAll (int start, int end){
			if(start < 0) return;//강제 종료
			
			for(int i=start; i<=end; i++){
				printDan(i);
			}
		}
	
				

}
