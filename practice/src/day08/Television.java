package day08;

public class Television {

		/* d8 클래스 Television
		 * 클래스는 멤버변수와 멤버메서드로 이루어짐
		 * 정보를 편하게 관리하기 위해서 클래스를 생성
		 * 클래스 : 설계도
		 * 객체(인스턴스) : 제품
		 * 메서드 : 기능
		 
		 * 클래스 객체명 = new 클래스();
		 * 객체명.멤버변수;
		 * 객체명.멤버메서드;
		 * 주로 멤버변수는 private, 멤버메서드는 public 으로 설정
		 */
		
		private int channel;
		private int volume;
		private final int MAX_CHANNEL = 100;
		private final int MAX_VOLUME = 100;
			
		/* 기능 : 멤버변수 volume의 크기를 하나 증가하는 메서드
		 * 매개변수 : 없음 void
		 * 리턴타입 : 없음 void
		 * 메서드명 : volume
		 */
		public void volumeUp(){
			if(MAX_VOLUME > volume)
				volume++;
			}
		public void volumeDown(){	
			if(volume > 0)
				volume--;
			}
		public void printVolume(){
			System.out.println(volume);
		}
			
		/* 기능 : 멤버변수 channel의 크기를 하나 증가 또는 감소 또는 변경하는 메서드
		 * 매개변수 : 없음 void or 생략가능
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
			System.out.println(channel);
		}
		
		//생성자
		public Television(){
			this(100,30);
		}
		public Television(int ch, int vol){
			this.channel=ch;
			this.volume=vol;
		}
		
		
}