package day22;

import java.util.HashSet;
import java.util.Scanner;

public class d22review1 {

	public static void main(String[] args) {
		//스캐너와 컬렉션 프레임워크를 이용하여 중복되지 않는 6개의 정수를 입력받는 코드 작성
		Scanner scan = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size() < 6){
			int num = scan.nextInt();
			set.add(num);
		}
		System.out.println(set);
		
		/* for(int i=1; i<=6 ; i++){
		 * i = scan.nextInt();
		 * set.add(i);
		 * } System.out.println(set);
		 */
		scan.close();
		
		
		}
		

		
	}
