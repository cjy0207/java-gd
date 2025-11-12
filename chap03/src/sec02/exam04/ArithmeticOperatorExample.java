package sec02.exam04;

import java.util.Scanner;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		// 주로 짝수/홀수, 배수를 확인할 때 사용
		// 예) 3의 배수 확인 => 9 % 3 == 0 이 나오면 3의 배수
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = num-num%10;
		System.out.println(result);
				
	}

}
