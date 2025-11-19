package homework.homework05;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library lib = new Library();
		
		//1. printMessage
		System.out.print("출력할 메세지 : ");
		String str1 = sc.nextLine();
		lib.printMessage(str1);
		
		//2. sumToHundred
		lib.sumToHundred();
		
		
		//3. checkOddEven
		System.out.print("홀/짝 판단 여부 정수 입력 : ");
		int num1 = sc.nextInt();
		lib.checkOddEven(num1);
		sc.nextLine();
		

		//4. containsAlphabet
		System.out.print("문자열에 영문자 포함인지 확인 : ");
		String str2 = sc.nextLine();
		lib.containsAlphabet(str2);
		
		
		//5. countChar
		System.out.print("문자열 : ");
		String str3 = sc.nextLine();
		
		System.out.print("포함하는 문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		lib.countChar(str3, ch);
		
		
		//6. printGugudan
		System.out.print("입력하는 정수의 구구단 출력 : ");
		int num2 = sc.nextInt();
		lib.printGugudan(num2);

	}

}
