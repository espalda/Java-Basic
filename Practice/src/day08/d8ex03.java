package day08;

import java.util.Scanner;

public class d8ex03 {

	public static void main(String[] args) {
		// d8 메서드 return
		}
	
		/* 반복문
		 * 메서드에서 리턴값이 있을 경우 유의사항
		 * 조건문을 통해 return 할 경우 조건문이 거짓인 경우 고려
		 * 반복문 안에서 return할 경우 반복문 조건이 거짓이 되어 실행되지 않을 경우 고려
		 */
		public static int tes (){
			int r =0;
			for(int i=1; i<=9; i++){
				r += i;
				return r;
				
			}
			// 반복문이 무조건 실행되서 리턴이 되는 경우라 하더라도 자바 컴파일러는
			// 자세히 검사하지 않아서 반복문 종료시 리턴 설정 해야함
			return 0;
		}
		// 조건문
		public static int test (int num){
			if(num >= 0) return 1;
			//else if(num <0) return -1; 에러코드
			else return -1;
		}
		
		public static int abs(int abs){
			int num = abs;
			if(num<0){
				num = -abs;
			}
		return num;
		}
		
}
