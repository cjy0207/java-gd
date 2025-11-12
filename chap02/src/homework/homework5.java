package homework;

import java.util.Scanner;

public class homework5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		float kor = sc.nextFloat();
		
		System.out.print("영어 : ");
		float eng = sc.nextFloat();
		
		System.out.print("수학 : ");
		float math = sc.nextFloat();
		
		int total = (int)(kor + eng + math);
		int avg = total/3;
		System.out.printf("총점 : %d\n평균: %d", total, avg);
		
		
	}

}
