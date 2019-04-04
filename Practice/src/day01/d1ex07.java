package day01;

public class d1ex07 {

	public static void main(String[] args) {
		// 증감 : 하나씩 증가 ++, 하나씩 감소--
		// 전위형 : 증감을 하고 동작을 한다
		// 후위형 : 동작을 하고 증감을 한다.
		
		int num = 10;
		System.out.println("후위형 진행 : "+ num++);
		System.out.println("후위형 결과 : "+ num);
		//num = num + 1 = ++num, num++
		
		System.out.println("전위형 진행 : "+ ++num);
		System.out.println("전위형 결과 : "+ num);
		


	}

}
