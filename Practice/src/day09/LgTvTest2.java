package day09;

public class LgTvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LgTv tv = new LgTv();
		tv.printVolumn();
		LgTv tv2 = new LgTv();
		tv2.printChannel();
		LgTv tv3 = tv;
		System.out.println(LgTv.BRAND);
	}
	
	/* 클래스멤버와 객체멤버
	 * - 객체멤버
	 * 객체가 생성된 후에 사용할 수 있다 =new Tv
	 * 객체.멤버변수, 객체.멤버메서드로 호출
	 * 객체멤버는 만들어진 객체마다 가지고 있다

	 * - 클래스멤버
	 * 객체의 생성 없이 사용할수 있다
	 * 클래스.멤버변수, 클래스,멤버메서드로 호출
	 * 클래스멤버는 하나씩만 만들어진다
	 * Static 붙고 공유된다
	 */

}