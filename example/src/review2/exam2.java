package review2;

public class exam2 {
	/* [obj] 객체.일반멤버변수
	 * - 객체가 생성되어야 변수가 할당된다 = 객체가 생성되어야 변수를 사용할수 있다
	 * [num] static.클래스멤버변수
	 */
	int obj;
	static int num;
	

	public static void main(String[] args) {
		//obj = 10; 에러발생 = 객체 생성 없이 사용하기 때문에 에러 발생
			num = 11;
		/* 지역변수 : 메소드 안에서 선언되어 해당 메소드 안에서만 동작하는 변수로 위치에 따라 동작 범위가 다르다
		 * 현재 위치로부터 main 메서드 끝가지 사용가능
		 * 변수 선언 위치로 부터 해당 위치가 포함된 ()안에서만 사용가능
		 * 멤버변수 : 클래스가 가지고 잇는 변수로 static 여부에 따라 일반멤버변수(객체멤버변수) 클래스 멤버변수로 구분할수 있다
		 * i는 반복문 시작시 변수 선언이 되어 반복문 안에서 사용하며 반복문이 종료되면 사용할수 없다.
		 */
		
		
		int num1;
		for(int i=1;i<10; i++){
			int tmp;
		}
		/* tmp는 반복문 실행문 시작시 변수 선언이 되어 실행문 종료 후 사용할수 없다
		 * tmp는 반복문이 실행될때마다 값을 유지할수 없다
		 * tmp는 실행문이 실행될때마다 다시 생성된다*/
		
		/* 참조변수 = 객체: 변수가 일반 자료형으로 생성된 변수가 아닌 클래스를 이용하여 생성된 변수
		 * 모든 객체는 참조변수이다.
		 * 일반 변수는 값을 저장하지만 참조변수는 주소를 저장한다.
		 */
			Point1 p = new Point1();
			int num3 = 10;
			test(num3);
			System.out.println(num3);
			
			System.out.println(p);
			test(p);
			System.out.println(p);
			test2(p);
			System.out.println(p);
		}
	
	public static void test(int num){
		++num;
	}
	public static void test(Point1 p){
		p.move(1, 1);
	}
	public static void test2(Point1 p){
		p = new Point1();
		p.move(2, 2);
	}
}
