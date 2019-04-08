package day09;

import day08.d8ex04;

public class d9class02 {

	public static void main(String[] args) {
		// d9 다른 class 가져오기
		String []s = new String[3];
		TelevisionTest.main(s);
		
		int res = d8ex04.factorial(5);
		System.out.println(res);
	}

}
