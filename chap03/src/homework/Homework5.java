package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호(-) : ");
		String str = sc.nextLine();
		
		String result = (str.charAt(7)== '1' || str.charAt(7)== '3') 
				? "입력하신 주민번호는 남자입니다" 
				: ((str.charAt(7)== '2' || str.charAt(7)== '4')
						? "입력하신 주민번호는 남자입니다" : "잘못된 주민번호입니다.");
		
		System.out.print(result);

	}

}
