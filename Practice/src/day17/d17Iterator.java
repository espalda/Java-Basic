package day17;

import java.util.*;

public class d17Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 암기
		HashSet<Integer> set = new HashSet<>();
		Iterator<Integer> it = set.iterator();
		//앞에서부터 차례대로 객체를 빼옴
		while(it.hasNext()){
			Integer obj = (Integer)it.next();
			System.out.println(it.next());
		}

	}

}
