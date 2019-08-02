package day16;

import java.util.ArrayList;
import java.util.Scanner;

public class d16ArrayList1 {

	public static void main(String[] args) {
		/* d16 ArrayList Point
		 * 컬렉션 프레임 워크 Collections Framework
		 * 		데이터 집합을 효율적으로 관리하기 위해 표준화 시킨것
		 * 종류 : Collection(List, Set)과 map이 있다
		 * 컬렉션은 하나의 값을 이용
		 * List : 중복 허용하므로 순서가 있다
		  		ArrayList, LinkedList, Stack, Vector
		 * Set : 중복 불가해서 순서 보장하지 않음
		 * map : key와 value의 두개의 값으로 이루어짐
		  		 key는 중복불가, value는 중복허용
		  		 
		 * ArrayList : List인터페이스를 구현한 클래스(순서가 있고 중복 허용)
		 * 				배열로 이루어진 리스트, 탐색이 빠르다, 삽입삭제가 중간일때 속도가 느려진다
		 * 				연속적인 공간에 배열을 생성하여 사용 => 탐색에 효율이 좋음
		 * ArrayList의 객체를 생성할 때 어떤 데이터(자료형 또는 클래스)를 이용할건지 결정해야한다
		 * LinkedList : 삽입 삭제가 좋고 탐색 속도가 느려진다
		 * 							수정이 자주 일어나는 경우 효율이 좋음
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); 	//list.add(new Integer(10));
		list.add(5);
		list.add(1);
		/*for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}*/
		ArrayList<Point> pList = new ArrayList<Point>();
		Point pt = new Point();
		char mode = 'y';
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("이동할 좌표 입력 (예:1 2)");
			int x = scan.nextInt();
			int y = scan.nextInt();
			pt.move(x, y);
			System.out.println("이동한 현재 좌표"+ pt);
			pList.add(new Point(pt));	//익명객체 이름없이 객체를 만들어서 바로바로 사용하기 위해서, 바로 사용가능한것
			System.out.println("더하시겠습니까?(y or n): ");
			mode=scan.next().charAt(0);
		}while(mode !='n');
		
		for(int i=0; i<pList.size(); i++){
			System.out.println(pList.get(i));
		}
	}
}
	
class Point{
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
	
	public Point(){
	}
	
	public Point(int x, int y){
		this.x =x;
		this.y =y;
	}
	public Point(Point p){
		this(p.x, p.y);
	}
	
	
	public void move (int x, int y){
		this.x =x;
		this.y =y;
	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	/* 객체가 어느 그룹에 속해있는지 알려주는 메서드로
	 * Point 클래스에서는 x,y의 값이 같다면 다른 객체이더라도
	 * 같은 그룹에 속하기 때문에 겁색을 빠르게 할 수 있다
	 * 그룹을 나눠서 내가 어느 그룹에 속해있는지 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	//두 객체가 같은 객체로 판별할 것인지를 결정하는 메서드
	@Override
	public boolean equals(Object obj) { //주소가 같은 경우면 당연히 본인이기 때문에 같은 객체
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		//Point 클래스에서 같은 객체는 x와 y가 같은 경우이다로 설정함
		
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
	
}
