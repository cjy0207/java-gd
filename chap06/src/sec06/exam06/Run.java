package sec06.exam06;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오 : ");
		String name = sc.nextLine();
		
		Member m = new Member();
		m.changeName(name);
		m.printName();

	}

}
