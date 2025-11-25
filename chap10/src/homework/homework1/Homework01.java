package homework.homework1;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int target = (int)(Math.random() * 50) + 1;
		int count = 0;
		
		while(true) {
			try {
				System.out.println("1-50꺄지의 수 : ");
		        int num = sc.nextInt();
		        count++;
		        
		        if(num==target) { System.out.println("정답입니다. 총 시도 횟수 : " + count); break; }
		        else if (num < target) System.out.println("Up");
		        else if (num > target) System.out.println("Down");
				
			} catch (Exception e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요");
				sc.nextLine();
			}
		}
		

	}

}
