package sec01.exam06;

import java.util.Objects;

public class Member implements Comparable<Member>{
	private String name;
	private int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	@Override
	public int compareTo(Member o) {
//		return this.age - o.age;
		
		if(this.age < o.age) return -1;
		else if(this.age > o.age) return 1;
		else return 0;
		
	}
	
	
}
