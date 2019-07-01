package day03;

public class d3exam2 {

	public static void main(String[] args) {
		/* d3 반복문 최소공배수
		 * 최소공배수 : 두 수의 공배수 중 가장 작은 공배수
		 * 공배수 : 두수의 배수 중 공통으로 포함한 배수
		 * break는 if문을 동반하며 break 문을 만나는 순간 반복문을 빠져나감
		 * continue는 if문을 동반하며 continue문을 만나는 순간 아래코드를 실행하지 않는다, skip과 동일
		 * if(i%2 ==1){continue = 해당 조건(홀수)을 skip한다}

		 * 10의 배수 10 20 30 40 50 ..
		 * 15의 배수 15 30 45 60 75 ..
		 * 10과 15의 공배수 30 60 90 12
		 * 10과 15의 최소 공배수 30
		 */
		
		//두수의 최소공배수를 구하는 코드
		int num1=100, num2=100;
		int i, lcm=0;
		for(i=1 ; i<=num1*num2 ; i+=1){ 
			if(i % num1 == 0 && i % num2 == 0){
				lcm=i;
				break;
			}
		}System.out.println("방법1 " + lcm);

		//두수의 최소공배수를 구하는 효율적인 코드
		for(i=num1 ; i<=num1*num2 ; i+=num1){
			if(i % num2 == 0){
				lcm=i;
				break;
			}
		}System.out.println("방법2 " + lcm);
			

		//두수의 최소공배수를 구하는 더 효율적인 코드
		int tmp;
		if(num2 > num1){ //두수를 바꿀때는 임시 변수가 필요
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		for(i=num1 ; i<=num1*num2 ; i+=num1){ 
			if(i % num2 == 0){
				lcm=i;
				break;
			}
		}System.out.println("방법3 " + lcm);
		
		
	}
}
