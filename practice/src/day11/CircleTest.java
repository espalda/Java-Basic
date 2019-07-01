package day11;

public class CircleTest {

	public static void main(String[] args) {
		//d11 상속 Circle test
		try{
		Shape s = new Shape();
		Shape.printCount();
		s.print();
		
		Circle c = new Circle(5,5,5);
		Circle.printCount();
		
		c.move(3,8); //설정
		c.resize(10);
		c.print(); //출력
		
		//자식클래스를 부모클래스로 변환할 때에는 자동형변환이 가능
		Shape s2 = (Shape)c;//s는 부모 c는 자식
		Shape.printCount();
		/* 부모클래스를 자식클래스로 변환할때에는 명시적형변환이 해야한다
		 * 조건부로 가능
		 * 조건을 만족하지 않으면 사용할 때 ClassCastException 발생할수 잇다
		 * 클래스 형변환에러로 변환은 했지만 사용할수 없는 정보가 있어서 사용하지 못한 경우
		 */
		//Circle c2 = (Circle)s; s는 shape클래스의 객체로
		//c2.print();
		Shape s3 = new Circle();
		Shape.printCount();
		Circle c3 = (Circle)s3;
		Circle.printCount();//s3는 circle클래스의 객체로
		c3.print();
		}catch(NullPointerException e){
			System.out.println("객체를 생성하고 사용하세요");
		}catch(Exception e){
			System.out.println("예외 발생!");
		}finally{
			System.out.println("프로그램 종료");
		}
	}

}

