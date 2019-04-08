package day05;

public class d5ex07 {

	public static void main(String[] args) {
		// d5 버블정렬
		// 버블정렬 : 단순하고 효율이 가장 안 좋다
		int [] arr = new int []{1,3,5,7,9,2,4,6,8};
		// 반복 횟수를 배열의 크기 -1
		for(int i=0 ; i<arr.length-1; i++){
			for(int j=0; j<arr.length-1-i; j++){
				if(arr[j] < arr[j+1]){ //>오름차순, <내림차순
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		
		/*배열 = 같은 자료형 + 같은 의미
				- 시작번지는 0번지 부터 배열의 크기 -1 번지까지
				- 배열 선언
				- 자료형 [ ] 배열 이름 = new 자료형[배열의 크기];
				- 배열은 주로 반복문과 사용할수 밖에 없다.
				  > 번지를 접근할때 조심해야 한다.
					ArrayIndexoutofBoundsException
				향상된 for문을 쓸 수 있다.
				활용이 어려워..
				- 배열 내용 검색, 정렬하기*/
	}

}
