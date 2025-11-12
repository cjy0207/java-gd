package sec03.exam02;

import java.util.Scanner;

public class CastungExample {
	public static void main(String[] args) {
		
		int intVal = 44032;
		
		char charVal = (char) intVal;
		System.out.println(charVal);
	
		long longVal = 500;
		intVal = (int) longVal;
		System.out.println(intVal);
		
		double doubleVal = 3.14;
		intVal = (int) doubleVal;
		System.out.println(intVal);
		
		//Quiz
		Scanner sc = new Scanner(System.in);
		System.out.print("long 타입 입력변수: ");
		long number = sc.nextLong();
		System.out.print((int) number);
		
		
	}
}
