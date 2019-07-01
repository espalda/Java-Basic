package day18;

import java.util.*;

public class d18generics2 {

	public static void main(String[] args) {
		//d18 제한된 제네릭 클래스
		FruitBox<Fruit> fBox = new FruitBox<>();
		
		
	}
}
	
class Fruit	implements Eat{}	//과일클래스
class Apple extends Fruit{}	//과일클래스를 상속받은 사과클래스
class FruitBox<T extends Fruit & Eat>{}	//과일박스 지네릭 클래스
//Eat 인터페이스를 구현하고  Fruit클래스를 상속받은 클래스만 타입변수 T로 올수 있다

interface Eat{}
