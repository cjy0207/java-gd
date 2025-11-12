package sec02.exam07;

import java.util.Scanner;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;

		boolean rel1 = num1 == num2;
		boolean rel2 = num1 != num2;
		boolean rel3 = num1 <= num2;

		System.out.println(rel1);
		System.out.println(rel2);
		System.out.println(rel3);

		char char1 = 'A';
		char char2 = 'B';
		boolean rel4 = char1 < char2;
		System.out.println(rel4);
		
		// Quiz
//		두개의 숫자를 입력받아
//		앞의 수가 크거나 같은 경우 true를
//		뒤의 수가 큰 경우는 false를 출력하는 프로그램을 구현하시오.
//
//		[입력]   [출력]
//		 1 2 => false
//		10 5 => true
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println((a>=b) ? true : false);
	}

}
