package day09;

public class d9Point {
	/* d9 클래스 Point
	 * 2차원 좌표의 점을 의미하는 Point class
	 * 필요한 멤버변수 : 부품, 요소
	 * 		x축의 값, y축의값

	 * 생성자 : 멤버변수 초기화
	 * 		x축의 값 0, y축의 값 0
	 * 		기본 생성자, 복사 생성자

	 * 필요한 멤버메서드 : 필요한 기능
	 * 		x축값과 y축값이 주어졌을때 멤버변수의값 변경
	 * 		현재 좌표 출력
	 * 		다른 점과의 거리 계산
	 */
		//멤버변수
		private int x;
		private int y;
	
		//생성자는 무조건 접근제한자가 public이어야함
		public d9Point(){
			x=0; y=0;
			//move(0,0);
		}
		public d9Point(int x, int y){
			this.x = x;
			this.y = y;
			//move(x,y);
		}
		public d9Point(d9Point p){
			this(p.x, p.y);
			//move(p.x, p.y);
		}
		
		
		//getter setter
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
		//x축값과 y축값이 주어졌을때 멤버변수의값 변경
		public void move(int x, int y){
			setX(x); //this.x= x;
			setY(y); //this.y= y;
		}
		//현재 좌표 출력
		public void print(){
			//(1,2)
			System.out.println("(" + x + ","+ y + ")");
		}
		
		/* 다른 점과의 거리 계산
		 * int dx = p.x - x; // x - this.x
		 * int dy = p.y - y; // y - thin.y
		 */
		public double distance(d9Point p){
			return distance(p.x,p.y);
		}
		public double distance(int x, int y){
			int dx = x - this.x; 
			int dy = y - this.y;
			return Math.sqrt(Math.pow(dx, 2.0)
					+ Math.pow(dy, 2.0));
		}
		public void moveUp(){y--;}
		public void moveDown(){y++;}
		public void moveLeft(){x--;}
		public void moveLight(){x++;}
}