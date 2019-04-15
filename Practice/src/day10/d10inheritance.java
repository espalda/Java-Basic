package day10;

public class d10inheritance extends Shape {
	
	public static void main(String[] args) {
		/* d10 상속 inheritance
		 * 상속 : 부모클래스의 멤버 변수와 멤버 메서드를 물려 받는 것
		 * 부모 : 조상, 상위, 기반 클래스
		 * 자식 : 자손, 하위, 파생 클래스
		 * 멤버변수와 멤버메서드만 상속되고 생성자와 초기화블럭은 상속되지 않는다
		 * 자식클래스의 멤버갯수는 부모클래스의 멤버갯수보다 많다
		 * 클래스에서 상속은 단일상속만 가능
		 * Object는 최상위 조상클래스
		 * Object 클래스의 자식 클래스들은  Object 클래스의 멤버 메서드를 사용할수 있다
		 * 접근가능제한자 public, protected
		 
		 * 상속 : is a 관계가 성립하면 상속을 할 수 있다
		 * 기아자동차는 자동차이다 라는 말이 성립하면 기아자동차는 자동차를 상속받을수 있고
		 * 성립하지 않는다면 상속받을수 없다
		 * extends 로 포함관계를 만들어준다
		
		 * 포함 : has a 다른 클래스의 객체가 내 멤버변수로 오는 관계가 성립하면 포함할 수 있다
		 * class Circle{
		 * 			Point center;
		 * }
		 * class Point{}
		 * 스마트폰, 폰, 카메라
		 * 자식 클래스 is a 부모클래스 (스마트폰은 폰이다)
		 * 클래스 has a 멤버 (스마트폰은 카메라 기능을 가지고 있다)
		 */
	}
	
}



