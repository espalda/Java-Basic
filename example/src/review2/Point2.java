package review2;

import java.util.*;

public class Point2 {

	public static void main(String[] args) {
		//5에서 생성한 Point 클래스를 이용하여 점의 이동 경로를 저장하는 코드를 작성
		ArrayList<Point> pointPath = new ArrayList<>();
		Point p = new Point();
		pointPath.add(new Point(p));
		p.move(4, 4);
		pointPath.add(new Point(p));
		p.move(10, 10);
		pointPath.add(new Point(p));
		
		Iterator<Point> it = pointPath.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			//sysout(object) = ToString 을 불러온다
		}
	}
	
	
	
	
}
