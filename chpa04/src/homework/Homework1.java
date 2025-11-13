package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String price = "";
		
		if(age >= 65)  price = "무료";
		else if(age >= 19 && age<=64)  price = "30000";
		else if(age >= 3 && age<=12)  price = "10000";
		else price = "무료";
		
		System.out.println("당신의 놀이동산 요금은 : " + price + "입니다.");

	}

}
