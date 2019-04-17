package day16;

import java.util.*;

public class d16HashSet1 {

	public static void main(String[] args) {
		/* d16 HashSet 11-20
		 * Set은 중복을 제거한다
		 * 순서를 유지하지 않기 때문에 저장한 순서와 다를수 있다
		 */
		Object [] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4","1"}; 
		Set set = new HashSet();
		for(int i=0; i<objArr.length; i++){
			set.add(objArr[i]);
		}
		System.out.println(set);	//문자열의 1이기 때문에 중복되어서 나온다
	}

}
