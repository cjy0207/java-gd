package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("say : ");
		String str = sc.nextLine();
		
		//변수 쪽에 equals를 호출하면, intput이 null일 경우 에외가 발생 할 수 있
		//String result = str.equals("온다") ? "간다" : "온다";
		
		//리터럴이나 상수를 앞에 두면,input에 null이 와도 안전하게 비교 가능(null-safe)
		String result = "온다".equals(str) ? "간다" : "온다";
		
		System.out.print("앵무새 : " + result);		
				

	}

}
