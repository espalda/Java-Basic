package day11;

public class d11equal {

	public static void main(String[] args) {
		String str1 = "Hello", str2 = "Hello";
		boolean cmp = str1 == str2; //같다를 통해서 문자열 비교 가능
		System.out.println(cmp);
		cmp = str1 != (str2 = "Hello ");
		System.out.println(cmp);
		cmp = str1 != (str2 ="Hello 1");
		System.out.println(cmp);
		System.out.println(str1.equals(str2));
		
	}

}

