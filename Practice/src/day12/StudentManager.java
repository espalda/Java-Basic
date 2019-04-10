package day12;

public class StudentManager {
	
	private Student std[];	//학생들 정보를 담을 배열
	private int count; 	//현재 저장된 학생 수
	private final int MIN_STUDENT_COUNT = 300;
	
	public StudentManager(){
		std = new Student[MIN_STUDENT_COUNT];	//std는 참조변수라 배열생성해야함
		//멤버변수 초기화 순서
		//기본값 → 명시적 초기화 → 초기화 블록 → 생성자
	}
	public StudentManager(int studentCnt){
		if(studentCnt >= MIN_STUDENT_COUNT)
			std = new Student[studentCnt];
		else
			std = new Student[MIN_STUDENT_COUNT];
	}
		/* 기능 : 학생정보를 배열에 추가
		 * 매개변수 : 학생정보 Student s
		 * 			String name, int grade,...
		 * 리턴타입 : void
		 * 메서드명 : insert
		 */
		public void insert (Student s){
			/* std[??] : Student 클래스의 객체는 초기에 선언만 되어있음
			 * insert 기능에서 객체정보를 추가하려면 객체를 생성한 후
			 * 매개변수의 값을 복사해야한다
			 * std[count++] = s;
			 * std[count]가 같이 사용하기 때문에 매개변수 s가 바뀌면
			 * std[count]도 같이 바뀔수 있다.
			 */
			std[count++] = new Student(s);
			//count++;
			
		}
	
		/* 기능 : 학생정보 전체 출력
		 * 매개변수 : 없음
		 * 리턴타입 : void
		 * 메서드명 : print
		 */
		public void print(){
			for(int i=0; i<count; i++){
				System.out.println(std[i]);
			}
		}
		
		/* 기능 : 학생정보를 수정 또는 삭제하기 위해서 학생정보가 있는지 파악하기 위해서
		 * 		학생정보를 검색해서 없으면 -1 있으면 배열에 위치한 번지를 알려주는 기능
		 * 매개변수 : 학년, 반, 번호 int grade, int classnum, int num
		 * 리턴타입 : -1 또는 번지 int
		 * 메서드명 : search
		 */
		private int search(int grade, int classnum, int num){//학년,반,번호를 통해서 검색하겠다
			for(int i=0; i<count; i++){
				if(std[i].getGrade() == grade &&
					std[i].getClassnum() == classnum &&
					std[i].getNum() == num){
					return 1;
				}
			}
			return -1;
		}
		
		/* 기능 : 학생정보를 배열에서 수정
		 * 매개변수 : 학생정보 Student s
		 * 리턴타입 : void
		 * 메서드명 : modify
		 */
		public void modify(Student s){ 
			int searchIndex
			= search(s.getGrade(), s.getClassnum(), s.getNum()); //검색했을 때 해당 정보가 있는 번지
			 if(searchIndex != -1){
				 std[searchIndex] = new Student(s);
			 }
			 
		}
		/* 기능 : 배열에서 학생정보를 삭제하는 기능
		 * 매개변수 : 학생정보 Student s
		 * 리턴타입 : void
		 * 메서드명 : delete
		 */
		
		public void delete(Student s){
			int searchIndex = search(s.getGrade(), s.getClassnum(), s.getNum()); //검색했을 때 해당 정보가 있는 번지
			 if(searchIndex != -1){
				 //배열을 밀기
				 for(int i=searchIndex; i<count-1; i++){//반복문을 생각못했다
					 std[i] = std[i+1];
				 }
				 std[count-1] = null;//없어도 상관없음
				 //현재 저장된 갯수를 하나 감소
				 count--;
				 
			 }
		}
		
		
		
		
	
}
