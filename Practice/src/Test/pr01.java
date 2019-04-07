package Test;

public class pr01 {
			private int channel;
			private int volume;
			private final int MAX_C = 399;
			private final int MAX_V = 100;
				
			public void channalup(){
				if (channel < MAX_C) channel++;
			}
			public void channledown(){
				if (channel > 1) channel--;
			}
			public void setchannel(int ch){
				if(ch == 0) channel = 1;
				else if(ch > MAX_C) channel = MAX_C;
				else channel = ch;
			}
			
			public void volumeup(){
				if(volume < MAX_V) volume++;
			}
			public void volumedown(){
				if(volume > 0) volume--;
			}
			
			public void printvolume(){
				System.out.println("현재 볼륨 : "+ volume);
			}
			public void printchannel(){
				System.out.println("현재 채널 : "+ channel);
			}
			
			//생성자
			public pr01(){
				this(88,50);
			}
			public pr01(int channel, int volume){
				setchannel(channel);
				this. volume = volume;
			}
			public pr01(pr01 tv){
				this(tv.channel, tv.volume);
			}
			
			
			
}
