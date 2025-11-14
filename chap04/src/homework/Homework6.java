package homework;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("각 과목의 점수를 입력하세요.");
		
		System.out.print("sw 설계 점수 : ");
		int num1 = sc.nextInt();
		System.out.print("sw 개발 점수 : ");
		int num2 = sc.nextInt();
		System.out.print("db 구축 점수 : ");
		int num3 = sc.nextInt();
		System.out.print("프로그래밍언어 활용 점수 : ");
		int num4 = sc.nextInt();
		System.out.print("정보시스템 구축관리 점수 : ");
		int num5 = sc.nextInt();
		
		String fail = "";
		
		int avg = (num1 + num2 +num3 + num4+ num5) /5 ;
		
		if (num1 < 40) fail = "sw 설계 과락으로 불합격입니다.";
		else if (num2 < 40) fail = "sw 개발 과락으로 불합격입니다.";
		else if (num3 < 40) fail = "db 구축 과락으로 불합격입니다.";
		else if (num4 < 40) fail = "프로그래밍언어 활용 과락으로 불합격입니다.";
		else if (num5 < 40) fail = "정보시스템 구축관리 과락으로 불합격입니다.";

		if (fail.equals("") && avg < 60)
		    fail = "평균 점수 60점 미만으로 불합격입니다.";

		if (fail.equals("")) System.out.println("합격을 축하합니다.");
		else System.out.println(fail);
		
	}

}
