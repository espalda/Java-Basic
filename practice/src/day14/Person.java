package day14;

public class Person {
	//d14 클래스 Person
	private String name;
	private int age;
	private String birth;
	private String gender;
	private String address;
	private String nationality;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getBirth() {
		return birth;
	}
	public String getGender() {
		return gender;
	}
	public String getAddress() {
		return address;
	}
	public String getNationality() {
		return nationality;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age >= 0)
		this.age = age;
	}
	public void setBirth(String birth) {
		if(birth == null || birth.length() !=8)
			return;
		/* yyyymmdd
		 * substring은 부분 문자열 추출로 (4,6)은 4번지와 5번지를 추출
		 * Integer 정수형 클래스
		 * Integer.parseInt 문자열 12를 정수 12로 변경
		 */
		String sMonth = birth.substring(4,6);
		Integer month = Integer.parseInt(sMonth);
		if(month>=1 && month<=12)
			this.birth = birth;
	}
	public void setGender(String gender) throws Exception{
		if(gender == null)
			throw new Exception("객체가 null값입니다");
		if(gender != null && (gender.equals("남성") || gender.equals("여성")));
		this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public Person(){
		/*name="";
		address="";
		nationality="";
		age=1;
		setGender("남자");
		setBirth("yyyymmdd");*/
		this("", "", "", "남자", "yyyymmdd", 1);
	}
	public Person(Person p){
		/*name=p.name;
		address=p.address;
		nationality=p.nationality;
		age=p.age;
		setGender(p.gender);
		setBirth(p.birth);*/
		this(p.name, p.address, p.nationality, p.gender, p.birth, p.age);
	}

	public Person(String name, String address, String nationality,
			String birth,  String gender, int age){
	this.name=name;
	this.address=address;
	this.nationality=nationality;
	this.age=age;
		//예외처리
		try{
		setGender(gender);
		}catch(Exception e){
			this.gender="남자";
		}
	setBirth(birth);
	
	}
}
