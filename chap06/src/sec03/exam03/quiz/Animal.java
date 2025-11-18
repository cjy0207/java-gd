package sec03.exam03.quiz;

public class Animal {

	String kind;
	int age;

	Animal(String kind, int age) {
		this.age = age;
		this.kind = kind;
	}
	
	Animal(String kind) {
		this.kind = kind;
		age = 1;
	}
	
	Animal(int age) {
		kind = "사람";
		this.age = age;
	}

	public void info() {
		System.out.println(kind + ": " + age + "살");
	}
}
