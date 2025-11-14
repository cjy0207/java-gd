package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		 while(true) {
			 System.out.print("입력 : ");
			 str = sc.nextLine();
			 if(str.equals("탈출")) {
				System.out.println("종료");
				break;
			 }else System.out.println(str);
		 }

	}

}
