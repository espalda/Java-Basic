package day19;

import java.util.*;

public class middlemng {
	
		private HashSet<middleStd> inform = new HashSet<>();
		
		/* 기능 : 중학생들의 정보를 추가하는 기능을 가진 메서드
		 * 매개변수 : 학생정보 middleStd
		 * 리턴타입 : 학생정보 middleStd
		 * 메서드명 : insert
		 */ 
		public middleStd insert(middleStd m){
			middleStd tmp = new middleStd(m);
			inform.add(tmp);
			return tmp;
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
		
		public middleStd delete(middleStd m){
				middleStd tmp = search(m);
				inform.remove(tmp);
				return tmp;
		
		}
		
		public middleStd update(middleStd m){
			//boolean 조건식에 delete(m)이라도 판별할수 있다.
			//결과 true, false로 나오는데 출력은 따로 하지 않지만 참 거짓이라는걸 저장하고 있다.
			//출력은 따로 설정해주는것
			if(delete(m) != null)
				return insert(m);
			return null;
		}
		
		
}




