package day18;

import java.util.*;

public class university {

	private static char[] set;
	private Gender gender;
	private Major major;
	private Grade grade;
	private String name;
	private Integer id;
	private String universityName;
	private double average;
	public Gender getGender() {
		return gender;
	}
	public Major getMajor() {
		return major;
	}
	public Grade getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}
	public Integer getId() {
		return id;
	}
	public String getUniversityName() {
		return universityName;
	}
	public double getAverage() {
		return average;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void setMajor(Major major) {
		this.major = major;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(Integer id) {
		
		this.id = id;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
	
	public university() {
		gender = Gender.MALE;
		grade = Grade.FRESHMAN;
		major = Major.NONE;
	}
	public university(university u){
		this(u.gender, u.grade, u.major, u.name, u.id);

	}					
	public university(Gender gender, Grade grade, Major major, String name, Integer id){
		this.gender = gender;
		this.grade = grade;
		this.major = major;
		this.name = name;
		this.id = id;
	}
	
	

	@Override
	public String toString() {
		return "university [gender=" + gender + ", major=" + major + ", grade=" + grade + ", name=" + name + ", id="
				+ id + ", universityName=" + universityName + ", average=" + average + "]";
	}
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
		university other = (university) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
