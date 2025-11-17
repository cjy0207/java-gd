package homework;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int C = sc.nextInt();
		
		//early return pattern
		//에러나 예외 조건을 먼저 검사하고 처리 한 다음, 성공 케이스는 마지막에 처리하는 법
		//코드 중첩을 줄이고, 가독성이 좋아짐
		
		if(month == 3 || month == 4 || month == 5) System.out.print("봄");
		else if(month == 6 || month == 7 || month == 8) {
			System.out.print("여름 ");
			if(C>=35) System.out.print("폭염경보");
			else if(C>=33) System.out.print("폭염주의보");
		}else if(month == 9 || month == 10 || month == 11) System.out.print("가을");
		else if(month == 12 || month == 1 || month == 2) {
			System.out.print("겨울 ");
			if(C <= -15) System.out.print("한파경보");
			else if(C <= -12) System.out.print("한파주의보");
		}else System.out.print("해당하는 계절이 없습니다");
		
		
	}
}
