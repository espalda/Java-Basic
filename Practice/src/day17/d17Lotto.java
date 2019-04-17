package day17;

import java.util.*;

public class d17Lotto {

	public static void main(String[] args) {
		/* d17 로또
		 * 로또 당첨번호 생성 7자리
		 * 내 로또 번호 생성 6자리
		 * 당첨번호와 자동 번호를 비교해서 일치하는 갯수 확인
		 * 보너스 일치여부 확인
		 * 등수 출력
		 */
		int min=1, max=12;
		List<Integer> lotto = random(min,max,7);
		List<Integer> mine = random(min,max,6);
		System.out.println(lotto);
		System.out.println(mine);
		System.out.println(count(lotto,mine));
		print(lotto,mine);
	}
	/* 기능 : min, max가 주어지면 해당범위에서 중복되지 않는 랜덤한 수를 count 갯수 만큼 생성하여 리스트로 반환
	 * 매개변수 : min, max
	 * 리턴타입 : List
	 */
	public static List<Integer> random(int min, int max, int count){
		if(max-min+1 < count)
			//생성할수 있는 숫자의 범위보다 만들어야 하는 갯수가 더 크면
			//중복될수밖에 없기 때문에 무한루프에 빠지는 경우를 방지하기 위해서
			return null;
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() < count){
			int num = (int)(Math.random()*(max-min+1)+min);
			set.add(new Integer(num));
	}
		List<Integer> list = new LinkedList<Integer>(set);
		//set을 list로 변환하는 이유, 직접 접근할수 있는 set의 메서드에는 내가 원하는 번지에 직접 접근할수 있는 메서드가 없다
		return list;
	}
	/* 기능 : 로또 당첨번호와 내 번호가 보너스 번호를 제외하고 일치하는 갯수가 몇개인지 알려줌
	 * 매개변수 : 당첨번호 List<Integer> lotto
	 * 			내번호 List<Integer> mine
	 * 리턴타입 : int
	 */
	public static int count(List<Integer> lotto, List<Integer> mine){
		//당첨번호가 아닌 번호가 오면 -1 리턴후 종료
		if(lotto.size()<mine.size())
			return -1;
		int count = 0;
		for(int i=0; i<mine.size(); i++){ //보너스번호는 제외
			//비교해서 있으면 증가
			if(mine.contains(lotto.get(i))){
				count++;
			}
		}
		return count;
	}
	
	public static void print(List<Integer> lotto, List<Integer> mine){
		int count = count(lotto,mine);
		int rank =0;
		int bonusNum = lotto.get(lotto.size()-1);
		boolean bonus = mine.contains(bonusNum);
		switch(count){
		case 6: rank=1;break;
		case 5: rank=bonus?2:3;break;
		case 4: rank=4; break;
		case 3: rank=5; break;
		default: rank=-1;
		}
		if(rank>0)
			System.out.println(rank+"등 당첨");
		else
			System.out.println("꽝");
	}
}
