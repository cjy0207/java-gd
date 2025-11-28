package sec01.exam02;

import java.util.Objects;

//Comparable<T>
//자바에서 객체 간의 "기본 정렬 순서"를 정의하기 위해 사용되는 인터페이스
//객체를 정렬할 수 있도록 비교 기준을 정의
public class Student implements Comparable<Student>{
	
	private String name;
	private int age;
	
	public Student() {}

	public Student(String name, int age) {
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
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student other) {
		// 증요! 리턴값의 의미(오름차순을 기준으로 함)
		//음수 : this < other - this가 앞에 온다.
		//양수 : this > other - this가 뒤에 온다.
		//0 : this = other - 순서를 유지한다.
		//즉, 양수면 자리를 바꾸고, 음수나 0이 나오면 자리 그대로
		
		//나이 오름차순
		// 25-30 = -5 => 음수 : 25세가 앞에 감
		//return this.age - other.age;
		
		//나이 내림차순
		// 30 - 25 = 5 => 양수 : 그대로
		//return other.age - this.age;
		
		//권장 : 나이 오름차순을 비교 연산으로 구현 시
		//확장성이 좋은 코드
//		if(this.age < other.age) return -1;
//		else if(this.age > other.age) return 1;
//		else return 0;
		
		//문자열은 연산자로 비교 불가능
		//String 클래스에 재정의 된 compareTo() 사용
//		return this.name.compareTo(other.name); //오름차순
		return other.name.compareTo(this.name); //내림차순 : 순서 바꾸기 or -1곱하기
		
		
	
	}
	

}
