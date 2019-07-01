package day18;

import java.util.*;

public class d18generics1 {

	public static void main(String[] args) {
		//d18 제네릭 클래스
		//컬렉션프레임웍과 같이 사용
		//제네릭 클래스의 타입변수 제한방법, 와일드 카드
		Box<Integer> box = new Box<Integer>();
		Box<String> box2 = new Box<String>();
		Box<Object> box3 = new Box<Object>();
		
		/* 왼쪽에 인터페이스명, 오른쪽에는 왼쪽에 있는 인터페이스를 구현한 클래스
		 * 인터페이스,원시타입<Integer> test = new 클래스<Integer>();
		 * 왼쪽에 부모클래스, 오른쪽에는 자식클래스
		 * 부모클래스<Integer> test2 = new 자식클래스<Integer>();
		 */
		Set<Integer> set = new HashSet<Integer>();
		Box<Integer> b = new Box<>();
		b.add(10);
		b.add(20);
		System.out.println(b);
		System.out.println(b.size());
	}

}
class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item)		{ list.add(item);}
	T get(int i)			{ return list.get(i);}
	ArrayList<T> getList()	{ return list;}
	int size()				{ return list.size();}
	public String toString(){ return list.toString();}
}