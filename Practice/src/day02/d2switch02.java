package day02;

public class d2switch02 {

	public static void main(String[] args) {
		//d2 switch 홀수짝수
		//switch문으로 홀수 짝수 구분
		int num = 9;
		switch(num % 2){
		case 0:		//=if(num % 2=0}
			System.out.println("짝수");;
			break;
		//..
		//case 1:	//=default:
		default:
			System.out.println("홀수");;
			break;
		}
		
	}

}
