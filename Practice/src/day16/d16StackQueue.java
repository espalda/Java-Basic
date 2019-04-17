package day16;

import java.util.*;

public class d16StackQueue {

	public static void main(String[] args) {
		/* d16 Stack과 Queue
		 * 스택은 마지막에 저장한 데이터를 가장 먼저 꺼내는 LIFO(last in first out) 역순차 구조
		 * 큐는 처음에 저장한 데이터를 가장 먼저 꺼내는 FIFO(first in first out) 순차 구조
		 * Queue : 인터페이스
		 * Queue 인터페이스를 구현한 클래스(Linked List)를 이용하여
		 * Queue 인터페이스의 객체를 생성할 수 있다
		 */
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		
		System.out.println("= Stack =");
		while(!st.empty()){	//비어있지않으면 아래 실행문 실행
			System.out.println(st.pop());
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()){
			System.out.println(q.poll());
		}
	}

}
