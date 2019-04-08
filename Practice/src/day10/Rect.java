package day10;

public class Rect extends Shape {
	
	private int area;
	
	public int getArea() {//getter만 만드는지 이유, 넓이는 다른정보를 이용하지 않으므로 setter x
		return area;
	}
	
	//기본생성자설정
	public Rect(){}
	//생성자오버로딩, 복사생성자
	public Rect(int x, int y, int w, int h){
		super(x,y,w,h); //부모클래스의 생성자 호출
		area =  w * h;
	}
	
	@Override
	//부모클래스의 생성자를 재정의, 변경
	public void print(){
		super.print();//부모클래스의 print메서드 호출
		System.out.println("넓이: "+ area);
	}
	public void resize(int width, int height){
		this.width = width;
		this.height = height;
		area = width * height;
	}
}
