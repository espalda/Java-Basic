package day10;

public class d10ex02 {

	public static void main(String[] args) {
		
	}
}
	/* interface 인터페이스
	 * 선언문만 있고 구현부가 없다.
	 * 구현은 이클래스를 상속받는 자식클래스가 함
	 * 빈번하게 오버라이딩이 일어나느경우에 추상메서드
	 * 추상메서드는 주로 자식클래스에서 오버라이딩이 빈번하게 발생하는 경우에
	 * 해당 메서드를 구현하지 않고 추상메서드 선언후에 자식 클래스에서 구현
	 * 장점 : 개발시간 단축, 표준화 가능, 클래스의 연결 가능, 독립적인 프로그래밍 가능
	 */
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