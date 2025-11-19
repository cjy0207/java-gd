package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567", "홍길동");
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
		p1.name = "임꺽정"; // nation, ssn은 final필드라 변경 불가. name만 가능
		System.out.println(p1.name);
		
		

	}

}
