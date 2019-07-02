package review2;

import java.util.*;

public class Point3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D();
		p.print();
		p.move(3, 4, 5);
		p.print();
		
	}

}
class Point3D extends Point{
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	//method overloading
	public void move(int x, int y, int z){
		super.move(x, y);
		this.z = z;
	}
	//method overriding
	@Override
	public void print(){
		System.out.println("현재 좌표: "+getX()+","+getY()+","+z);
	}

	@Override
	public String toString() {
		return "현재 좌표: "+getX()+","+getY()+","+z;
	}
	public Point3D(){}
	public Point3D(Point3D p){
		move(p.getX(), p.getY(), p.z);
	}
	public Point3D(int x, int y, int z){
		move(x, y, z);
	}

}
