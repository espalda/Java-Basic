package day17;

import java.util.*;

public class d17Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		Iterator<String> it = set.iterator();	//앞에서부터 차례대로 객체를 빼옴
		while(it.hasNext()){
			String obj = (String)it.next();
		}

	}

}
