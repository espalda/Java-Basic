package day10;

public class Rect extends Shape {
	
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
	private int area;
	
	public int getArea() {	//getter만 만드는지 이유, 넓이는 다른정보를 이용하지 않으므로 setter x
		return area;
	}
	
	// 기본생성자설정
	public Rect(){}
	// 생성자 오버로딩, 복사생성자
	public Rect(int x, int y, int w, int h){
		super(x,y,w,h); //부모클래스의 생성자 호출
		area =  w * h;
	}
	
	// 오버라이딩, 부모클래스의 생성자를 재정의, 변경
	@Override 
	public void print(){
		super.print();	//부모클래스의 print메서드 호출
		System.out.println("넓이: "+ area);
	}
	public void resize(int width, int height){
		this.width = width;
		this.height = height;
		area = width * height;
	}
}
