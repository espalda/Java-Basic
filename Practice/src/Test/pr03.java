package Test;

import java.util.*;

public class pr03 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add("abcc");
		//객체가 다르면 중복을 파악할수가 없다
		//그럴때는 hashcode & equals를 사용한다
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		System.out.println(set);
		
	}
}
class Person{
	String name;
	int age;
	
	//생성자
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//toString
	public String toString() {
		return name+ ": "+ age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
