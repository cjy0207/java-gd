package homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;

		do {
			System.out.println("게임을 실행합니다.");
			System.out.println("게임을 다시 실행하시겠습니까? yes/no");
			a = sc.nextLine();
		}while(a.equals("yes"));
		System.out.println("게임을 종료합니다.");
	}

}
