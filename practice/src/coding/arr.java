package coding;

public class arr {

	public static void main(String[] args) {
		// 배열이란 자료형의 종류가 아닌 자료형의 집합을 말한다.
		// 배열의 길이는 고정되어 있다.
		// 초기값 없이 배열을 생성할 시에는 반드시 길이값 입력이 필요하다.
		// String [] weeks = {"mon", "tue", "web", "thu"};
		method(7894);
	}
	
	public static int method(int num) {
		int [] odds = new int [11];
		for(int i=odds.length-1; i>0; i--) {
			odds[0] = 1;
			int tmp = odds[i];
			odds[i] = odds[i-1];
			odds[i-1] = tmp;
			System.out.print(odds[i]);
		}
		return num;
	}
}