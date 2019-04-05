package Test;

public class Scout {
	//클래스, 객체, 멤버변수, 멤버메소드, 객체변수, 클래스변수, 생성자, 생성자 오버로딩, this
		/*이름, 주소, 나이, 키, 몸무게 
		(name,address,age, height,weight) 를 
		가지는 선수 클래스(Player)를 선언하고 
	
		관리자(PlayerManager)는 
		-선수등록(insertData), 
		-전체보기(viewData), 
		-선수찾기(searchData)의 일을 한다고 하자. 
		관리자는 최대 30명의 선수를 관리한다.
		*/
	private int age;
	private int weight;
	private final int MAX_AGE = 30;
	private final int MAX_WEIGHT = 80;
	
	public static String TEAM = "QWERTY";
	
	public void age(){
		if(age > MAX_AGE);
			System.out.println("나이 초과");
	}
	public void weight(){
		if(weight > MAX_WEIGHT)
			System.out.println("무게 초과");
	}
	
	public void printAge(){
		System.out.println(age);
	}
	public void printWeight(){
		System.out.println(weight);
	}
	
/*	public Scout(int age, int weight){
		printAge(age);
		
	}*/
	
}	
