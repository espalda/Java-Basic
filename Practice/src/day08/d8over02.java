package day08;

public class d8over02 {

	public static void main(String[] args) {
		// d8 메서드 오버로딩
		table();
		
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
		// 기능 : 구구단 전체(2단에서 9단)이 출력되는 기능
		public static void table (){
			table(2,9);
		}
		

}
