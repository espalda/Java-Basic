package Test1;

public class Point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.print(2,5);
		p.move(8,8);
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
	
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	System.out.println("이동 좌표: " +x+","+y);
	}
	
	public void print(int x, int y){
		this.x = x;
		this.y = y;
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
}
