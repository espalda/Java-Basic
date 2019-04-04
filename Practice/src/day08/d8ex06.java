package day08;

public class d8ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMultiTables ();
	}
		public static void printMultiTable (int num){
			for(int i=1; i<=9; i++){
				 System.out.println(num+ "x"+ i+ "="+ num * i);
			}
		}
	
		/* 기능 : 2단에서 9단을 출력하는 기능
		 * 매개변수 : int start, int end
		 * 리턴타입 : void
		 * 매서드명 : table
		 */
		
		public static void printMultiTables (int start, int end){
			for(int i=start; i<=end; i++){
				printMultiTable(i);
				System.out.println();
			}
	}
		/* 기능 : 구구단 전체(2단에서 9단)이 출력되는 기능
		 * 
		 */
		public static void printMultiTables (){
			printMultiTables(2,9);
		}
		

}
