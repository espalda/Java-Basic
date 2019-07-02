package review2;

public class Point {

	public static void main(String[] args) {
		//2차원 좌표의 점을 저장하는 Point 클래스를 생성하는 코드
		Point p = new Point();
		p.print();
		p.move(8,8);
		Point p2 = new Point();
		p2.print();
	}

	int x;
	int y;
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	void move(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("이동 좌표: " +x+","+y);
	}
	
	public void print(){
		System.out.println("현재 좌표: "+x+","+y);
	}
	
	//기본 생성자
	public Point(){	}
	//복사 생성자
	public Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	//생성자 오버로딩
	public Point(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	@Override
	public String toString() {
		return "현재 좌표: "+x+","+y;
	}
	
}
