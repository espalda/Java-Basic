package day11;

public class d11ex01 {

	public static void main(String[] args) {
		/* d11 익명 클래스 anonymous class
		 * 클래스의 선언과 객체의 생성을 동시에 하기 때문에 한번만 사용될수 있고
		 * 오직 하나의 객체만을 생성할수 있는 일회용 클래스이다
		 */
		
		print(new A (){
			public void test(){
				System.out.println("test");
			}
		});
	}
	public static void print (A a){
		a.test();
	}
}
interface A{
	void test();
}
/*class B implements A{
	public void test(){}
}
*/