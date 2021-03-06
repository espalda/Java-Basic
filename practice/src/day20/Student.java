package day20;

import java.util.*;

public class Student {
	/* d19 학생 정보 관리 클래스
	 * String 객체멤버는 기본값이 null이기 때문에 "" 빈문자열로 명시적 초기화를 한다
	 * 초기화 순서
	 * 기본값 -> 명시적 초기화 -> 초기화 블럭 -> 생성자
	 */
	
	private String name="";
	private String Sname="";
	private String id="";
	private String major="";
	private double avr;
	private ArrayList<Grade> subjectList = new ArrayList<>();
	
	//private이라 접근할수 없어서 getter와 setter를 생성
	public String getName() {
		return name;
	}
	public String getSname() {
		return Sname;
	}
	public String getId() {
		return id;
	}
	public String getMajor() {
		return major;
	}
	public double getAvr() {
		return avr;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	//toString()
	//객체정보를 문자열로 쉽게 출력하기 위해서, 메서드 오버라이딩
	@Override
	public String toString() {
		return "학생 [이름=" + name + ", 학번=" + id + ", 학교이름=" + Sname + ", 전공=" + major + ", 평점=" + avr + "]";
	}
	
	/* hashCode(), equals()
	 * set을 이용하여 학생정보를 관리할것인데 set은 중복을 허용하지 않고
	 * 중복확인을 hashCode()와 equals()를 통해 검사하고
	 * hashCode()와 equals()가 없으면 부모인 Object를 이용하기 때문에
	 * id를 이용하여 중복검사 실행

	 * 다른 변수들은 중복될수 있지만 id 즉 학번은 중복될수 없기 때문에 id가 같으면 같은 hash그룹에 있게 하기 위해서
	 * equals()가 id가 중복됬는지 확인하고 
	 * id가 같으면 같은 그룹에 넘겨주는 역할을 하는게 hashCode()
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	/* 기본생성자는 자동으로 생성되지만 다른 생성자를 만들면 기본생성자가 사라져요 
	 * 명시적 초기화에서  String을 초기화 했지만 다른 생성자를 만들꺼고 기본생성자를 이용해서
	 * 객체를 만들 상황이 있을수도 있기 때문에 기본생성자를 생성했다 
	 */
	public Student(){}
	
	
	/* 복사 생성자 : 매개변수가 같은 클래스의 객체가 넘어오는 경우
	 * 오버로딩 : 한클래스 내에서 동일한 이름을 가지는 메서드나 생성자가 여러개 존재하는 경우
	 *			매개변수의 갯수가 다르다, 자료형이 다르다
	 * 생성자의 특징 : 클래스명과 동일하다, 리턴타입이 없다, 객체가 생성될때 new만 호출할수 있다
	 */
	public Student(Student s){
		this(s.name, s.Sname, s.id, s.major, s.avr, s.subjectList);
		//복사 생성자는 아래에서 구현한 생성자 오버로딩을 호출 하여 코드의 중복을 제거함
	}
	
	/* 생성자 오버로딩
	 * 매개변수 name에 맴버변수 name을 저장해라
	 */
	public Student(String name, String Sname, String id, String major, double avr, ArrayList<Grade> subjectList){
		this.name= name;
		this.Sname=Sname;
		this.id=id;
		this.major=major;
		this.avr=avr;
		this.subjectList = subjectList;
	}
	
	/* 기능: 학생이 수강과목을 입력하면 subjectList에 추가
	 * 매개변수 : grade
	 * 리턴타입 : 
	 * 메서드명 : insertSubject
	 */
	public void insertSubject(Grade grade){
		subjectList.add(grade);
		calcAvr();
	}
	
	/* 기능 : 과목 리스트에 있는 과목들의 평점을 계산
	 * 매개변수 : 실행에 필요한 외부 정보
	 * 			없다 = 과목정보는 멤버변수 subjectList에 있기 때문에 없다
	 * 리턴타입 : 알려줘야하는 정보, 평점을 멤버변수  avr에 저장하기 때문에 알려줄 필요가 없고
	 * 			없다 = 평점에 대한 정보를 확인하려면 getAvr()을 호출하면 된다
	 * 메서드명 : calcAvr
	 */
	public void calcAvr(){
		/* 계산후 avr에 저장
		 * 1. 리스트에 있는 과목들을 하나씩 가져옴 (반복문을 이용해서)
		 * 2. 해당과목에서 받은 성적을 이용하여 계산
		 * 2-1. pass인 경우 해당 학점을 계산에 추가하지 않고 따로 학점만 저장한다
		 * 2-2. 그 외의 성적은 해당 과목에 대한 평점을 구하고 평점과 학점을 곱한 값을 누적시키고 학점도 누적시킨다.
		 * 3. 반복문이 종료되면 평점과 학점을 누적시킨 값에 누적시킨 학점으로 나눈후 avr에 저장 
		 */
	Iterator<Grade> it = subjectList.iterator();
	int sumUnit = 0;
	double sumPoint = 0.0;
	while(it.hasNext()){
		//리스트에서 과목을 하나 끄집어 냄
		Grade tmp = it.next();
		if(tmp.getStep().equals("p"))
			continue;
		//평점과 학점을 곱한 값을 누적
		sumPoint += tmp.getPoint()*tmp.getUnit();
		//평점을 누적
		sumUnit += tmp.getUnit();
	}
		avr = sumPoint/sumUnit;
	}
	
	public boolean printSubjects(){
		if(subjectList.size() ==0)
			return false;
		Iterator<Grade> it = subjectList.iterator();
		while(it.hasNext()){
			Grade tmp = it.next();
			System.out.println(tmp);
		}
		return true;
	}
}
