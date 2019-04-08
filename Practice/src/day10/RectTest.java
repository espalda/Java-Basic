package day10;

public class RectTest {

	public static void main(String[] args) {
		Rect r = new Rect(1,2,3,4);
		r.print();
		r.resize(5, 50);
		r.print();
		
		/* 다형성 : 여러가지 형채를 가질수 있는 능력
				  한타입의 참조변수로 여러타입의 객체를 참조할수있다
		 		  부모타입의 참조변수로 자손타입의 인스턴스를 참조할수 있다
		 * 부모타입(Shape)의 s1의 참조변수로 자손타입(Rect)의 인스턴스를 참조할수 있다
		 */
		Shape s1 = new Rect();
		Shape s2 = new Circle();
		Shape s3 = new Shape();
		if(s1 instanceof Rect){
			System.out.println("객체 s1은 Rect로 형변환이 가능");
			Rect r1 = (Rect)s1;
			r1.print();
		}
		/* instanceof 형변환이 가능한지 검사할때
		 * s1이라는 객체가 rect로 형변환이 가능한지
		 */	
		if(s3 instanceof Rect){
			System.out.println("객체 s3은 Rect로 형변환이 가능");
		}else{
			System.out.println("불가");
		}
		
	}

}
