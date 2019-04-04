package day05;

public class d5ex01 {

	public static void main(String[] args) {
		// d6 이중반복문과 break
		int i,j;
		for(i=1 ; ; i++){
			if(i>3){
				break;
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
