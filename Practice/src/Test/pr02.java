package Test;

public class pr02 {

	public static void main(String[] args){
//		* 자료형 [] 배열이름 = new int[](값, 값2, 값3...};
//		 * 자료형 [] 배열이름 = {값1, 값2, 값3...};
		int [] arr = new int [] {1,2,3,4,5};
		int [] arr2 = {6,7,8,9,0};
		for(int tmp : arr){
			System.out.println(tmp);
		}
		System.out.println();
		for(int tmp : arr2){
			System.out.println(tmp);
		}
	}
}
