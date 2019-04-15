package Test;

import java.util.Scanner;

public class pr02 {

	public static void main(String[] args){
		//d7 배열 스캐너
		//콘솔을 통해 3개의 정수를 입력받아 배열에 저장하는 코드 작성
		Scanner scan = new Scanner(System.in);
		int i;
		int arr [] = new int [3];
		for(i=0; i<arr.length; i++){
			arr[i]= scan.nextInt();
		}
		for(int tmp: arr){
			System.out.println(tmp);
		}
		
			
			
		
	}
	
}

