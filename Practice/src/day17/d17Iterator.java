package day17;

import java.util.HashSet;
import java.util.Iterator;

public class d17Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hSet = new HashSet();
		Iterator<String> it = hSet.iterator();	//앞에서부터 차례대로 객체를 빼옴
		while(it.hasNext()){
			String obj = (String)it.next();
		}

	}

}
