package day12;

public class d12StudentTest {
	/* d12 클래스 Student test
	 * 한 학교에서 학생 전체를 관리하기 위한 프로그램
	 * 학생의 이름, 학년, 반, 번호, 국어성적, 영어성적, 수학성적 등을 관리
	 * 학생 정보 추가, 학생 정보 수정, 학생 정보 삭제, 학생 정보 출력 기능 
	 */
	public static int MAX_STUDENT_COUNT = 300;	
	public static void main(String[] args) {
		/* Student라는 클래스의 std 라는 객체멤버변수로 객체를 선언하고 new로 객체를 생성하고 Student()로 생성자를 호출한다
		 * 생성자는 기본생성자가 자동으로 만들어진다
		 * 그러나 내가 임의로 생성자를 만들었을 때 기본생성자는 사라지기 때문에 기본생성자를 내가 직접 수동으로 만들어줘야 한다
		 * [배열로 만들기] 예시
		 * Student [] std = new Student [MAX_STUDENT_COUNT];
		 * String [] name = new String [MAX_STUDENT_COUNT];
		 * int [] grade = new int [MAX_STUDENT_COUNT];
		 */

		d12StudentManager stdMng =
				new d12StudentManager(MAX_STUDENT_COUNT);
		stdMng.insert(new d12Student("A",1,1,1,100,90,80));
		stdMng.insert(new d12Student("D",1,1,1,100,90,80));
		stdMng.insert(new d12Student("B",1,1,2,100,90,80));//객체를 생성했는데 이름이 없다 = 익명개체
		stdMng.print();
		System.out.println("----------------");
		
		stdMng.modify(new d12Student("C",1,1,2,100,100,100));
		stdMng.print();
		System.out.println("----------------");
		
		stdMng.delete(new d12Student("",1,2,1,0,0,0));
		stdMng.print();
	}
	public static void printMenu(){
	
	}

	
}


