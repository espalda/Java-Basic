package day21;

public class Point3D extends Point {
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	//[오버로딩]
	public void move(int x, int y, int z){
		move(x,y); //Point 클래스에 있는 move 메서드 호출
		this.z = z;
	}
	
	//[오버라이딩]
	public void print(){
		System.out.println("(" + getX() + ","+ getY() + "," + z + ")");
	}
		
	//생성자
	public Point3D(){}
	public Point3D(int x, int y, int z){
		//super(x,y);
		this.z = z;
		move(x,y);
	}
	public Point3D(Point3D p){
		//x와 y는 부모의 멤버변수를 상속받았고, 접근제한자가 private이기 때문에 직접 접근할수 없다. 따라서  getter를 이용하여 접근한다.
		move(p.getX(), p.getY(), p.z);
	}
	
	

	
}
