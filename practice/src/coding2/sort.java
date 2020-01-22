package coding2;

public class sort {

	public static void main(String[] args) {
		//d5 Bubble Sort
		//단순하고 효율이 가장 좋지 않다.
		int [] arr = new int []{1,3,5,7,9,2,4,6,8};
		//반복 횟수를 배열의 크기 -1
		for(int i=0; i<arr.length-1; i++){
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
				
	}

}
