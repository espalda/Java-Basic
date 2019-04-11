package day12;

public class Student{
	private String name;//name은 String이라는 class의 객체
	private int grade;
	private int classnum;
	private int num;
	private double kor;
	private double eng;
	private double math;
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public int getClassnum() {
		return classnum;
	}
	public int getNum() {
		return num;
	}
	public double getKor() {
		
		return kor;
	}
	public double getEng() {
		return eng;
	}
	public double getMath() {
		return math;
	}
	public void setName(String name) {
		/* 멤버변수 name에 매개변수 name을 저장해라
		 * 우선순위가 멤버변수보다 매개변수 또는 지역변수가 크기 때문에 
		 * name = name; 의미가 없다 매개변수 = 매개변수
		 * 원래는 이렇게 표현 하고 싶어했음 - 멤버변수(파란색) = 매개변수(입력값) 
		 * 매개변수 또는 지역변수의 이름이 멤버 변수와 동일한 경우
		 * 멤버변수와 매개변수(지역변수)를 구분하기 위해 this.을 붙인다 또는 자동완성기능을 사용하려고
		 * this : 나 현재 클래스
		 * . : 멤버변수나 멤버메서드를 호출하는 연산자로
		 * 		클래스나 객체명 다음에 온다
		 */
		if(name.length()<=5)
		this.name = name; //스튜던트 클래스 this.의 name 매개변수
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassnum(int classnum) {
		this.classnum = classnum;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setKor(double kor) {
		if(kor>=0 && kor<=100)//객체 매개변수 kor은 0보다 크거나 같고 100보다 작거나 같다
		this.kor = kor;
	}
	public void setEng(double eng) {
		if(eng>=0 && eng<=100)
		this.eng = eng;
	}
	public void setMath(double math) {
		if(math>=0 && math<=100)
		this.math = math;
	}
	/* 생성자 : 객체를 만들때 (new 연산자를 호출한 시점) 멤버변수를 원하는 값으로 초기화를 하고 싶을때 생성자를 구현해준다
	 * 생성자를 하나도 구현하지 않으면 기본생성자가 자동으로 만들어진다 public Student(){생략}
	 * 단, 생성자가 하나라도 구현되어 있으면 기본 생성자는 만들어지지 않는다
	 * 생성자는 기본생성자가 없으면 구현될수 없다 그래서 기본 생성자를 직접 구현해주어야한다
	 */
	public Student(){
		/*name = new String(); //name = "";
		grade = 1;
		classnum = 1;
		num = 1;*/
		init();
	}
	public Student (String name, int grade, int classnum, int num, double kor, double eng, double math){
		init(name, grade, classnum, num, kor, eng, math);
			
	}
	public Student(Student s){ //객체로 호출하기 위해서???
		init(s.name, s.grade, s.classnum, s.num, s.kor, s.eng, s.math);
	}
	
	//멤버변수를 초기화 하는 메서드
	public void init(){
		init("",1,1,1,0,0,0);
		//init(new String(),1,1,1,0,0,0)
	}
	public void init(String name, int grade, int classnum, int num, double kor, double eng, double math){
		//getter로 가져온 이유는  getter에서 설정한 조건문을 동일하게 적용시키기 위해서
		//this를 사용하는 이유는 자동완성 기능 때문에 여기서는 없어도 가능(this를 사용하는 2가지 이유 자동완성과 매개변수와 객체멤버변수를 구분하기 위해)
		this.setName(name);
		this.setGrade(grade);
		this.setClassnum(classnum);
		this.setNum(num);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}
	//toString 요약정리
	@Override
	public String toString() {
		return "Student [이름=" + name + ", 학년=" + grade + ", 반=" + classnum + ", 번호=" + num + ", 국어성적=" + kor
				+ ", 영어성적=" + eng + ", 수학성적=" + math + "]";
	}
}
	