package day17;

import java.util.*;

public class d17ballgame {

		public static void main(String[] args) {
			/* 1 컴퓨터 - 1에서 9사이의 3개의 중복되지 않는 3개의 숫자 선택 random 메서드
			 * 2 반복문 -
			 * 3 숫자를 3개 입력받아서 List에 저장
			 * 4 스트라이트 갯수 계산 ==>새로운 메서드
			 * 5 볼 갯수 계산 ==> count 갯수 확인
				countList()를 계산후 스트라이트 갯수를 빼면
				볼의 갯수
				count()는 스크라이크 + 볼의 갯수
			 * 6 출력
			 */
			List<Integer> computer = d17lotto.random(1, 9, 3);
			System.out.println(computer);
			List<Integer> user = new LinkedList<Integer>();
			int strike =0;
			int ball =0;
			Scanner scan = new Scanner(System.in);
			while(strike<3){
				user.clear(); //매번 입력받은 값들이 누적되어 3개가 초과되기 때문에 다음 실행시 초기화
			user = input(scan);
			strike = getStrike(computer, user);
			ball = d17lotto.count(computer, user) - strike;
			print(strike, ball);
			}
			
			System.out.println("정답입니다");
			System.out.println("프로그램을 종료합니다");
			scan.close();
		}
		//숫자 동일한지는 그렇다 쳐도, 자리위치가 동일한것은 어떻게? index of를 사용하지 않고도?
		public static int getStrike(List<Integer>com, List<Integer>user){
			int count =0;
			for(int i=0; i<com.size(); i++){
				/* List.get()은 객체를 반환하기 때문에 com.get(i)==user.get(i)로 작성하면
				 * 객체의 주소가 같은지 확인하기 때문에 equals로 값이 같은지 확인
				 */
				if(com.get(i).equals(user.get(i)))
					count++;
			}
		return count;
		}
		
		public static void print(int strike, int ball){
		if(strike != 0) System.out.println(strike+ "STRIKE");
		if(ball != 0) System.out.println(ball+ "BALL");
		if(strike == 0 && ball == 0) System.out.println("3OUT");
		System.out.println();
		}
		
		public static List<Integer> input(Scanner scan){
			/*Set<Integer> set = new HashSet<Integer>();
			while(set.size() < 3){
				int num = scan.nextInt();
				set.add(num);
			}
			Iterator<Integer> it = set.iterator();
			List<Integer> list = new LinkedList<Integer>();
			while(it.hasNext()){
				list.add(it.next());
			}*/
			List<Integer> list = new LinkedList<Integer>();
			while(list.size() < 3){
				int num = scan.nextInt();
				list.add(num);
				}
			return list;
		}
}