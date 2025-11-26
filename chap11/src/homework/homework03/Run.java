package homework.homework03;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 : ");
		String email = sc.nextLine().trim();
		
		String goodee = "goodee.co.kr";
		
		String[] arr = email.split("@");
		
		if(!(arr[1].equals(goodee))) {
			System.out.println("유효하지않음");
			return;
		}
		
		String id = arr[0].toUpperCase();
		System.out.println(id);
		
		
		
		
	}

}
