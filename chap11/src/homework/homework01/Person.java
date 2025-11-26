package homework.homework01;

public class Person {
	
	private String name;
	private int age;
	private String adress;
	private char gender;
	
	public Person() {}

	public Person(String name, int age, String adress, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", adress=" + adress + ", gender=" + gender + "]";
	}

	public String getNaem() {
		return name;
	}

	public void setNaem(String naem) {
		this.name = naem;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	

}
