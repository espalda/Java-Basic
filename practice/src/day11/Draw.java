package day11;

public interface Draw {
	//d11 인터페이스 Draw
	//도형을 그리기 기능 대신 콘솔에 정보를 출력하는 기능으로 대체
	void print();//default 앞에 생략, 같은 패키지 내에서 사용 가능, 생략가능
	//도형의 크기 재설정
	void resize(double width, double height);
	//도형을 이동시키는 기능
	void move(int x, int y);
	
	default void test(){
		/* 디폴트 메서드
		 * 추상메서드의 기본적인 구현을 제공하는 메서드로
		 * 추상메서드가 아니기 때문에 디폴트 메서드가 새로 추가 되어도
		 * 해당 인터페이스의 구현한 클래스를 변경하지 않아도 된다.
		 */
		
	}
}
