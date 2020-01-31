package coding1;

public class q0129 {

	public static void main(String[] args) {
		/*문제 설명
		단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
		제한사항
		s는 길이가 1 이상, 100이하인 스트링입니다.
		입출력 예
		s		return
		abcde	c
		qwer	we*/
		
		solution("asdf");
	}
	 public static String solution(String s) {
	      String answer = "";
	      if(s.length() % 2 == 0) {
	    	  System.out.println(s.length()/2);
	    	  System.out.println(s.substring(s.length()/2));
	      }else {
	    	  
	      }
	      return answer;
	  }
}
