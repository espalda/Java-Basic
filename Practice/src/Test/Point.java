package Test;

public class Point {
	
	public static void main(String[] args) {
		
		Point p = new Point();
		p.print(); // 기본생성자 0으로 초기화한 값
		p.move(5, 8); //새로 이동한 값 출력 메서드
		
	}
	

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
	
	//[현재좌표출력]
	public void print(){
		System.out.println(x +" , "+ y);
	}
	
	//[좌표이동값]
	
	public void move(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println(x +" , "+ y);
	}
	
	
	//[기본 생성자]
	public Point (){};
	
	//[생성자 오버로딩]
	public Point (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//[복사생성자]
	public Point (Point p){
		this(p.x, p.y);
		System.out.println(p);
	}
	
	@Override
	public String toString() { //객체를 문자열로 출력하는 메서드 print, scanner 랑 비슷한 기능
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
	

