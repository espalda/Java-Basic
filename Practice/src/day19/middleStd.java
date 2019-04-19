package day19;

public class middleStd {

	//d19 중학생들의 학생관리
	//필요한 변수 정의 : 이름, 학년, 반, 번호
	private String name;
	private int grade;
	private int classNum;
	private int stdNum;
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public int getCalssNum() {
		return classNum;
	}
	public int getStdNum() {
		return stdNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(int grade) {
		if(grade > 3) return;//메서드를 강제종료하겠다
		this.grade = grade;
	}
	public void setCalssNum(int calssNum) {
		if(classNum > 6) return;
		this.classNum = calssNum;
	}
	public void setStdNum(int stdNum) {
		this.stdNum = stdNum;
	}
	
	//toString 간편하게 출력하기 위해서!
	@Override
	public String toString() {
		return "중학학생정보 이름-" + name + ", 학년-" + grade + ", 반-" + classNum + ", 번호-" + stdNum;
	}
	
	//나는 stdNum으로 학생들을 구별하겠다!
	//hashCode로 그룹을 만들고 equals로 비교하겠다
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stdNum;
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
		middleStd other = (middleStd) obj;
		if (stdNum != other.stdNum)
			return false;
		return true;
	}
	
	//기본생성자
	public middleStd(){};
	
	//복사생성자
	public middleStd(middleStd m){
		this(m.name, m.grade, m.classNum, m.stdNum);
	}
	
	//오버로딩 생성자
	public middleStd(String name, int grade, int classNum, int stdNum){
		this.setName(name);
		this.setGrade(grade);
		this.setCalssNum(classNum);
		this.setStdNum(stdNum);
		
				
	}
	

	

}
