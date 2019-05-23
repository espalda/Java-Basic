package day23;

import java.util.*;

public class CardRule {
	//오늘 이해할것!
	//원페어, 투페어, 트리플, 포커를 구하는 기능
	private static int sameCnt(ArrayList<Card> list, int count){
		int pareCnt = 0;	//한쌍의 개수
		for(int i=0; i<list.size(); i++){
			int cnt = 0;	//같은 숫자의 개수
							//2개의 숫자가 같으면 원페어
			for(int j=0; j<list.size(); j++){	//리스트에 저장된 i번지의 정보에서 num만 가져와서 비교하겠다.
				if(list.get(i).getNum() == list.get(j).getNum()){
					cnt ++;						//
				}
			}
			if(cnt == count) pareCnt++;
			
		}return pareCnt/count;
	}
	
	public static int pare(ArrayList<Card> list){
		return sameCnt(list,2);
	}
	public static int triple(ArrayList<Card> list){
		return sameCnt(list,3);
	}
	public static boolean poker(ArrayList<Card> list){
		if(sameCnt(list,4) == 1) return true;
		return false;
	}
		
}
