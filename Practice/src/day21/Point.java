package day21;

public class Point {
	
	private int x;
	private int y;
	
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

	
	//[좌표이동]
	public void move (int x, int y){
		this.x = x; //멤버변수와 매개변수
		this.y = y; //멤버변수와 매개변수
	}
	
	//[좌표출력]
	public void print(){
		System.out.println(x +","+ y);
	}
	
	//[기본생성자]
	public Point (){
		this(5,8);
	}
	
	//[복사 생성자]
	public Point (Point p){
		//move(p.x, p.y);
		//this(p.x, p.y);
		this.x = p.x;
		this.y = p.y;
	}
	
	//[생성자 오버로딩]
	public Point (int x, int y){
		//move(x,y);
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}
