package day05;

public class d5arr06 {

	public static void main(String[] args) {
		/* d5 배열 임시 비밀번호
		 * a~z, A~Z, 0~9로 조합된 8자리의 임시 비밀번호 발급 예제
		 * 0~9 10개
		 * a~z 26개
		 * A~Z 26개
		 * 총 62개, 배열 공간은 0~61개
		 * 0~9 : '0'~'9' 숫자를 문자로 처리, 배열은 자료형이 같아야 하기 때문에
		 * 10~35: 'a'~'z'
		 * 36~61 : 'A'~'Z'
		 * 랜덤한 수가 60 = 'Y'
		 */
		char [] pw = new char [8];
		for(int i=0 ; i<pw.length ; i++){
				int r = (int)(Math.random()*62);
				if(r<=9){//문자 + 정수 = 정수
						//문자 = 정수(불가능)
						//문자 = (char)정수;(가능)
					pw[i] = (char)('0'+r);
				}else if(r<= 35){
					pw[i] = (char)('a'+(r-10));
				}else{
					pw[i] = (char)('A'+(r-36));
				}
		}
		
			System.out.println(pw);
		
	}

}
