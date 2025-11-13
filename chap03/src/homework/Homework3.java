package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("친구 수 : ");
		int friend = sc.nextInt();
		System.out.print("사탕의  : ");
		int candy = sc.nextInt();
		
		int i = candy / friend;
		int j = candy % friend;
		
		System.out.println("1인당 사탕 개수: " +i);
		System.out.println("남은 사탕 개수 : " +j);
		
		

	}

}
