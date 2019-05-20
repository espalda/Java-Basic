package day21;

public class Point3D_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D();
		Point p3 = new Point();
		p.print();
		p.move(5, 5, 5);
		p3.print();
		p3.move(8, 8);
		p3.print();
		Point3D p2 = new Point3D(p);
		p2.print();
		
		
	}

}
