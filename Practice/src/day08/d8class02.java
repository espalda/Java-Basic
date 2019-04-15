package day08;

public class d8class02 {

	public static void main(String[] args) {
		/* d8 클래스 Television
		 * Television 클래스
		 * t 참조변수 객체
		 */
		Television t = new Television();
		t.volumeUp();
		t.printVolume();
		t.printchannel(50);
		Television tt = new Television(50,20);
		tt.printVolume();
		tt.printchannel(4);
	}
}
class Television{
		/* 멤버 변수 : 부품, 요소
		 * 일반적으로 멤버 변수는 접근제한자를 private로 설정하여
		 * 멤버 변수를 직접 수정할 수 없게 하고, 멤버 메소드를 통해 수정하도록 한다
		 */		
			private int channel;
			private int volume;
			private final int MAX_CHANNEL = 100;
			private final int MAX_VOLUME = 100;
			
		/* 멤버메서드 : 기능
		 * 일반적으로 멤버 메서드는 접근제한자가 public 으로 설정
		 * 기능 : 멤버변수 volume의 크기를 하나 증가하는 메서드
		 * 매개변수 : 없음 void or 생략가능
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