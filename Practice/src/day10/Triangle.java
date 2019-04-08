package day10;

public class Triangle extends Shape {
	//Shape 클래스를 상속받아 Triangle 클래스를 만들고 필요한 기능 및 멤버구현
		private double area;
		
		public double getArea() {//getter만 만드는지 이유, 넓이는 다른정보를 이용하지 않으므로 setter x
			return area;
		}
		//기본생성자 : 
		public Triangle(){}
		public Triangle(int x, int y, int w, int h){
			super(x,y,w,h); //부모클래스의 생성자 호출
			area =  w * h / 2.0;
		}
		@Override
		public void print(){
			System.out.println("--- 삼각형 ---");
			super.print();//부모클래스의 print메서드 호출
			System.out.println("넓이: "+ area);
		}
		public void resize(int width, int height){
			this.width = width;
			this.height = height;
			area = width * height / 2.0;
	}
}
