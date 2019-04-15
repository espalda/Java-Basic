package day09;

public class Car {
	//d9 클래스 Car
	private int speed;
	private boolean power;
	private char gear;
	private boolean frontLight;
	private boolean backLight;
	private int wiperSpeed;
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public char getGear() {
		return gear;
	}
	public void setGear(char gear) {
		this.gear = gear;
	}
	public boolean isForntLight() {
		return frontLight;
	}
	public void setFrontLight(boolean frontLight) {
		this.frontLight = frontLight;
	}
	public boolean isBackLight() {
		return backLight;
	}
	public void setBackLight(boolean backLight) {
		this.backLight = backLight;
	}
	public int getWiperSpeed() {
		return wiperSpeed;
	}
	public void setWiperSpeed(int wiperSpeed) {
		this.wiperSpeed = wiperSpeed;
	}
	
	//생성자는 무조건 접근제한자가 public이어야함
	public Car(){
		this.power = false;
		this.speed = 0;
		this.gear = 'P';
		this.frontLight = false;
		this.backLight = false;
		this.wiperSpeed = 0;
	}
	
	public void turnOn(){
		this.power = true;
	}
	
	public void turnOff(){
		if(speed == 0)
			this.power = false;
	}
	
	public void accCar(){
		if(power && (gear =='D'|| gear=='d')){
			speed++;
		}
	}
	
	public void breakCar(){
		if(power && (gear =='D'|| gear=='d')){
			speed--;
		}
	}
	
	public void turnFrontLight(){
		frontLight = !frontLight;
	}
	
	public void turnbackLight(){
		backLight = !backLight;
	}
	
	
	public void printCar(){
		System.out.println("-------------------");
		if(power)	System.out.println("시동: ON");
		else		System.out.println("시동: OFF");
		System.out.println("속도: "+ speed);	
		
		switch(gear){
		case 'P': 	System.out.println("기어: P");break;
		case 'D': 	System.out.println("기어: D");break;
		case 'R': 	System.out.println("기어: R");break;
		case 'N': 	System.out.println("기어: N");break;
		}
		
		if(frontLight) 	System.out.println("전방등: ON");
		else			System.out.println("전방등: OFF");
		
		if(backLight) 	System.out.println("후방등: ON");
		else			System.out.println("후방등: OFF");
		
		switch(wiperSpeed){
		case 0: 	System.out.println("와이퍼: 정지");break;
		case 1: 	System.out.println("와이퍼: 천천히");break;
		case 2: 	System.out.println("와이퍼: 보통");break;
		case 3: 	System.out.println("와이퍼: 빠름");break;
		}
		
		System.out.println("-------------------");
	}
	
	
	
	/* 1. 멤버변수를 설정 : 필요한 부품, 요소
	 * 		속도, 시동, 기어, 전방등, 후방등, 와이퍼속도
	 * 2. 생성자 생성 : 멤버변수 초기화
	 * 		속도 0, 시동 off, 기어 파킹, 전방등 후방등 off, 와이퍼속도 0
	 * 3. 멤버메서드 생성 및 구현 : 필요한 기능
	 * 		시동 켜기, 끄기
	 * 		엑셀 온, 브레이크 온
	 * 		전방등 온 오프, 후방등 온 오프
	 * 		와이퍼 제어
	 */
	
	
}
