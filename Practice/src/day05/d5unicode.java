package day05;

public class d5unicode {

	public static void main(String[] args) {
		//d5 유니코드 값
		//abcd...z
		int numA = 'a';
		int numB = 'b';
		System.out.println(numA);	//문자 a에 대한 유니코드 정수값 97
		System.out.println(numB);	//문자 b에 대한 유니코드 정수값 98
		
		numA = 'A';
		numB = 'B';
		System.out.println(numA);	//문자 A에 대한 유니코드 정수값 65
		System.out.println(numB);	//문자 B에 대한 유니코드 정수값 66
	
		int num = 100;	//숫자 100은 유니코드 d
		System.out.println((char)num);
		
		//문제
		//97이 a라는 것을 이용하여 a~z까지 출력하는 예제
		for(int i=97; i<=97+25; i++){
			System.out.print((char)i);
		}
		System.out.println();
		//'a'부터 'z'까지 출력하는 예제
		for(int i='a'; i<='z'; i++){
			System.out.print((char)i);
		}
		System.out.println();
		for(int i=0; i<=25; i++){
			System.out.print((char)('a'+i));
		}
		
		
	}
}