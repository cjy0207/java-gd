package sec06.exam07;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("너비를 입력하시오 : ");
		int width = sc.nextInt();
		
		System.out.print("높이를 입력하시오 : ");
		int height = sc.nextInt();
		
		Ractangle r = new Ractangle(width, height);
		r.printInfo();
		
	}

}
