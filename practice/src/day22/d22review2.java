package day22;

import java.util.ArrayList;
import java.util.Collections;

public class d22review2 {

	public static void main(String[] args) {
		//1에서 6을 ArrayList에 순서대로 저장하고 해당 ArrayList를 섞는 코드를 작성
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int num = 0;
		while(list.size() < 6){
			num += 1;
			list.add(num);
		//for(int i=1; i<=6; i++){
		//list.add(i);}
		}
		System.out.println(list);
		
		//[코드 섞는 작업]
		//int num = (int)(Math.random()*(max-min+1)+min);
		int i;
		for(i=0; i<6 ;i++){
			int r = (int)(Math.random()*6);
			int tmp = list.get(r);		//set - 지정한 번지에 원하는 값을 넣는 함수
			list.set(r, list.get(i)); //r번지에 list.get(i) 를 넣는다.
			list.set(i, tmp);
		}System.out.println(list);
		
		
		//[방법 2]
		list.clear();
		for(i=1; i<=6; i++){
			list.add(i);
			}
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		
		
		
		
		
	}
}