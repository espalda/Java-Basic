package day19;

import java.util.*;

public class middlemng {
	
		private HashSet<middleStd> inform = new HashSet<>();
		
		/* 기능 : 중학생들의 정보를 추가하는 기능을 가진 메서드
		 * 매개변수 : 학생정보 middleStd
		 * 리턴타입 : 학생정보 middleStd
		 * 메서드명 : insert
		 */ 
		public boolean insert(middleStd m){
			middleStd tmp = new middleStd(m);
			return inform.add(tmp);
		}
		
		public void print(){
			System.out.println(inform);	
		}
		
		/* 기능 : 
		 * 매개변수 : 학생정보
		 * 리턴타입 : 학생정보
		 * 메서드명 : search
		 */
		
		public middleStd search(middleStd m){
			if(inform.contains(m)){
				return m;
			}
			else
				return null;
	
		}
		
		public boolean delete(middleStd m){
				middleStd tmp = search(m);
				return inform.remove(tmp);
		
		}
		
		public boolean update(middleStd m){
			return insert(m);
		}
}




