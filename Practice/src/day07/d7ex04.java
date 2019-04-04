package day07;

public class d7ex04 {

	public static void main(String[] args) {
		// d7 메서드 재사용성
		/* ********** 
		 * 기능: 별이 10개가 출력되는 별
		 * 매개변수 : 별의 갯수 int i가 n개이면, 별이 n개 출력되도록
		 * 리턴타입 : 없음 
		 * 메서드명 : star
		 */
		star(10,'*');
	}

		public static void star (int n, char op){
			for(int i=1; i<=n; i++){
				System.out.print(op);
			}
		}
}
