package homework.homework08;

public class Employee {

	private int empNo;
	private int age;
	private int salay;

	private double bonus;

	private char gender;

	private String empName;
	private String dept;
	private String job;
	private String phone;
	private String adress;

	public Employee() {

	}

	public Employee(int empNo, String empName) {

	}

	public Employee(int empNo, int age, int salay, double bonus, char gender, String empName, String dept, String job,
			String phone, String adress) {
		this.empNo = empNo;
		this.age = age;
		this.salay = salay;
		this.bonus = bonus;
		this.gender = gender;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.phone = phone;
		this.adress = adress;
	}

	public void setEmployee(int empNo, String empName, String dept, String job, int age, char gender, int salay,
			double bonus, String phone, String adress) {

		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salay = salay;
		this.bonus = bonus;
		this.phone = phone;
		this.adress = adress;
	}

	public void getEmployee() {
		System.out.println("사원번호: " + empNo);
		System.out.println("이름: " + empName);
		System.out.println("부서: " + dept);
		System.out.println("직급: " + job);
		System.out.println("나이: " + age);
		System.out.println("성별: " + gender);
		System.out.println("급여: " + salay);
		System.out.println("보너스율: " + bonus);
		System.out.println("전화번호: " + phone);
		System.out.println("주소: " + adress);
	}

}
