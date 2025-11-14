package homework;

import java.util.Scanner;

public class Homework2 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("숫자 : ");
			num = sc.nextInt();
			if(num <0) {
				System.out.println("양수만 입력해주세요.");
				continue;
			}else if(num>9) {
				System.out.println("9이하의 수를 입력해주세요.");
				continue;
			}else if(num==0) return;
			
			
			for(;num<=9; num++) {
				System.out.println("***"+num+"단***");
				for(int i =1; i<=9; i++) {
					System.out.println(num+" * " + i + " = " + num*i);
				}
			}
		}
		
		
		
	}
}
