package review2;

public class variaty {
	/* num1은 객체멤버변수로 객체가 생성되어야 변수가 할당된다.
	 * 그래서 객체가 생성되어야 변수를 사용할수있다.
	 * 객체 멤버베소드에서만 사용이 가능하다.
	 * num2는 클래스 멤버변수로 클래스를 통해 사용할수 있다.
	 * 
	 */
	int num1;
	static int num2;
	

	public static void main(String[] args) {
		//num1은 객체멤버변수이기 때문에 해당 객체가 선언되어 유효한 범위 내에서 사용가능하다.
		//num1 = 10; 에러발생
		num2 = 11;
		/* 지역변수 : 메소드 안에서 선언되어 해당 메소드 안에서만 동작하는 변수로 위치에 따라 동작 범위가 다르다.
		 * 변수 선언 위치로 부터 해당 위치가 포함된 ()안에서만 사용가능
		 * 멤버변수 : 클래스가 가지고 잇는 변수로 static 여부에 따라 일반멤버변수(객체멤버변수) 클래스 멤버변수로 구분할수 있다.
		 */
		int num1; //지역변수 - 변재위티부터 main 메서드 끝가지 사용가능
		//i는 반복문 시작시 변수 선언이 되어 반복문 안에서 사용하며 반복문이 종료되면 사용할수 없다.
		for(int i=1;i<10; i++){
			//tmp는 반복문 실행문 시작시 변수 선언이 되어 실행문 종료 후 사용할수 없다.
			//tmp는 반복문이 실행될때마다 값을 유지할수 없다.
			//tmp는 실행문이 실행될때마다 다시 생성된다.
			int tmp;
		}
		/*
		 * 참조변수 = 객체: 변수가 일반 자료형으로 생성된 변수가 아닌 클래스를 이용하여 생성된 변수
		 * 모든 객체는 참조변수이다.
		 * 일반 변수는 값을 저장하지만 참조변수는 주소를 저장한다.
		 */
			Point p = new Point();
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
	public static void test(Point p){
		p.move(1, 1);
	}
	public static void test2(Point p){
		p = new Point();
		p.move(2, 2);
	}
}
