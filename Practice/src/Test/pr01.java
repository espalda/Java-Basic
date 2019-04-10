package Test;

public class pr01 {
	//누구나 접근할수 있는 public이라는 접근제한자를 가진 pr01이라는 클래스를 생성
	public static void main(String[] args){
		//static 리턴타입 void의 메인이라는 메서드 선언부를 작성했다
		String s = new String("hello world");
		//String이라는 자료형의 s라는 객체를 정의하고
		//Hello world라는 객체를 생성했다!
		
		System.out.println(s);
		System.out.println(s.charAt(9));
		System.out.println(s.indexOf("w"));
		System.out.println(s.contains("world"));
	
	}
}

	
	
	
			

