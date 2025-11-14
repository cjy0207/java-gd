package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("세 번째 정수 : ");
		int num3 = sc.nextInt();
		
		int result = 0;
		
		if(num1 > num2) {
			if(num2 > num3) result = num3;
			else result = num2;
		}else {
			if(num1 > num3) result = num3;
			else result = num1;
		}
		
		System.out.print("세 수 중에 가장 작은 수는 " + result);

	}

}
