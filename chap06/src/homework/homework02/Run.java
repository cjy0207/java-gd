package homework.homework02;

public class Run {

	public static void main(String[] args) {
		
		Person person1 = new Person("01012345678", 190.5, 100.2);
		Person person2 = new Person("01056434563", 175.4, 65.6);
		
		System.out.println("전화번호 : " + person1.numbers + ", 키 : " + person1.cm + ", 몸무게 : " + person1.kg);
		System.out.println("전화번호 : " + person2.numbers + ", 키 : " + person2.cm + ", 몸무게 : " + person2.kg);

	}

}
