package coding1;

public class test2 {
	//자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
	//제한 조건 : n은 10,000이하인 자연수입니다.
	public static void main(String[] args) {
		
		reverse_num1(12345);
	}
	
	public static int[] reverse_num1(int n) {
		int[] arr = new int [10];
		for(int i=arr.length-1; i>=0; i--) {
			if(i<=10000) {
				int tmp;
				tmp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = tmp;
				System.out.println(arr[i]);
			}
			
		}
	      return arr;
	 }
	
	public static String reverse_str1(String str){
		for (int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
		return str;
    }
	
	public static String reverse_str2(String str) {
		return str;
		
	}
}
