package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("say : ");
		String str = sc.nextLine();
		
		String result = str.equals("온다") ? "간다" : "온다";
		System.out.print("앵무새 : " + result);		
				

	}

}
