package Test;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	private String residentNum;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getResidentNum() {
		return residentNum;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if (age < 0 ) System.out.println(0);
		this.age = age;
	}
	public void setGender(String gender) {
		if (gender != "여" || gender != "남"){
			System.out.println("잘못된 입력입니다.");
		}
		this.gender = gender;
	}
	public void setResidentNum(String residentNum) {
		this.residentNum = residentNum;
	}

	
	
	
}
