package sec01.exam04.quiz;

import java.util.Objects;

public class Student {
	private int studentNo;
	private String name;
	private String major;

	public Student(int studentNo, String name, String major) {
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}

	@Override
	public String toString() {
		return "[학번=" + studentNo + ", 이름=" + name + ", 전공=" + major + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, studentNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentNo == other.studentNo;
	}

}
