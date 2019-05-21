package Test;

public class Point3d extends Point{
	public static void main(String[] args) {
		
		Point p = new Point();
		p.print(); // 기본생성자 0으로 초기화한 값
		p.move(5, 8); //새로 이동한 값 출력 메서드
		
	}
	
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	//[현재 좌표 출력]
	public void print(){
		System.out.println(getX() + " , "+ getY() +" , "+ z);
	}
	
	//[좌표 이동]
	public void move(int x, int y, int z){
		move(x,y);
		this.z = z;
	}
	
	//[기본 생성자]
	public Point3d (){};
	
	//[생성자 오버로딩]
	public Point3d (int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	
	//[복사 생성자]
	public Point3d (Point3d p){
		super(p.getX(), p.getY());
		this.z = p.z;
	}
	
}
