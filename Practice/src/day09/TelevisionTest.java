package day09;

public class TelevisionTest {

	public static void main(String[] args) {
		// d9 클래스 만들기 television test
		// 기본 생성자를 이용한 객체 생성 후 초기화
		Television t1 = new Television();
		t1.printChannel();
		t1.printVolume();
		t1.printBrand();
		System.out.println(Television.BRAND);
		
		
		//생성자 오버로딩을 이용한 객체 생성 후 초기화
		Television t2 = new Television(100,15);
		t2.printChannel();
		t2.printVolume();
		
		
		// t3를 생성해서 t2의 값으로 초기화
		Television t3 = new Television(t2);
		t3.printChannel();
		t3.printVolume();
		t3.volumeDown();
		
		System.out.println("t3 볼륨감소 실행후 t3");
		t3.printVolume();
		System.out.println("t3 볼륨감소 실행후 t2");
		t2.printVolume();
		
		// t4를 생성하지 않고 t3의 다른이름으로 t4라 부른다
		Television t4 = t3;
		System.out.println("t3 볼륨감소 실행후 t4");
		t4.printVolume();

	}

}

