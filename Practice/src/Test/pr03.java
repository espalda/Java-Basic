package Test;

import java.util.*;

public class pr03 {

	public static void main(String[] args) {
		/* trimToSize용량에 맞게 줄인다
		 * 사이즈가 3이면 용량을 3으로 맞게
		 * ensureCapacity(7)
		 * 최소용량을 설정한다
		 * 용량을 7로 설정한다
		 * setSize
		 * 객체갯수를 설정한다
		 * 비어인는곳은 null값을 가진다
		 */
		Set s= new HashSet();
		while(s.size()<6){
			int num = (int)(Math.random()*45)+1;
			s.add(new Integer(num));
		}
		List t = new LinkedList(s);
		Collections.sort(t);
		System.out.println(t);
	}	

}
