package day10;

public class TriangleTest {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.print();
		Triangle t2 = new Triangle(1,1,3,3);
		t2.print();
		Triangle t3 = null;
		t3.print();
		/* 에러 내용 :java.lang.NullPointerException 객체를 생성하지 않고 호출
		 * 에러 원인 : 참조변수가 null 값을 가지는데 해당 변수를 사용했을 경우 생기는 에러
		 * 			일반적으로 클래스의 객체를 선언만 하고 new를 통해 생성하지 않은 상태에서
		 * 			메서드 호출시 발생
		 * 해결 방법 : 객체를 생성하고 호출하면 됨
		 */
		//t1은 객체를 선언 = 는 뒤에는 객체를 생성한다!
		
	}
}
