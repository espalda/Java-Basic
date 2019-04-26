package Test;

import java.util.Scanner;

public class pr04 {

	public static void main(String[] args) {
		//** 구구단 출력 메서드
		//두수의 곱 출력
		//한단 출력
		//전체출력
		table();
	}
	public static void gu(int num1, int num2){
		int res = num1 * num2;
		System.out.println(num1+"x"+num2+"="+res);
	}
	
	public static void dan(int num){
		for(int i=1; i<=9; i++){
		gu(num,i);
		}
	}
	
	public static void table(){
		for(int i=2; i<=9; i++){
			dan(i);
		}
	}
	
	

}
