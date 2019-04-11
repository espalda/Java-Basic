package day10;

public class d10interface {

	public static void main(String[] args) {
		/* d10 인터페이스 interface
		 * 인터페이스 : 추상메서드와 상수(final, static생략가능, 클래스 멤버변수)로만 이루어짐
		 * 			부모가 여러명 가능(다중상속이 가능)
		 * 인터페이스를 사용하는 이유
		 * 클래스의 기능(메서드의 선언부)를 한눈에 파악할수있다
		 * 여러개발자가 동시에 개발하는 경우 표준화를 시킨다
		 * 상속도 받고 구현도 가능한 복합적인 기능
		 * interfaceA{}
		 * class B implement A{
		 * 오버라이딩 구현
		 * }
		 
		 * 다형성 : 하나로 여러타입을 커버
		 * 참조변수의 형변환
		 * 		자식에서 부모로 : 자동
		 * 		부모에서 자식으로 : 명시적(조건적으로 가능)
		 * 		Shape s = new Rect(); 가능
		 * 		Rect r = (Rect)s; 가능
		 * 		Shape s = new Shape(); 불가능
		 * 		Rect r = (Rect)s; 불가능
		 
		 * instanceof : 형변환 가능 여부를 알려주는 연산자
		 * 매개변수의 다형성 : 오버로딩으로 구현할것을 매개변수를 잘 선정하여 다른 매개변수를 동일하게 처리
		 * 추상클래스 : 추상메서드를 포함한 클래스
		 * 추상메서드 : 선언부만 있는메서드
		 * 			추상클래스를 상속받으면 반드시 추상메서드를 구현
		
		 * 
		 */	
	
	}
}
abstract class Shape2{
	int x, y;
	int w, h;
	abstract void print();
}
	/* abstract 추상 클래스 : 선언부만 가지고 있고 구현부는 작성하지 않은 미완성 설계도
	 * 추상메서드를 사용하려면 추상 클래스를 상속받는 자식 클래스를 만들고
	 * 만들어진 자식 클래스에서 메서드 오버라이딩을 통해 구현한 후 사용한다
	 * 추상클래스 추상메서드를 가진 클래스
	 * 추상 클래스를 상속받으면 추상 메서드를 반드시 오버라이딩을 통해 구현해야한다.
	 */
class Rect2 extends Shape2{
		@Override
		void print() {
			// TODO Auto-generated method stub
		}
	
}
	
	
