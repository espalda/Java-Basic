package Test;

public class pr01 {
	//public 접근제한자 class = 누구나 접근할수 있는 클래스인 pr01
	public static void main(String[] args){
		//public 접근제한자 static 제어어 void 리턴타입 main메서드명
		//String[] 매개변수
		//매개변수의 다형성
	}
}

class Product{ //부모클래
	int price;
	int bonousPoint;
}

class Tv extends Product{ //부모 클래스 Product를 상속받는 Tv 자식 클래스
}
class Computer extends Product{ //부모 클래스 Product를 상속받는 Computer 자식 클래스
}
class Audio extends Product{ //부모 클래스 Product를 상속받는 Audio 자식 클래스
}
class Buyer{
	int money = 1000;
	int bonousPoint = 0;

	//오버로딩으로 구현
/*	void buy(Tv t){
		money = money - t.price;
		bonousPoint	= bonousPoint + t.price;
	}
	void buy(Computer c){
		money = money - c.price;	
		bonousPoint = `bonousPoint +c.price;
	}
	void buy(Audio a){
		money = money - a.price;
		bonousPoint = bonousPoint + a,price;
	}*/

	void buy(Product p){
		money -= p.price;
		bonousPoint += p.bonousPoint;
		//void앞에 생략된건 무엇인가.. default?
	}

}
	
	
	
			

