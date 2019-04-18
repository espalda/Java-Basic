package Test;

import java.util.*;

public class pr04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		while(set.size() < 6){
			int num = 8;
			set.add(new Integer(num));
		}
		List list = new LinkedList(set);
		System.out.println(list);
	}

}
