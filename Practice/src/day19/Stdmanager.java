package day19;

import java.util.*;

public class Stdmanager {
	/* d19 
	 * 매니저 클래스는 학생 정보들을 관리하기 위한 저장공간이 필요
	 * 쉽게 정보를 관리하기 위한 컬렉션 프레임웍 필요
	 * 학생 정보들은 중복이 되면 안되기 때문에 Set 이용
	 * 학생 정보는 외부에서 직접 DB로 접근하면 안되기 때문에 접근 제한자가 private 이다
	 */
	private HashSet<Std> list = new HashSet<Std>();

	/* 기능 : 학생정보가 주어지면 해당 학생 정보가 List에서 중복되지 않아 추가했을 경우 성공
	 * 		중복되서 추가되지않으면 실패를 알려주는 기능
	 * 매개변수 : 학생정보 Std s
	 * 리턴타입 : boolean
	 * 메서드명 : insert
	 */
	public boolean insert(Std s){
	/* 매개변수 s를 그대로 넣으면 list와 외부에서 s를 같이 쓴다
	 * 복사생성자s와 동일한 값을 가지는 tmp 객체를 만든후 tmp를 list에 추가한다
	 */
		Std tmp = new Std(s);
		return list.add(tmp);
	/* add()라는 메서드
	 * true if this set did not already contain the specified element */
	}
	
	/* 기능 : 학생정보가 주어지면 list에서 학생정보와 일치하는 학생이 있으면 해당 학생 정보를 반환하는 기능
	 * 매개변수 : 학생정보 Std s
	 * 리턴타입 : 학생정보 Std
	 * 메서드명 : search 잘 모르겠다 search를
	 */
	public Std search(Std s){
		Iterator<Std> it = list.iterator();
		while(it.hasNext()){
			Std tmp = (Std)it.next();
			//list에서 꺼낸 tmp와 s를 같은지 equals로; 이용하여 비교한 후 같으면 꺼낸 tmp를 반환
			if(tmp.equals(s))	return tmp; //이걸 어떻게 생각해내냐
		}
		return null;//반복문이 종료될때까지 return이 안된것은 해당정보와 일치하는 객체가  list에 없는 경우이기 때문에 null값을  리턴한다
	}
	
	/* 기능 : 학생정보가 주어지면 list에서 해당 학생의 정보를 삭제하는 기능
	 * 		일치하는 학생정보가 있으면 삭제 없으면 실패 알려주는 기능
	 * 매개변수 : 학생정보 Std s
	 * 리턴타입 : boolean
	 * 메서드명 : delete
	 */
	public boolean delete(Std s){
		Std tmp = search(s);
		if(tmp==null)	return false;
		return list.remove(tmp);
		/* search()를 통해 검색했을 때 일치하는 정보가 있으면 객체 정보를 없으면 null값을 전달
		 * remove()는 tmp라는 객체와 일치하는 정보가 있으면 해당 정보를 삭제한후
		 * true의 값을 리턴하고, 없으면 false의 값을 리턴한다
		 */
	}
	
	/* 기능 : 학생정보가 주어지면 기존 학생 정보를 수정하고
	 * 		 수정 성공시 수정 여부를 알려주는 기능
	 * 매개변수 : 학생정보 Std s
	 * 리턴타입 : boolean
	 * 메서드명 : update
	 */
	public boolean update(Std s){
		//set 에서 수정을 하려면 기존에 있는 객체를 삭제 후 수정된 객체정보를 추가
		Std tmp = search(s);
		if(!delete(s))	return false;
		return insert(s);
		}
	

	/* 기능 : 전체 학생 정보를 출력하는 기능
	 * 매개변수 : 없음, 전체를 출력하기 때문에, 만약 한명이나 일정 부분을 출력해야 한다면 필요
	 * 리턴타입 : 없음 void
	 * 메서드명 : print
	 */
	public void print(){
		Iterator<Std> it = list.iterator();
		while(it.hasNext()){
			Std tmp = (Std)it.next();
			System.out.println(tmp);
		}
	}
	
	public void printMenu(){
		System.out.println("-----메 뉴-----");
		System.out.println("(1) 학생정보 추가");
		System.out.println("(2) 학생정보 수정");
		System.out.println("(3) 학생정보 삭제");
		System.out.println("(4) 학생정보 출력");
		System.out.println("(5) 종료");
		System.out.println("------------");
		System.out.print("메뉴를 입력해주세요 : ");
	}
	
	/* 기능 : Scanner를 통해 학생 학번을 입력받아 학생객체로 돌려주는 기능
	 * 매개변수 : Scanner
	 * 리턴타입 : 학생객체 Std
	 * 메서드명 : inputID
	 */
	public Std inputID(Scanner scan){
		System.out.println("----정보를 입력하세요---");
		System.out.print("학번 : ");
		String id = scan.next().trim();
		Std tmp = new Std();
		tmp.setId(id);
		return tmp;
	}
	
	public Std inputStd(Scanner scan){
		Std tmp = inputID(scan);
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("학교이름 : ");
		String Sname = scan.next();
		System.out.print("전공 : ");
		String major = scan.next();
		System.out.print("평점 : ");
		double avr = scan.nextDouble();
		System.out.println("-----------");
		
		tmp.setName(name);
		tmp.setSname(Sname);
		tmp.setMajor(major);
		tmp.setAvr(avr);
		
		return tmp;
	}
}











	

