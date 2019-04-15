package day10;

public class d10interface {

	public static void main(String[] args) {
		/* d10 인터페이스 interface
		 * 추상메서드와 클래스 멤버 상수로만 이루어져 있는 것
		 * + 디폴트 메서드 : 인터페이스에 새로운 기능을 추가하면 해당 인터페이스를 구현한 모든 클래스에 메서드 오버라이딩을 해야하기 때문에
		 * 불필요한 문제가 생길 수 있다
		 * 
		 * 
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
		 * 인터페이스는 구현을 통해 클래스를 만들고, 만들어진 클래스를 통해 사용된다
		 * 
		 */
	
	}
}
abstract class Shape2{
	int x, y;
	int w, h;
	abstract void print();
}
	
class Rect2 extends Shape2{
		@Override
		void print() {
			// TODO Auto-generated method stub
		}
	
}
	
	
