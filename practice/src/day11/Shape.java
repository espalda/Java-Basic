package day11;

import day10.Point;

public class Shape implements Draw {
	/* d11 클래스 Shape
	 * draw라는 인터페이스를 공유하는 shape 이라는 클래스 생성
	 */
	private Point center;
	private double width;
	private double height;
	
	//shape 클래스를 통해(상속 포함) 만들어진 객체의 갯수를 저장하는 변수
	public static int count = 0;
	//클래스 멤버변수 count의 값을 출력하는 클래스 멤버 메서드
	public static void printCount(){	
		System.out.println("총 만들어진 도형: "+ count);
	}//증가는 생성자에서 왜그런지는 모르겟지만.. 생 성 자..
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center.setX(center.getX());
		this.center.setY(center.getY());
	}
	
	//객체를 만들기 번거로워서 새로이 추가
	public void setCenter(int x, int y) {
		this.center.setX(x);
		this.center.setY(y);
	}
	
	//생성자 생성
	//변수 center의 객체 만들기
	//객체는 참조변수이기 때문에 
	//기본 생성자
	public Shape(){
		center = new Point();
		count++;
	}
	//복사 생성자
	public Shape(Shape s){
		this.width = s.width;
		this.height = s.height;
		this.center = new Point (s.center);
		count++;
	}
	
	public Shape(int x, int y, int width, int height){
		this.center = new Point(x,y);
		resize(width, height);
		count++;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void print() {
		System.out.println("--------------");
		System.out.print("중심점: ");
		center.print();
		System.out.println("가로: "+ width);
		System.out.println("세로: "+ height);
		System.out.println("--------------");
	}

	@Override
	public void resize(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void move(int x, int y) {
		this.setCenter(x,y);
	}
	@Override
	public boolean equals(Object obj){
		if( obj instanceof Shape){
			Shape s = (Shape)obj;
			if(s.width != this.width) return false;
			if(s.height != this.height) return false;
			if(s.getCenter().getX() !=getCenter().getX()) return false;
			if(s.getCenter().getY() !=getCenter().getY()) return false;
			return true;
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "Shape [center=" + center + ", width=" + width + ", height=" + height + "]";
	}
	
}
