package day05;

public class d5enhancedfor {

	public static void main(String[] args) {
		/* d5 향상된  for문
		 * for(자료형 변수명 : 배열이름){
		 *  	실행문;
		 * }
		 * 자료형은 배열과 같은 자료형을 써야 한다
		 * 필수는 배열이나 컬렉션프레임워크 일 때 사용
		 * 배열의 값을 확인할 때 사용 (배열의 값을 수정할 때는 사용하지 않음)
		 * 모든 배열을 확인, 단순 출력할 때 사용
		 * 모든 배열을 확인하면서 번지를 확인 할 필요가 없을 때
		 * for(int tmp : arr){
		 * System.out.println(tmp);
		 */
		int [] num = new int[]{1,2,3,4,5};
		for(int tmp : num){
			System.out.print(tmp + " "); 
		}	//tmp는 배열안에 있는 변수를 하나씩 꺼내오는 역할
		System.out.println();
		
		boolean find = false;
		int search = 6;
		for(int tmp : num){
				if(tmp == search){
					find = true;
					break;
				}
		}
		if(find){
			System.out.println("있음");
		}else{
			System.out.println("없음");
		}
		
		
		
	}

}
