package day16;

import java.util.HashMap;
import java.util.Scanner;

public class d16HashMap {

	public static void main(String[] args) {
		/* d16 HashMap 11-30
		 * hashing을 사용하면 많은 양의 데이터를 검색하는데 뛰어난 성능을 보인다
		 * map에서 put 메서드는 (key, value)
		 */
		HashMap map = new HashMap();
		map.put("sandol","1234");
		map.put("asdf","1111");
		map.put("asdf","1234");	//key값이 중복되면 value의 값을 덮어쓴다
		
		Scanner sc = new Scanner(System.in);
		while(true){ //조건식 true면 무한루프
			System.out.println("id와 pw를 입력해주세요.");
			System.out.print("id: ");
			String id = sc.nextLine().trim(); //trim 문자열의 모든 공백제거, id에 공백을 입력할 수 없도록
			
			System.out.print("pw: ");
			String pw = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)){	//저장된 id가 없으면 아래처럼 출력
				System.out.println("입력하신 id는 존재하지 않습니다." + " "
						+ "다시 입력해주세요");
				//continue;
			}else{	//id가 입력받은 id와 일치하는  value를 입력받은 password 와 비교하여 같이 않으면
					//입력받은 비밀번호와 id의 비밀번호가 같지않으면
				if(!(map.get(id)).equals(pw)){	//아이디와 비밀번호가 일치하지 않으면
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
				}
				//일치하면 반복문을 종료 후 프로그램 종료
				else{
					System.out.println("id와 비밀번호가 일치합니다.");
					break;	//while 반복문을 빠져나온다
				}
			}
		}
	}
}
