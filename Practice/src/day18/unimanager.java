package day18;

import java.util.*;

public class unimanager {
	
	HashSet<university> set = new HashSet<university>();
	private int cnt = 300;
	/* 기능 : 학생정보를 추가하는 메서드
	 * 매개변수 : 학생정보
	 * 리턴타입 : 없음
	 */
	public void insert(university u){
		set.add(u);
	}
	

	/* 기능 : 학생정보를 검색해서 없으면 -1 있으면 배열에 위치한 번지를 알려주는 기능
	 * 매개변수 : int id
	 * 리턴타입 : -1 또는 번지 int
	 * 메서드명 : search
	 */
	 	private int search(int id){
			Iterator<university> it = set.iterator();
			for(int i=0; i<cnt; i++){
				while(it.hasNext()){
					return i;
				}
			}
			return -1;
		}
	
	/* 기능 : 학생정보 전체 출력
	 * 매개변수 : 없음
	 * 리턴타입 : void
	 * 메서드명 : print
	 */
		public void print(){
		System.out.println(set);
		
	}

}
