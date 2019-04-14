package day10;

public class Triangle extends Shape {
	
	public static void main(String[] args) {
		//d10 자식클래스 Triangle
		//Shape 클래스를 상속받아 Triangle 클래스를 만들고 필요한 기능 구현
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
		 * t1은 객체를 선언 = 는 뒤에는 객체를 생성
		 */
	}

		private double area;
		
		//getter만 만드는지 이유, 넓이는 다른정보를 이용하지 않으므로 setter x
		public double getArea() {
			return area;
		}
		
		//기본생성자
		public Triangle(){}
		public Triangle(int x, int y, int w, int h){
			super(x,y,w,h); //부모클래스의 생성자 호출
			area =  w * h / 2.0; //2가 아닌 2.0으로 나누기 중요!
		}
		@Override
		public void print(){
			System.out.println("--- 삼각형 ---");
			super.print();	//부모클래스의 print메서드 호출
			System.out.println("넓이: "+ area);
		}
		public void resize(int width, int height){
			this.width = width;
			this.height = height;
			area = width * height / 2.0;
	}
}
