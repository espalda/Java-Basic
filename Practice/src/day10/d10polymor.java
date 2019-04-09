package day10;

public class d10polymor {

	public static void main(String[] args) {
		/* d10 매개변수의 다형성
		 * 상속과 다형성 중요
		 * 다형성 : 여러가지 형태를 가질수 있는 능력
		 * 한타입의 참조변수로 여러타입의 객체를 참조할수 있도록 함
		 * 참조변수의 형변화
		 * 자손타입은 조상타입으로 형변환시 자동형변환
		 * 조상타입은 자손타입에 명시적 형변환
		 */
		Tv t = new Tv();
		t.price =100;
		t.bonusPoint =1;
		Computer c = new Computer();
		c.price = 50;
		c.bonusPoint = 1;
		Audio a = new Audio();
		a.price = 200;
		c.bonusPoint = 5;
		Buyer buyer = new Buyer();
		
		buyer.buy(c);
		System.out.println("컴퓨터 구매후 차액 :"+ buyer.money);
		buyer.buy(a);
		System.out.println("오디오 구매후 차액 :"+ buyer.money);
		buyer.buy(t);
		System.out.println("Tv 구매후 차액 :"+ buyer.money);
		}
	}
	//매개변수의 다형성
class Product{	//부모클래스
	int price;
	int bonusPoint;
}
class Tv extends Product{}	//자식클래스1
class Computer extends Product{}	//자식클래스2
class Audio extends Product{}	//자식클래스3
	/* 원래는 매개변수로 Tv t 또는 Computer c, Audio a를 메서드 오버로딩으로 구현해야하지만
	 * 그럴 경우 Product를 상속받는 제품들이 많아지면 
	 * 추가해야할 메서드가 늘어난다. 그래서 각 클래스이 객체가 아닌 해당 클래스들의 부모인
	 * Product 클래스를 매개변수로 처리하면 public Product 클래스를 상속받은 제품들은 일괄처리가 된다
	 */	

class Buyer{
	int money = 1000;
	int bonousPoint = 0;
	
	void buy(Product p){	//오버로딩으로 구현할것을 매개변수의 다형성을 이용해서 일괄처리
		money -= p.price;	//부모클래스의 멤버변수이어야 한다
		bonousPoint += p.bonusPoint;
	}
}