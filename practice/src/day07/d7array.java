package day07;

import java.util.Scanner;

public class d7array {

		public static void main(String[] args) {
			//d7 배열 스캐너
			//콘솔을 통해 3개의 정수를 입력받아 배열에 저장하는 코드 작성
			Scanner scan = new Scanner(System.in);
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();
			
			int arr [] = new int [3];
			//방법1
			for(int i=0; i<3; i++){
				arr[0] = num1;
				arr[1] = num2;
				arr[2] = num3;
				 System.out.print(arr[i]+ " ");
			}
			
			//방법2
			for(int i=0; i<3; i++){
				arr[0] = scan.nextInt();
				arr[1] = scan.nextInt();
				arr[2] = scan.nextInt();
				 System.out.print(arr[i]+ " ");
				 for(int tmp : arr)
					System.out.print(tmp+ " ");
					System.out.println();
				 
			//방법3
			for(int j=0; j<arr.length; j++)
				arr[j] = scan.nextInt();
			for(int tmp : arr)
				System.out.print(tmp+ " ");
			System.out.println();
			scan.close();
			}	
		}
}
