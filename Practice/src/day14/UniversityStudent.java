package day14;

public class UniversityStudent extends Person {
	/* 부모클래스가 없으면 한 클래스에서 전부 다 입력해야함
	 * 부모클래스를 상속 받은 학생클래서, 교수클래스, 교직원클래스 등등 여러가지 클래스를 편하게 만들수 있다.
	 * 
	 */
	private String id;		//학번
	private String state;	//재학,졸업,휴학,수료
	private String major;	//전공
	private String universityName;	//학교이름
	private String advisor; //지도교수
	private double averageScore; //학점
	private int semester;
	public String getId() {
		return id;
	}
	public String getState() {
		return state;
	}
	public String getMajor() {
		return major;
	}
	public String getUniversityName() {
		return universityName;
	}
	public String getAdvisor() {
		return advisor;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public int getSemester() {
		return semester;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}
	public void setAverageScore(double averageScore) {
		if(averageScore >= 0)
		this.averageScore = averageScore;
	}
	public void setSemester(int semester) {
		if(semester > 0)
		this.semester = semester;
	}
	//생성자
	public UniversityStudent(){
		super();
		setSemester(1);
		setAverageScore(0.0);
		id="";
		advisor="";
		state="";
		universityName="";
		major="";
	}
	//복사생성자
	public UniversityStudent(UniversityStudent s){
		super(s); //자식클래스를 부모클래스로 형변환 가능
		setSemester(s.semester);
		setAverageScore(s.averageScore);
		id=s.id;
		advisor=s.advisor;
		state=s.state;
		universityName=s.universityName;
		major=s.major;
		
	}
	public UniversityStudent(String name, String address, String nationality,
			String birth,  String gender, int age, int semester,
			double averageScore, String id, String advisor,
			String state, String universityName, String major){
		super(name, address, nationality, gender, birth, age);
		this.setSemester(semester);
		this.setAverageScore(averageScore);
		this.id=id;
		this.advisor=advisor;
		this.state=state;
		this.universityName=universityName;
		this.major=major;
	}
}
