package day09;

public class LgTvTest1 {

	public static void main(String[] args) {
		// d9 생성자
		// 기본 생성자를 이용한 객체 생성 후 초기화
		LgTv t1 = new LgTv();
		t1.printChannel();
		t1.printVolumn();
		
		//생성자 오버로딩을 이용한 객체 생성 후 초기화
		LgTv t2 = new LgTv(100,15);
		t2.printChannel();
		t2.printVolumn();
		
		
		// t3를 생성해서 t2의 값으로 초기화
		LgTv t3 = new LgTv(t2);
		t3.printChannel();
		t3.printVolumn();
		t3.volumnDown();
		
		System.out.println("t3 볼륨감소 실행후 t3");
		t3.printVolumn();
		System.out.println("t3 볼륨감소 실행후 t2");
		t2.printVolumn();
		
		// t4를 생성하지 않고 t3의 다른이름으로 t4라 부른다
		LgTv t4 = t3;
		System.out.println("t3 볼륨감소 실행후 t4");
		t4.printVolumn();

	}

}

