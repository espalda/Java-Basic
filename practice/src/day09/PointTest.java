package day09;

public class PointTest {
	//d9 클래스 Point test
	public static void main(String[] args) {
	Point p = new Point();
	p.print();
	Point p1 = new Point(1,1);
	p1.print();
	Point p2 = new Point(p);
	p2.print();
	p2.move(3,4);
	p2.print();
	System.out.println(p2.distance(0,0));
	p2.moveUp();
	
	}
	
}
