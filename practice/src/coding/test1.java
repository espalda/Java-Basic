package coding;

public class test1 {

	//길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(10);
	}
	
	public static String solution(int num) {
		String s = "수";
		String b = "박";
		String res = "";
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0) {
				res = res + b;
			}else {
				res = res + s;
			}
		}System.out.println(res);
		return res;
	}
}
