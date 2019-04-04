package Test;

import java.util.Scanner;

public class pr01 {

		public static void main(String[] args) {
			// stajun@naver.com 메일
			// 콘솔을 통해 3개의 정수를 입력받아 배열에 저장하는 코드 작성
			Scanner scan = new Scanner(System.in);
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();
			
			// 방법01
			int arr [] = new int [3];
			for(int i=0; i<3; i++){
				arr[0] = num1;
				arr[1] = num2;
				arr[2] = num3;
				 System.out.print(arr[i]+ " ");
			}
			
			// 방법02
			for(int i=0; i<3; i++){
				arr[0] = scan.nextInt();
				arr[1] = scan.nextInt();
				arr[2] = scan.nextInt();
				 System.out.print(arr[i]+ " ");
				 for(int tmp : arr)
					System.out.print(tmp+ " ");
					System.out.println();
				 
			// 방법03
			for(int j=0; j<arr.length; j++)
				arr[j] = scan.nextInt();
			for(int tmp : arr)
				System.out.print(tmp+ " ");
			System.out.println();
			scan.close();
			}	
		}
}
