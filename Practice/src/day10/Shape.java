package day10;

import Test.Point;

public class Shape {
	protected Point center;
	//protected 접근제한자와 point라는 클래스
	//center라는 객체의 멤버변수
	protected int width;//자료형의 멤버변수
	protected int height;//자료형의 멤버변수
	/* 클래스 멤버변수
	 * private static int area
	 * 공유한다, 객체를 생성하지 않는다, 상수와 다른점은
	 * 클래스 멤버변수는 변할수있는 값이다
	 * final 상수와의 차이점
	 * final 클래스 멤버변수, 
	 * final 멤버변수 고정된 값이다
	 */
	
	//외부에서 center값을 접근하기 위해서  setter 와  getter 를 설정
	//public은 get/set 필요 없음
	//getter, setter 설정
	public Point getCenter() {//변수확인
		return center;
	}
	public void setCenter(Point center) {//변수변경
		this.center = center;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	//출력 내용
	public void print(){
		System.out.print("중심점: ");
		center.print(); //center 호출
		System.out.println("가로: "+ width);
		System.out.println("세로: "+ height);
	}
	//생성자
	public Shape(){
		center = new Point();//객체 생성필수
	}
	public Shape(int x, int y, int width, int height){
		center = new Point(x,y);
		this.width = width;
		this.height = height;
	}
	
}
