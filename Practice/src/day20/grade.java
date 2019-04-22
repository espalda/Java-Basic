package day20;

public class grade {
	/* d20 성적의 세분화
	 * 등급, 교수, 과목명, 학점
	 */
	private gradeStep step;		//등급
	private String professor;	//교수
	private String title;		//과목명
	private int unit;			//학점
	
	
	public String getStep() {
		switch(step){
		case Ap: return "A+";
		case A: return "A";
		case Bp: return "B+";
		case B: return "B";
		case Cp: return "C+";
		case C: return "C";
		case Dp: return "D+";
		case D: return "D";
		case pass: return "P";
		default: return "F";
		}
	}
	public String getProfessor() {
		return professor;
	}
	public String getTitle() {
		return title;
	}
	public int getUnit() {
		return unit;
	}
	public void setStep(String step) {
		switch(step){
		case "A+": 	this.step = gradeStep.Ap; 	break;
		case "A": 	this.step = gradeStep.A; 	break;
		case "B+": 	this.step = gradeStep.Bp; 	break;
		case "B": 	this.step = gradeStep.B; 	break;
		case "C+": 	this.step = gradeStep.Cp; 	break;
		case "C": 	this.step = gradeStep.C; 	break;
		case "D+": 	this.step = gradeStep.Dp; 	break;
		case "D": 	this.step = gradeStep.D; 	break;
		case "P": 	this.step = gradeStep.pass; break;
		case "fail":this.step = gradeStep.fail; break;
		default:	this.step = gradeStep.F;	break;
		}
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public void init(String step, String prifessor, String title, int unit){
		setStep(step);
		setProfessor(professor);
		setTitle(title);
		setUnit(unit);
		/* 멤버변수 초기화
		 * 생성자는 객체가 생성된 이후에 초기화 할수 있지만
		 * init은 딱히 상관없다.
		 */
	}
	public grade(){}
	public grade(String step, String prifessor, String title, int unit){
		init(step, professor, title, unit);
	}
	public grade(grade g){
		init(g.getStep(), g.professor, g.title, g.unit);
		//들어가야할 매개변수의 타입은 String, String, String, int
		//g.step은 매개변수의 타입이 달라서 g.step은 자료형이 gradeStep
	}
	
	public double getPoint(){
		switch(step){
		case Ap: return 4.5;
		case A: return 4;
		case Bp: return 3.5;
		case B: return 3;
		case Cp: return 2.5;
		case C: return 2;
		case Dp: return 1.5;
		case D: return 1;
		case pass: return 0;
		default: return 0;
		}
	}
	@Override
	public String toString() {
		return "강의 [등급=" + step + ", 교수=" + professor + ", 강의명=" + title + ", 학점=" + unit + "]";
	}
	
	
}
