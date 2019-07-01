package day05;

public class d5break {

	public static void main(String[] args) {
		//d6 이중반복문 break
		int i,j;
		for(i=1 ; ; i++){
			if(i>3){
				break;
				//조건문if를 감싸는 반복문을 빠져나온다
			}
			for(j=1 ; ; j++){
				if(j>5){
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
