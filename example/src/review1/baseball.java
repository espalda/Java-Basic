package review1;

public class baseball {

	public static void main(String[] args) {
		
		//컴퓨터의 카드를 랜덤으로 생성해서 배열에 저장
		int i;	//변수 i 선언
		int[] com;	//배열 com 선언
		com = new int[3];	//배열 com을 length 3짜리 배열로 생성
		for(i=0; i<com.length; ){	//3개를 채울 때까지 반복
			int r = (int)(Math.random()*(9-1+1) + 1);	//1부터 9까지 랜덤한 수를 생성해서 r에 저장
			boolean find = false; //플래그 선언
			for(int j=0; j<com.length; j++){	//배열 com의 현재 길이만큼 실행
				if(com[j] == r){	//배열 com을 0번지부터 꺼내서 임의의 수 r과 비교
					find = true;	//같다면 boolean 변수 find에 true를 저장
					break;	//해당 반복문을 빠져나감
				}
			}
			if(!find){ //find의 값이 false면 : 새로 뽑은 임의의 수가 배열 안에 없다면	
				com[i] = r;	//com의 i번지에 임의의 수 r을 저장
				i++;	//i를 하나 증가시켜 다음 임의의 수를 생성
			}
		}
		//유저 카드 생성
		int[] user = new int[]{3,6,2};	//스캐너를 통해 입력받아 배열에 추가하거나 직접 값을 초기화하여 배열을 생성
		
		//예외처리
		if(com.length < user.length || com.length > user.length){			//com과 user의 크기가 다를 경우 리턴
			System.out.println("카드의 개수가 맞지 않습니다.");
			return ;														
		}
		
		//스트라이크 계산
		int strike = 0;					//스트라이크 변수 선언 후 초기화
		for(i=0; i<user.length; i++){	//0번지부터 2번지까지 반복
			if(user[i] == com[i]){		//배열 user의 i번지 값과 배열 com의 i번지 값이 같다면(스트라이크)
				strike++;				//strike를 하나 증가
			}
		}
		//볼 계산
		int ball = 0;	//변수 ball을 선언 후 초기화
		int count = 0;	//변수 count를 선언 후 초기화
		for(i=0; i<com.length; i++){	//배열 com의 0번지부터 배열 user의 0~2번지를 비교
			for(int j=0 ; j<user.length; j++){	
				if(com[i] == user[j]){	//배열 com의 i번지 값이 배열 user에 들어있다면
					count++;	//count를 하나 증가
				}
			}
		}
		ball = count-strike;	//count에서 strike를 뺀 값을 변수 ball에 저장
		
		System.out.print("컴퓨터 : ");
		for(i=0; i<com.length ; i++){	//배열 com의 값을 0번지부터 하나씩 꺼내서 출력
			System.out.print(com[i]);
		}
		System.out.println();
		System.out.print("유저 : ");
		for(i=0; i<user.length ; i++){	//배열 user의 값을 0번지부터 하나씩 꺼내서 출력
			System.out.print(user[i]);	
		}
		System.out.println();
		System.out.println("strike : " + strike + " , ball = " + ball);	//볼과 스트라이크를 출력
		if(strike == 3){
			System.out.println("3strike로 승리하였습니다.");
		}
				
				
	}
	
	}
