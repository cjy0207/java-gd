package homework;

import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		String a;
		char char1;
		
		while(true) {
			System.out.print("문자열 : ");
			str = sc.nextLine();
			System.out.print("문자 : ");
			char1 = sc.next().charAt(0);
			sc.nextLine();
			int count =0;
			for(int i=0; i<str.length();i++) {
				if(str.charAt(i)==char1) count++;
			}
			System.out.println("포함된 개수 : " + count);
			
			
			while (true) {
		        System.out.print("다시 입력하시겠습니까? : ");
		        a = sc.nextLine();

		        if (a.equals("Y") || a.equals("y")) break;
		        else if (a.equals("N") || a.equals("n")) return;
		        else System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
		    }
			
			
		}
		
		


	}

}
