package day09;

public class d9PointTest {
	//d9 클래스 Point test
	public static void main(String[] args) {
	d9Point p = new d9Point();
	p.print();
	d9Point p1 = new d9Point(1,1);
	p1.print();
	d9Point p2 = new d9Point(p);
	p2.print();
	p2.move(3,4);
	p2.print();
	System.out.println(p2.distance(0,0));
	p2.moveUp();
	
	}
	
}
