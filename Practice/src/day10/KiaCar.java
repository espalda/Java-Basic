package day10;

import day09.Car;

public class KiaCar extends Car{
	
	public static void main(String[] args) {
		/* d10 상속 Inheritance
		 * 상속을 받으면 부모클래스에 있는 멤버변수와 멤버메서드를 물려받는다
		 * 접근제한자가 private이면 자식 클래스에서 접근할수 없다
		 */
		KiaCar kc = new KiaCar();
		kc.printCar();

	}
	
	public final static String brand = "KIA"; //상수, 브랜드를 KIA로 고정 변경불가
	public KiaCar(){
		// speed =1;
		// 접근불가 : 부모에서 접근제한자가 private이기 때문에
		setSpeed(0);
	}
	

}
