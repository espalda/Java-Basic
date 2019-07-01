package day13;

public class d13review {

	public static void main(String[] args) {
		//d13 복습 배열
		//배열의 모든 값을 출력하는 코드를 작성
		int arr [] = new int [] {1,3,7,5,9,2,4,6,8};
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		//향상된 for문으로 전체를 쉽게 출력
		for(int tmp : arr){
			System.out.print(tmp+ " ");
		}
		System.out.println();
				
		//위의 배열에서 짝수 번지에 있는 값 출력
		for(int i=0; i<arr.length; i+=2){
				System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//위의 배열에서 가장 큰 수를 출력
		int max = arr[0];
		for(int tmp : arr){
			if(max < tmp){
				max = tmp;
			}
		}
		System.out.println(max);
		
		
	}

}
