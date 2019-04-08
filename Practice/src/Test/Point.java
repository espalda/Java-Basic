package Test;

public class Point {
//이차원에서 한 점을 나타내는 클래스
	private int x; //접근제한자가 private 인 맴버변수 int x와
	private int y; //접근제한자가  private 인 멤버변수 int y
	//public을 제외한 나머지는 외부에서 값을 확인할수 없어서  getter와 setter를 사용함!
	
	public int getX() {//변수를 확인하는 기능
		return x;
	}
	public void setX(int x) {//변수를 변경하는 기능
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//print 구현
	public void print(){
		System.out.println("("+ x+ ","+ y+ ")"); //현재 포인트를 출력하는 기능
	}
	//메서드 오버로딩
	public void move(int x, int y){ //움직인 값을 나타내어주는 기능
		this.x =x;
		this.y =y;
	}
	public void move(Point p){
		move(p.x,p.y);
	}
	
	//기본생성자
	//move값을 0,0으로 초기화
	//생성자의 이름 x,y대신 this를 사용한다.
	//한 생성자에서 다른 생성자를 호출할때는 반드시 첫줄에서만 호출이 가능하다
	public Point(){
		move(0,0);
	}
	//생성자 오버로딩
	public Point(int x, int y){
		move(x,y);
	}
	//복사 생성자
	public Point(Point p){
		move(p);
	}
	
	
}
