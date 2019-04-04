package day05;

public class d5arr09 {

	public static void main(String[] args) {
		/* d5 로또 번호 생성기
		 * 로또 번호는 1~45사이의 랜덤한 수가 중복되지 않도록 7개 생성
		 * 1. 로또 배열을 생성하여 각 번지에 0~6을 순차적으로 저장
		 * 2. 로또 배열을 생성하여 각 번지에 1~45사이의 랜덤한 수를 저장
		 * 3. 배열에 해당 값이 있는지 없는지 검색
		 * 4. 로또 배열에 1~45사이의 중복되지 않은 랜덤한 수를 저장

		 * 1. 랜덤한 수를 생성
		 * 2. 생성된 수가 배열에 있는지 없는지 검색
		 * 3. 없으면 생성된 수를 배열에 저장하고 i증가
		 * 4. 있으면 저장하지 않고 건너 뛴다
		 */
		
		int [] arr = new int [7];
		int min = 1;
		int max = 7;
		for(int i=0 ; i<arr.length ; ){
				int r = (int)(Math.random()*(max-min+1) + min);
				boolean find = false;
				for(int j=0; j<arr.length; j++){
					if(arr[j] == r){
						find = true;
						break;
					}
				}
				if(!find){//find == false
					arr[i] = r;
					i++;
					
			}
		}		
		for(int k=0 ;  k<arr.length; k++){
			System.out.println(arr[k]);
		}
				
		 

	}

}
