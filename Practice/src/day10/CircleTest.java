package day10;

public class CircleTest {

	public static void main(String[] args) {
		/* 클래스의 상속 : 부모클래스의 멤버 변수와 멤버 메서드를 물려받는 것 (재사용성)
		 * 				상속은 단일상속
		 * 				Object는 최상위 조상클래스
		 * 접근가능제한자 public, protected
		 
		 * 상속 : is a 관계가 성립하면 상속을 할 수 있다
		 * 기아자동차는 자동차이다 라는 말이 성립하면 기아자동차는 자동차를 상속받을수 있고
		 * 성립하지 않는다면 상속받을수 없다
		
		 * 포함 : has a 다른 클래스의 객체가 내 멤버변수로 오는 관계가 성립하면 포함할 수 있다
		 * class Circle{
		 * 			Point center;
		 * }
		 * class Point{}
		 * 스마트폰, 폰, 카메라
		 * is a 폰 (폰이다)
		 * has a 카메라(카메라 기능을 가지고 있다)

		 * 오버라이딩 : 부모클래스의 메서드를 재정의
		 * super : 부모클래스의 생성자 호출
		 * 제어자
		 */
		Circle c = new Circle(5,5,5);
		
		c.print();
	}

}
