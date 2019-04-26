package Test;

import java.util.Scanner;

public class pr02 {

	public static void main(String[] args){
		tv t = new tv();
		t.inform(8,5);
		mani(2);
		
	}
	public static void mani(int num){
		System.out.println(num);
	}	
}
	
	class tv{
		private int channel;
		private int volume;
		private String reserve;
		public int getChannel() {
			return channel;
		}
		public int getVolume() {
			return volume;
		}
		public String getReserve() {
			return reserve;
		}
		public void setChannel(int channel) {
			if(channel > 350)System.out.println("최대채널입니다");
			this.channel = channel;
		}
		public void setVolume(int volume) {
			if(volume > 100)System.out.println("최대소리입니다");
			this.volume = volume;
		}
		public void setReserve(String reserve) {
			this.reserve = reserve;
		}
		
		//현재 화면 정보 표시
		public void inform(int ch, int vol){
			System.out.println("현재 채널▶ "+ ch);
			System.out.println("현재 볼륨▶ "+ vol);
			
		}
		
		//생성자
		public tv(){
			this.channel = 10;
			this.volume = 5;
		}
		public tv(tv t){
			this(t.channel, t.volume);
		}
		public tv(int channel, int volume){
			this.channel = getChannel();
			this.volume = getVolume();
			
		}
	
		
		
			
			
		
	
	
}

