package Test;

import day10.Point;

public class pr02 {

	public static void main(String[] args){
		tv t = new tv();
		 t.setting(400, 400);
		 tv t1 = new tv();
		 t1.print();
		 
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
		public void setChannel() {
			if(channel > 350)
				System.out.println("최대채널입니다");
			this.channel = channel;
		}
		public void setVolume() {
			if(volume > 100)
				System.out.println("최대소리입니다");
			this.volume = volume;
		}
		public void setReserve(String reserve) {
			this.reserve = reserve;
		}
		
		//현재 화면 정보 표시
		public void print(){
			System.out.println("현재 채널▶ "+ channel);
			System.out.println("현재 볼륨▶ "+ volume);
		}
		
	
		public void setting(int ch, int vol){
			System.out.println("설정 채널▶ "+ channel);
			System.out.println("설정 볼륨▶ "+ volume);
		}
		
		public void control(String ctl){
			switch(ctl){
			case "chUp" : channel++; break;
			case "chDown" : channel--; break;
			case "volUp" : volume++; break;
			case "volDown" : volume--; break;
			default : System.out.println("잘못된 입력입니다");
			}
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
			this.channel = channel;
			this.volume = volume;
			
			
		}
	
		
		
			
			
		
	
	
}

