package coding2;

import java.util.Arrays;
import java.util.Collections;

public class sort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {21,4,19,31,16};
		Integer [] arr2 = {21,4,19,31,16};
		Arrays.sort(arr);	//오름차순
		Arrays.sort(arr2, Collections.reverseOrder());	//내림차순
		for(int tmp: arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		for(int tmp: arr2) {
			System.out.print(tmp + " ");
		}
	}

}
