package day19;

public class Std {
	/* d19 학생 정보 관리 클래스
	 * String 객체멤버는 기본값이 null이기 때문에 "" 빈문자열로 명시적 초기화를 한다
	 * 초기화 순서
	 * 기본값 > 명시적 초기화 > 초기화 블럭 > 생성자
	 */
	private String name="";
	private String Sname="";
	private String id="";
	private String major="";
	private double avr;
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
	public void setAvr(double avr) {
		if(avr > 4.5 || avr < 0)
			return;
		this.avr = avr;
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
		Std other = (Std) obj;
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
	public Std(){}
	
	
	/* 복사 생성자 : 매개변수가 같은 클래스의 객체가 넘어오는 경우
	 * 오버로딩 : 한클래스 내에서 동일한 이름을 가지는 메서드나 생성자가 여러개 존재하는 경우
	 *			매개변수의 갯수가 다르다, 자료형이 다르다
	 * 생성자의 특징 : 클래스명과 동일하다, 리턴타입이 없다, 객체가 생성될때 new만 호출할수 있다
	 */
	public Std(Std s){
		this(s.name, s.Sname, s.id, s.major, s.avr);
		//복사 생성자는 아래에서 구현한 생성자 오버로딩을 호출 하여 코드의 중복을 제거함
	}
	

	/* 생성자 오버로딩
	 * 매개변수 name에 맴버변수 name을 저장해라
	 */
	public Std(String name, String Sname, String id, String major, double avr){
		this.name= name;
		this.Sname=Sname;
		this.id=id;
		this.major=major;
		this.avr=avr;
	}
	
	
	
}
