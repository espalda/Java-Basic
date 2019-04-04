package day08;

public class d8class02 {

	public static void main(String[] args) {
		Tv t = null;
		t = new Tv();
			
	}
}

class Tv{
		
		/* Tv 클래스
		 * t 참조변수 객체
		 * 멤버변수는 접근제한자를 private으로 주로 설정하며 다른 클래스에서 접근 불가)
		 * 접근제한자를 private으로 설정시 멤버변수를 정의하고 멤버메서드를 통해 수정하도록 한다
		 * 멤버변수 : 요소(감옥, Tv), 파란색
		 */			
		private int channel;
		private int volumn;
		private final int MAX_CHANNEL = 100;
		private final int MAX_VOLUMN = 100;
		
		/* 멤버메서드 : 기능(면회, 리모컨)
		 * 일반적으로 멤버 메서드는 접근제한자가 public 으로 설정
		 * 기능 : 멤버변수 volume의 크기를 하나 증가하는 메서드
		 * 매개변수 : 없음 void, 생략
		 * 리턴타입 : 없음 void
		 * 메서드명 : volumn
		 */
		
		public void volumnUp(){
			if(MAX_VOLUMN > volumn)
				volumn++;
			}
		public void volumnDown(){	
			if(volumn > 0)
				volumn--;
			}
		public void printVolumn(){
			System.out.println(volumn);
		}
			
		/* 기능 : 멤버변수 channel의 크기를 하나 증가 또는 감소 또는 변경하는 메서드
		 * 매개변수 : 없음 void, 생략
		 * 리턴타입 : 없음 void
		 * 메서드명 : channel
		 */
		
		public void channelUp(){
			if(MAX_CHANNEL > channel)
				channel++;
			}
		public void channelDown(){	
			if(channel > 0)
				channel--;
			}
		public void printchannel(int ch){
			channel = ch;
		}
		
		
		
		
}