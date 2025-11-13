package sec02.exam10;

import java.util.Scanner;

public class AssignmentOpratorExample {

	public static void main(String[] args) {
		int result = 10;
		
		result +=10;
		System.out.println("result = "+result);
		
		result -= 5;
		System.out.println("result = "+result);
		
		result *= 3;
		System.out.println("result = "+result);
		
		// Quiz
//		금액을 입력받아 500원, 100원, 50원, 10원, 1원 동전으로 변경하려고 합니다.
//		최소 필요한 동전의 개수를 출력하는 프로그램을 구현하시오.
//
//		[입력]
//		5640
//
//		[출력]
//		500원: 11개
//		100원: 1개
//		50원: 0개
//		10원: 4개
//		1원: 0개
		
		
		Scanner sc = new Scanner(System.in);
		
		int price = sc.nextInt();
		
		int num1 = price/500;
		int num2 = (price%500)/100;
		int num3 = (price%100)/50;
		int num4 = (price%100)/10;
		int num5 = (price%100)%10;
		
		System.out.println("500원 = "+num1);
		System.out.println("100원 = "+num2);
		System.out.println("50원 = "+num3);
		System.out.println("10원 = "+num4);
		System.out.println("1원 = "+num5);

	}

}
