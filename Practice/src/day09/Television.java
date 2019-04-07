package day09;

public class Television {
	// 같은 패키지내에서는 동일한 클래스명을 가진 클래스가 있으면 안된다
	// 일반 멤버변수, 객체 멤버변수
	private int channel;
	private int volume;
	private final int MAX_CHANNEL = 500;
	private final int MAX_VOLUME = 100;
	
	// 클래스 멤버변수
	public static final String BRAND = "LG";
	
	// 일반 멤버메서드, 객체 멤버메서드
	// 설계도
	public void channelUP(){
		if(channel < MAX_CHANNEL)
			channel++;
	}
	public void channelDown(){
		if(channel > 1)
			channel--;
	}	
	public void setChannel(int ch){
		if(ch == 0)
			channel = 1;
		else if(ch > MAX_CHANNEL)
			channel = MAX_CHANNEL;
		else
			channel = ch;
	}
	
	public void volumeUP(){
		if(volume < MAX_VOLUME)
			volume++;
	}
	public void volumeDown(){
		if(volume > 0)
			volume--;
	}
	
	public void printVolume (){
		System.out.println("소리크기: "+ volume);
	}
	public void printChannel (){
		System.out.println("채널번호: "+ channel);
		/* 객체 멤버메소드에는 클래스 멤버변수 또는 클래스 멤버메소드를 사용할수 있다
		 * System.out.println(BRAND);
		 */
	}
	public static void printBrand(){
		System.out.println("브랜드: "+ BRAND);
		/* 클래스 멤버메소드에는 클래스 멤버변수는 사용 가능하지만
		 * 객체 멤버변수는 사용할 수 없다
		 * System.out.println(channel);
		 */
	}
		/* 기본 생성자
		 * 멤버 메소드는 운하는 시점에서 호출이 가능하지만
		 * 생성자는 객체를 생성할 때에만 호출한다
		 * 객체멤버변수를 초기화한다
		 */
		public Television() {
			this(8, 10);
			//channel = 1;
			//volume = 10;
		}
		// 기본 생성자가 있어야 생성자 오버로딩으로 설정 가능함
		public Television(int channel, int volume) {
			setChannel(channel);
			if(volume > MAX_VOLUME)
				this.volume = MAX_VOLUME;
			else
				this.volume = volume;
		}
		// 복사 생성자
		public Television(Television stv){
			this(stv.channel, stv.volume);
			//channel =stv.channel;
			//volume = stv.volume;
			
		}
}