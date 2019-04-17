package day16;

import java.util.*;

public class d16ArrayList2 {

	public static void main(String[] args) {
		//d16 ArrayList 11-1
		ArrayList list1 = new ArrayList(10);	//list1에 배열리스트를 10개 만들겠다
		list1.add(new Integer(5));	//list1 객체에 5을 집어넣는다
		list1.add(new Integer(4));	//list1 객체에 4을 집어넣는다
		list1.add(new Integer(2));	//list1 객체에 2을 집어넣는다
		list1.add(new Integer(0));	//list1 객체에 0을 집어넣는다
		list1.add(new Integer(1));	//list1 객체에 1을 집어넣는다
		list1.add(new Integer(3));	//list1 객체에 3을 집어넣는다
		
		//생성자 오버로딩을 사용하기 위해서 매개변수가 List인 경우
		ArrayList list2 = new ArrayList(list1.subList(1,4)); //subList 부분적으로 가져오는것 1번지부터 4번지보다 작은갯수
		print(list1, list2);
		//list1은 5 4 2 0 1 3
		//list2는 4 2 0
		
		Collections.sort(list1);	//list1 정렬 0 1 2 3 4 5
		Collections.sort(list2);	//list2 정렬 0 2 4
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
		//list1에 list2가 포함되어 있는지
		
		list2.add("B");	//add는 insert : 해당번지에 넣기전에 값이 있으면 밀고난뒤 추가
		list2.add("C");
		list2.add(3,"A");
		print(list1, list2);	//list2에  B,C, 3번지에 A를 입력
		
		list2.set(3,"AA");	//set은 update : 해당번지에 덮어쓰기
		print(list1, list2);	//3번지의 값을 AA로 바꿔라
		
		//겹치는 내용이 있어서 삭제가 되면 true, 삭제가 안되면 false
		System.out.println("list1.retainsAll(list2): " + list1.retainAll(list2));
		print(list1, list2);
		/* 0번지부터 시작을 하면 remove()에 의해 삭제가 되어
		 * remove에 의해 삭제가 되면 확인해야 하는 내용이 있는 번지가 변경이 되어
		 * 확인하지 않은 원소가 생길수 있기 때문에 거꾸로 확인하면서 작업해야 한다
		 */ 
		for(int i= list2.size()-1; i>=0; i--){
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	}
		static void print(ArrayList list1, ArrayList list2){
			System.out.println("list1: "+list1);
			System.out.println("list2: "+list2);
			System.out.println();
	}

}
