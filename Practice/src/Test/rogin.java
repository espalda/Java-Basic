package Test;

import java.util.*;

public class rogin {
	
	public static void main(String[] args){
	/* 예제) 쇼핑몰
	아이디와 패스워드를 입력하고 일치 하면 구매목록에 추가
	아이디: espalda  패스워드: 123456
	class : shop - 생성자를 통해 쇼핑몰 이름을 선언
	Method : login - 로그인 ,
	                buy - 로그인 성공 시 String 값으로 물품을 입력 받아 물품 이름 출력,
	                current - 쇼핑몰 이름과 현재 로그인한 계정 출력 */
	
	}
}	
/* 01 설정  : 쇼핑몰의 ID와 PW를 콘솔에서 입력 받고 콘솔에서 입력받은 값과 저장된 값이 일치하면
 * 		로그인에 성공하셨습니다. 출력 
 */
class mall{
	private String id;
	private String pw;
	
	//private이기 때문에 getter setter 설정이 필요
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		if(pw.length() < 5){
			System.out.println("6자리 이상으로 설정해주세요");
		}
		this.pw = pw;
	}
	
	/* 기능 : 스캐너로 id와 pw를 입력받는 기능
	 * 멤버변수 : scan
	 * 리턴타입 : boolean 입력 성공시 - 로그인 되었습니다. 환영합니다 문구 출력
	 * 					입력 실패시 - id 또는 pw가 잘못되었습니다
	 * 메서드명 : Scanner
	 */
	
	public boolean Scanner(Scanner scan){
		String id = scan.next();
		String pw = scan.next();
		return true;
	}
	
	
}


	
	
	
			

