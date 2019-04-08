package day10;

public class KiacarTest {

	public static void main(String[] args) {
		// d10 상속 inheritance
		/* 상속을 받으면 부모클래스에 있는 멤버변수와 멤버메서드를 물려받는다
		 * 접근제한자가 private이면 자식 클래스에서 접근할수 없다
		 * 
		 */
		Kiacar kc = new Kiacar();
		kc.printCar();

	}

}
