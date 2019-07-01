package day10;

public class Circle extends Shape {
	/* d10 상속 Circle
	 * 도형은 point와 has a 관계
	 */
	public static void main(String[] args) {
			
			Circle c = new Circle(5,5,5);
			c.print();
		}
	
	private int radius;

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public void print(){
		System.out.print("중심 점: ");
		center.print();
		System.out.println("반지름: "+ radius);	
	}
	
	public Circle(){
		//super();가 생략되어 있다
	}
	
	public Circle(int x, int y, int r){
		super(x,y,r,r);//부모클래스
		 radius = r;
	}
	
	
}
