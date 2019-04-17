package day16;

import java.util.*;

public class d16Vector {

	public static void main(String[] args) {
		//d16 Vector List 11-3
		Vector v = new Vector(5);	//5개짜리 배열 리스트를 생성
		v.add("1");	//v객체에 1을 넣는다
		v.add("2"); //v객체에 2을 넣는다
		v.add("3"); //v객체에 3을 넣는다
		print(v);
		
		v.trimToSize();	//trimToSize 용량을 크기에 맞게 줄인다, 빈공간을 없앤다
		System.out.println("=== After trimToSize() ===");
		print(v);
		
		v.ensureCapacity(6); //ensureCapacity 최소용량을 설정한다
		System.out.println("=== After ensureCapacity(6) ===");
		print(v);
		
		v.setSize(7);	//setSize 저장된 객체의 갯수를 설정한다, 빈공간은 null값으로 설정
		System.out.println("=== After setSize(7) ===");
		print(v);
		
		v.clear();	//clear 삭제한다
		System.out.println("=== After clear() ===");
		print(v);
	}
	
	public static void print(Vector v)
	{
		System.out.println(v);
		System.out.println("size: "+ v.size());//현재사용하고 있는 크기
		System.out.println("capacity: "+ v.capacity()); //최대 용량 크기
	}
}
