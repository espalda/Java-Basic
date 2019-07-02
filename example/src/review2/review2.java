package review2;

public class review2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10,100);
		mul(3);
	}
	public static int sum(int min, int max){
		int res = 0;
		for(int i=min; i<=max; i++){
			res+=i;
		}
		System.out.println(res);
		return res;
	}
	public static void mul(int num){
		int mul = sum(1,10) * num;
	}
}

/*
 * Static 클래스멤버메서드 vs 일반 멤버 메서드
 * Static 클래스멤버변수 vs 일반 멤버 변수
 * [Static]
 * 클래스와 객체 모두를 이용하여 호출한다. 객체 생성 없이 만들어진다.
 * 지역변수나 Static 멤버 변수만 사용할수 있다. 일반 멤버 변수는 사용 불가능 하다.
 * 객체 생성없이 사용가능한  Static과 일반 멤버 변수는 객체를 생성해야 할당되기 때문에 클래스를 이용하여 호출하는 경우 문제가 되기 때문에
 * static의 멤버변수는 클래스의 모든 객체가 공유한다.
 * 
 * [객체멤버메서드]
 * Static 메소드나 static 멤버변수를 사용할수있다.
 * 
 * 
 * 
 */
 class A{
	 int a;
	 static void b(){
		// a = 10; //사용 불가
	 }
 }	 
//class Test(){
//	public static void main(String [] args){
//		A.b();
//	}
//}
	
class B{
	static int cnt;
	void add(){
		cnt++;
	}
}



