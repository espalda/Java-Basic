package day17;

import java.util.*;

public class d17bingo {

	public static void main(String[] args) {
		//d17 Bingo 11-22 p.633
		//Set set = new HashSet();
		Set set = new LinkedHashSet();
		int [] [] board = new int[5] [5];
		
		for(int i=0; set.size() < 25;i++){
			set.add((int)(Math.random()*50)+1+"");
		}
		
		Iterator it =set.iterator();
		for(int i=0;i<board.length;i++){
			for(int j=0; j<board[i].length; j++ ){
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] < 10 ? " " : " ")+board[i][j]);
			}
			System.out.println();
		}
	}

}
