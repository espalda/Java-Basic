package coding1;

public class question1 {

	public static void main(String[] args) {
		/*
		 문제 설명
		 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
		 s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
		
		 제한 사항
		 str은 길이 1 이상인 문자열입니다.
		 입출력 예
		 s			return
		 Zbcdefg	gfedcbZ
		 
		
		//아스키 코드로 변환 후 숫자를 비교해서 큰 숫자가 앞으로 가게 하는 기능
		//아스키 코드 알파벳 시작 문자열 : A 65 z 122
		char st = 66;
		System.out.println(st);
		int st1 = 66;
		System.out.println((char)st1);
		String st2 = "66";
		System.out.println(st2);
		char st3 = 'A';
		System.out.println((int)st3);*/
		solution("Pabcde");
	}
	//1. 문자열의 0번지를 아스키코드 번호로 변환하는 기능구현
	//2. 문자열의 1번지를 아스키코드 번호로 변환하는 기능구현 후 1번과 비교하는 기능 구현
	//3. 현재번지와 이전번지를 비교하여 이전번지의 아스키코드 값이 크면 위치를 바꾸는 기능 
	 public static String solution(String s) {
		 for(int i=0; i<=s.length()-1; i++) {
			 char pre = s.charAt(i);
			 char next = s.charAt(i+1);
			 System.out.println("i = "+ i + ", pre = "+ (int)pre+pre + ", next = "+ (int)next+next);
			 if((int)pre < (int)next) {
				 char tmp = pre;
				 pre = next;
				 next = tmp;
			 }
		 }
		  
	      return s;
	  }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public String ascii(String ss) {
		char start = 65;
		while(true){
			if(start == 91)
				start = 97;
				String str = String.valueOf(start);
				System.out.print(str);
				start++;
			
				if(start > 122)
					break ;
		}
		return ss;
	 }

}
